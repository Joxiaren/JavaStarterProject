package xyz.jovanstoiljkovic.starter.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import xyz.jovanstoiljkovic.starter.models.Category;

@Service
public class CategoryService extends BaseService<Category> {

	public CategoryService(CrudRepository<Category, Long> repo) {
		super(repo);
	}

}
