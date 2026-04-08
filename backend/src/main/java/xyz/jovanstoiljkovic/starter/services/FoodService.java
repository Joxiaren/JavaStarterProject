package xyz.jovanstoiljkovic.starter.services;

import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

import org.springframework.stereotype.Service;

import xyz.jovanstoiljkovic.starter.models.Food;

@Service
public class FoodService extends BaseService<Food>{

    public FoodService(CrudRepository<Food, Integer> repo) {
        super(repo);
    }

	@Override
	public Optional<Food> updatePatch(Long id, Food item) {
		Optional<Food> op = repo.findById(id);

		if (op.isEmpty())
			return op;

		Food entity = op.get();

		if (item.getName() != null)
			entity.setName(item.getName());
		if (item.getCalories() != null)
			entity.setCalories(item.getCalories());
		if (item.getIngredientCount() != null)
			entity.setIngredientCount(item.getIngredientCount());
		if (item.getExpiryDate() != null)
			entity.setExpiryDate(item.getExpiryDate());

		repo.save(entity);
		return Optional.of(entity);
	}
	
}
