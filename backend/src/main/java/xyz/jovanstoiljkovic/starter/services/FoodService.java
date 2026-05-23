package xyz.jovanstoiljkovic.starter.services;

import org.springframework.stereotype.Service;

import xyz.jovanstoiljkovic.starter.models.Food;
import xyz.jovanstoiljkovic.starter.repositories.FoodRepository;

@Service
public class FoodService extends BaseService<Food>{

	public FoodService(FoodRepository repo) {
		super(repo);
	}
	
}
