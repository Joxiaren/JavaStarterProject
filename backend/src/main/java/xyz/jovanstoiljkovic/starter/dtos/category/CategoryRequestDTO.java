package xyz.jovanstoiljkovic.starter.dtos.category;

import java.util.ArrayList;
import java.util.List;

import xyz.jovanstoiljkovic.starter.dtos.BaseDTO;
import xyz.jovanstoiljkovic.starter.dtos.menu.MenuRequestDTO;
import xyz.jovanstoiljkovic.starter.models.Category;

public class CategoryRequestDTO extends BaseDTO<Category> {
	
	private String name;
	
	private List<MenuRequestDTO> menus = new ArrayList<MenuRequestDTO>();

	public CategoryRequestDTO() {
		super();
	}

	public CategoryRequestDTO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MenuRequestDTO> getMenus() {
		return menus;
	}

	public void setMenus(List<MenuRequestDTO> menus) {
		this.menus = menus;
	}
	
}
