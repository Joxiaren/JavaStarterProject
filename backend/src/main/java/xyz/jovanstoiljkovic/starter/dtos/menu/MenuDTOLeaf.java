package xyz.jovanstoiljkovic.starter.dtos.menu;

import xyz.jovanstoiljkovic.starter.dtos.BaseDTO;
import xyz.jovanstoiljkovic.starter.models.Menu;

public class MenuDTOLeaf extends BaseDTO<Menu> {
	
	private Long id;
	private Long version;
	
	public MenuDTOLeaf() {
		super();
	}

	public MenuDTOLeaf(Long id, Long version) {
		super();
		this.id = id;
		this.version = version;
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
	
}
