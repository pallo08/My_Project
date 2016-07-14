package com.flp.ems.domain;

public class Role {

	int roleid;
	private String name,description;

	
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public void setName(String name) {
		this.name = "Manager";
	}

	public void setDescription(String description) {
		this.description = "description";
	}

	public int getRoleid() {
		return roleid;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	
	
}
