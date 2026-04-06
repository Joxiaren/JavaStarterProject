package xyz.jovanstoiljkovic.starter.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu extends BaseEntity {

	@Column(nullable = false)
	private Long version;
	
	@ManyToOne(optional = false)
	private Food food;
	@ManyToOne(optional = false)
	private Category category;
	
	public Menu() {
		super();
	}
	public Menu(Long id) {
		super(id);
	}
	public Menu(Long version, Food food, Category category) {
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
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
