package xyz.jovanstoiljkovic.starter.dtos.category;

import java.util.ArrayList;
import java.util.List;

import xyz.jovanstoiljkovic.starter.dtos.BaseDTO;
import xyz.jovanstoiljkovic.starter.dtos.menu.MenuResponseDTOLeaf;
import xyz.jovanstoiljkovic.starter.models.Category;

public class CategoryResponseDTO extends BaseDTO<Category> {

	private Long id;
	private String name;
	private List<MenuResponseDTOLeaf> menus = new ArrayList<MenuResponseDTOLeaf>();
	
	public CategoryResponseDTO() {
		super();
	}

	public CategoryResponseDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public CategoryResponseDTO(Long id, String name, List<MenuResponseDTOLeaf> menus) {
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

	public List<MenuResponseDTOLeaf> getMenus() {
		return menus;
	}

	public void setMenus(List<MenuResponseDTOLeaf> menus) {
		this.menus = menus;
	}
	
}
