package com.flp.ems.domain;

public class Department {

	private String name,description;
	int deptid;

	public void setName(String name) {
		this.name = "FS";
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public int getDeptid() {
		return deptid;
	}

	public String getDescription() {
		return description;
	}

	public void setDeptid(int deptid) {
		// TODO Auto-generated method stub
		this.deptid = deptid;
	}
	
	
}
