package xyz.jovanstoiljkovic.starter.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import xyz.jovanstoiljkovic.starter.models.Menu;

@Service
public class MenuService extends BaseService<Menu> {

	public MenuService(CrudRepository<Menu, Long> repo) {
		super(repo);
	}

}
