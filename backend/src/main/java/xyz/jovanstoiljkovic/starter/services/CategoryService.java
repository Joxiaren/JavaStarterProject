package xyz.jovanstoiljkovic.starter.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import xyz.jovanstoiljkovic.starter.models.Category;

@Service
public class CategoryService extends BaseService<Category> {

	@Override
	public Optional<Category> updatePatch(Long id, Category item) {
		Optional<Category> op = repo.findById(id);
		
		if (op.isEmpty())
			return op;
		
		Category entity = op.get();
		
		if (item.getName() != null) {
			entity.setName(item.getName());
		}
		
		repo.save(entity);
		return Optional.of(entity);
	}

}
