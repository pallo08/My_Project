package com.flp.ems.domain;

public class Employee {

	public Department department;
	public Project project;
	public Role role;
	
	private String name,email,address,phone,dob,doj;
	int kinid;
	
	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public void setRole(Role role) {
		this.role = role;
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

	public int getKinid() {
		return kinid;
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

	public void setName(String name) {
		this.name = name;
	}

	public void setKinid(int kinid) {
		this.kinid = kinid;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		/*result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((doj == null) ? 0 : doj.hashCode());*/
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + kinid;
		/*result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((project == null) ? 0 : project.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());*/
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		/*if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (doj == null) {
			if (other.doj != null)
				return false;
		} else if (!doj.equals(other.doj))
			return false;*/
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (kinid != other.kinid)
			return false;
		/*if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (project == null) {
			if (other.project != null)
				return false;
		} else if (!project.equals(other.project))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;*/
		return true;
	}

	
	
	
}
