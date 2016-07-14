package com.flp.ems.Dao;

import java.util.HashMap;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {

	//public void addEmployee(HashMap<String, Object> emp);
	public void ModifyEmployee();
	public void RemoveEmployee(int x,Employee emp);
	public void getAllEmployee();
	public void SearchEmployee(int id);
	void addEmployee(Employee emp);
	
}
