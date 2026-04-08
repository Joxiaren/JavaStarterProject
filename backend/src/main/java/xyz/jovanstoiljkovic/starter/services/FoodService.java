package xyz.jovanstoiljkovic.starter.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import xyz.jovanstoiljkovic.starter.models.Food;

@Service
public class FoodService extends BaseService<Food>{

    public FoodService(CrudRepository<Food, Long> repo) {
        super(repo);
    }
	
}
