package xyz.jovanstoiljkovic.starter.services;

import org.springframework.stereotype.Service;

import xyz.jovanstoiljkovic.starter.models.Category;
import xyz.jovanstoiljkovic.starter.repositories.CategoryRepository;

@Service
public class CategoryService extends BaseService<Category> {

	public CategoryService(CategoryRepository repo) {
		super(repo);
	}

}
