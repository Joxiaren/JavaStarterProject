package xyz.jovanstoiljkovic.starter.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category extends BaseEntity {
	
	@Column(nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "category")
	private List<Menu> menus = new ArrayList<Menu>();

	public Category() {
		super();
	}
	public Category(Long id) {
		super(id);
	}
	public Category(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Menu> getMenus() {
		return menus;
	}
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
}
