package com.flp.ems.domain;

public class Project {

	int Prjectid;

	private String prjname,description;

	int deptid;
	
	Department d = new Department();

	public void setPrjectid(int prjectid) {
		Prjectid = prjectid;
	}

	public void setPrjname(String prjname) {
		this.prjname = "java";
	}

	public void setDescription(String description) {
		this.description = "prj_description";
	}

	public void setDeptid(String deptid) {
		this.deptid = d.getDeptid();
	}

	public int getPrjectid() {
		return Prjectid;
	}

	public String getPrjname() {
		return prjname;
	}

	public String getDescription() {
		return description;
	}

	public int getDeptid() {
		return deptid;
	}

	
	
}