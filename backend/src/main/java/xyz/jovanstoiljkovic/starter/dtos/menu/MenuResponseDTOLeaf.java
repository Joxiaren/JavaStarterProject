package xyz.jovanstoiljkovic.starter.dtos.menu;

import xyz.jovanstoiljkovic.starter.dtos.BaseDTO;
import xyz.jovanstoiljkovic.starter.dtos.category.CategoryResponseDTOLeaf;
import xyz.jovanstoiljkovic.starter.dtos.food.FoodResponseDTOLeaf;
import xyz.jovanstoiljkovic.starter.models.Menu;

public class MenuResponseDTOLeaf extends BaseDTO<Menu> {
	
	private Long id;
	private Long version;
	
	private FoodResponseDTOLeaf food;
	private CategoryResponseDTOLeaf category;
	
	public MenuResponseDTOLeaf() {
		super();
	}

	public MenuResponseDTOLeaf(Long id, Long version, FoodResponseDTOLeaf food, CategoryResponseDTOLeaf category) {
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

	public FoodResponseDTOLeaf getFood() {
		return food;
	}

	public void setFood(FoodResponseDTOLeaf food) {
		this.food = food;
	}

	public CategoryResponseDTOLeaf getCategory() {
		return category;
	}

	public void setCategory(CategoryResponseDTOLeaf category) {
		this.category = category;
	}
	
}
