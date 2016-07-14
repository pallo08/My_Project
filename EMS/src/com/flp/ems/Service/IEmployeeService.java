package com.flp.ems.Service;

import java.util.HashMap;

import com.flp.ems.domain.Employee;

public interface IEmployeeService {


	public void ModifyEmployee();
	public void RemoveEmployee(int x,Employee emp);
	public void getAllEmployee();
	public void SearchEmployee(int id);
	public void addEmployee(HashMap<String, Object> emp);
}
