package com.flp.ems.domain;

public class Role {

	int roleid;
	private String name,description;

	
	public void setRoleid(int rid) {
		this.roleid = rid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@Override
	public String toString() {
		return "Role [ roleid=" + roleid + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
}
