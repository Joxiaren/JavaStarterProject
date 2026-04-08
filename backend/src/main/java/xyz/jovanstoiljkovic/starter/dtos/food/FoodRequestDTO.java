package xyz.jovanstoiljkovic.starter.dtos.food;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import xyz.jovanstoiljkovic.starter.dtos.BaseDTO;
import xyz.jovanstoiljkovic.starter.dtos.menu.MenuRequestDTO;
import xyz.jovanstoiljkovic.starter.models.Food;

public class FoodRequestDTO extends BaseDTO<Food> {
	private String name;
	private Double calories;
	private Integer ingredientCount;
	private Date expiryDate;
	
	private List<MenuRequestDTO> menus = new ArrayList<MenuRequestDTO>();

	public FoodRequestDTO() {
		super();
	}

	public FoodRequestDTO(String name, Double calories, Integer ingredientCount, Date expiryDate) {
		super();
		this.name = name;
		this.calories = calories;
		this.ingredientCount = ingredientCount;
		this.expiryDate = expiryDate;
	}
	
	public FoodRequestDTO(String name, Double calories, Integer ingredientCount, Date expiryDate,
			List<MenuRequestDTO> menus) {
		super();
		this.name = name;
		this.calories = calories;
		this.ingredientCount = ingredientCount;
		this.expiryDate = expiryDate;
		this.menus = menus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCalories() {
		return calories;
	}

	public void setCalories(Double calories) {
		this.calories = calories;
	}

	public Integer getIngredientCount() {
		return ingredientCount;
	}

	public void setIngredientCount(Integer ingredientCount) {
		this.ingredientCount = ingredientCount;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public List<MenuRequestDTO> getMenus() {
		return menus;
	}

	public void setMenus(List<MenuRequestDTO> menus) {
		this.menus = menus;
	}
	
}
