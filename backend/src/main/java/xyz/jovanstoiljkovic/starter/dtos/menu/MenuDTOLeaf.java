package xyz.jovanstoiljkovic.starter.dtos.menu;

import xyz.jovanstoiljkovic.starter.dtos.BaseDTO;
import xyz.jovanstoiljkovic.starter.dtos.category.CategoryDTOLeaf;
import xyz.jovanstoiljkovic.starter.dtos.food.FoodDTOLeaf;
import xyz.jovanstoiljkovic.starter.models.Menu;

public class MenuDTOLeaf extends BaseDTO<Menu> {
	
	private Long id;
	private Long version;
	
	private FoodDTOLeaf food;
	private CategoryDTOLeaf category;
	
	public MenuDTOLeaf() {
		super();
	}

	public MenuDTOLeaf(Long id, Long version, FoodDTOLeaf food, CategoryDTOLeaf category) {
		super();
		this.id = id;
		this.version = version;
		this.food = food;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public FoodDTOLeaf getFood() {
		return food;
	}

	public void setFood(FoodDTOLeaf food) {
		this.food = food;
	}

	public CategoryDTOLeaf getCategory() {
		return category;
	}

	public void setCategory(CategoryDTOLeaf category) {
		this.category = category;
	}
	
}
