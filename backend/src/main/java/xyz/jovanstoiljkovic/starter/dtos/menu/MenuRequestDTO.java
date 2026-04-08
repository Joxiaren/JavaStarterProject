package xyz.jovanstoiljkovic.starter.dtos.menu;

import xyz.jovanstoiljkovic.starter.dtos.BaseDTO;
import xyz.jovanstoiljkovic.starter.dtos.category.CategoryRequestDTO;
import xyz.jovanstoiljkovic.starter.dtos.food.FoodRequestDTO;
import xyz.jovanstoiljkovic.starter.models.Menu;

public class MenuRequestDTO extends BaseDTO<Menu> {

	private Long version;
	
	private FoodRequestDTO food;
	private CategoryRequestDTO category;
	
	public MenuRequestDTO() {
		super();
	}

	public MenuRequestDTO(Long version, FoodRequestDTO food, CategoryRequestDTO category) {
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

	public FoodRequestDTO getFood() {
		return food;
	}

	public void setFood(FoodRequestDTO food) {
		this.food = food;
	}

	public CategoryRequestDTO getCategory() {
		return category;
	}

	public void setCategory(CategoryRequestDTO category) {
		this.category = category;
	}
	
}
