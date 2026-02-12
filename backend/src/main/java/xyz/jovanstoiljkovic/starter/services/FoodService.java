package xyz.jovanstoiljkovic.starter.services;

import org.springframework.stereotype.Service;
import xyz.jovanstoiljkovic.starter.models.Food;

import java.util.Optional;

@Service
public class FoodService extends BaseService<Food>{
    @Override
    public Optional<Food> update(int id, Food item){
        Optional<Food> opFood = repo.findById(id);

        if(opFood.isEmpty()) return opFood;

        Food food = opFood.get();

        if(item.getName() != null) food.setName(item.getName());
        if(item.getCalories() != null) food.setCalories(item.getCalories());
        if(item.getIngredientCount() != null) food.setIngredientCount(item.getIngredientCount());
        if(item.getExpiryDate() != null) food.setExpiryDate(item.getExpiryDate());

        repo.save(food);
        return Optional.of(food);
    }
}
