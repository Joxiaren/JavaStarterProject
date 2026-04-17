package xyz.jovanstoiljkovic.starter.dtos.category;

import java.util.ArrayList;
import java.util.List;

import xyz.jovanstoiljkovic.starter.dtos.BaseDTO;
import xyz.jovanstoiljkovic.starter.dtos.menu.MenuDTOLeaf;
import xyz.jovanstoiljkovic.starter.models.Category;

public class CategoryDTO extends BaseDTO<Category> {

	private Long id;
	private String name;
	private List<MenuDTOLeaf> menus = new ArrayList<MenuDTOLeaf>();
	
	public CategoryDTO() {
		super();
	}

	public CategoryDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public CategoryDTO(Long id, String name, List<MenuDTOLeaf> menus) {
		super();
		this.id = id;
		this.name = name;
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

	public List<MenuDTOLeaf> getMenus() {
		return menus;
	}

	public void setMenus(List<MenuDTOLeaf> menus) {
		this.menus = menus;
	}
	
}
