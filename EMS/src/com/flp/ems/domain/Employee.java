package com.flp.ems.domain;

public class Employee {

	public Department department;
	public Project project;
	public Role role;
	
	
	private String name,email,address,phone,dob,doj;
	String kinid;
	int empid;
	
	
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public void setKinid(String kinid) {
		this.kinid = kinid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
	public Department getDepartment() {
		return department;
	}
	public Project getProject() {
		return project;
	}
	public Role getRole() {
		return role;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public String getDob() {
		return dob;
	}
	public String getDoj() {
		return doj;
	}
	public String getKinid() {
		return kinid;
	}
	public int getEmpid() {
		return empid;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result= prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((kinid == null) ? 0 : kinid.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (kinid == null) {
			if (other.kinid != null)
				return false;
		} else if (!kinid.equals(other.kinid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [department=" + department + ", project=" + project + ", role=" + role + ", empid=" + empid+ ", name=" + name
				+ ", email=" + email + ", address=" + address + ", phone=" + phone + ", dob=" + dob + ", doj=" + doj
				+ ", kinid=" + kinid  + "]\n";
	}
	
	
}