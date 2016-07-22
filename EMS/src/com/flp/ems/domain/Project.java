package com.flp.ems.domain;

public class Project {

	int Prjectid;

	int depid;

	private String prjname,description;

	public Department dept;
	
	public void setPrjectid(int pid) {
		Prjectid = pid;
	}

	public void setPrjname(String prjname) {
		this.prjname = prjname;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public void setDept(Department dept) {
		this.dept = dept;
	}

	public void setDepid(int depid) {
		this.depid = dept.getDeptid();;
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

	
	public Department getDept() {
		return dept;
	}

	public int getDepid() {
		return depid;
	}

	@Override
	public String toString() {
		return "Project: Prjectid=" + Prjectid + ", prjname=" + prjname + ", description=" + description + "]";
	}

	



	
	
}