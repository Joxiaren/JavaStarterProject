package xyz.jovanstoiljkovic.starter.dtos.menu;

import xyz.jovanstoiljkovic.starter.dtos.BaseDTO;
import xyz.jovanstoiljkovic.starter.dtos.category.CategoryDTO;
import xyz.jovanstoiljkovic.starter.dtos.food.FoodDTO;
import xyz.jovanstoiljkovic.starter.models.Menu;

public class MenuRequestDTO extends BaseDTO<Menu> {

	private Long version;
	
	private FoodDTO food;
	private CategoryDTO category;
	
	public MenuRequestDTO() {
		super();
	}

	public MenuRequestDTO(Long version, FoodDTO food, CategoryDTO category) {
		super();
		this.version = version;
		this.food = food;
		this.category = category;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public FoodDTO getFood() {
		return food;
	}

	public void setFood(FoodDTO food) {
		this.food = food;
	}

	public CategoryDTO getCategory() {
		return category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}
	
}
