package xyz.jovanstoiljkovic.starter.dtos.food;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import xyz.jovanstoiljkovic.starter.dtos.BaseDTO;
import xyz.jovanstoiljkovic.starter.dtos.menu.MenuDTOLeaf;
import xyz.jovanstoiljkovic.starter.models.Food;

public class FoodDTO extends BaseDTO<Food> {
	private Long id;
	private String name;
	private Double calories;
	private Integer ingredientCount;
	private Date expiryDate;
	
	private List<MenuDTOLeaf> menus = new ArrayList<MenuDTOLeaf>();

	public FoodDTO() {
		super();
	}

	public FoodDTO(Long id, String name, Double calories, Integer ingredientCount, Date expiryDate) {
		super();
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.ingredientCount = ingredientCount;
		this.expiryDate = expiryDate;
	}

	public FoodDTO(Long id, String name, Double calories, Integer ingredientCount, Date expiryDate, List<MenuDTOLeaf> menus) {
		super();
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.ingredientCount = ingredientCount;
		this.expiryDate = expiryDate;
		this.menus = menus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<MenuDTOLeaf> getMenus() {
		return menus;
	}

	public void setMenus(List<MenuDTOLeaf> menus) {
		this.menus = menus;
	}
	
}
