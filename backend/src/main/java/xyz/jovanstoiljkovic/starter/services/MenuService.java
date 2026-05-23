package xyz.jovanstoiljkovic.starter.services;

import org.springframework.stereotype.Service;

import xyz.jovanstoiljkovic.starter.models.Menu;
import xyz.jovanstoiljkovic.starter.repositories.MenuRepository;

@Service
public class MenuService extends BaseService<Menu> {

	public MenuService(MenuRepository repo) {
		super(repo);
	}

}
