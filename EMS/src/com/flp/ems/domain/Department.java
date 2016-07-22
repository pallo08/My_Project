package com.flp.ems.domain;



public class Department {

	private String dname,description;
	int deptid;

	

	

	public void setDname(String dname) {
		this.dname = dname;
	}





	public void setDescription(String description) {
		this.description = description;
	}





	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}





	public String getDname() {
		return dname;
	}





	public String getDescription() {
		return description;
	}





	public int getDeptid() {
		return deptid;
	}





	@Override
	public String toString() {
		return "Department: dname=" + dname + ", description=" + description + ", deptid=" + deptid + "]";
	}
	
	
}
