package xyz.jovanstoiljkovic.starter.dtos.category;

import xyz.jovanstoiljkovic.starter.dtos.BaseDTO;
import xyz.jovanstoiljkovic.starter.models.Category;

public class CategoryResponseDTOLeaf extends BaseDTO<Category> {

	private Long id;
	private String name;
	
	public CategoryResponseDTOLeaf() {
		super();
	}

	public CategoryResponseDTOLeaf(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
}
