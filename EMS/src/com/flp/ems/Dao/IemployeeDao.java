package com.flp.ems.Dao;

import java.util.HashMap;
import java.util.List;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {

	
	public void ModifyEmployee(String name,String email,String kin_id);
	public boolean RemoveEmployee(String empId);
	public List<Employee> getAllEmployee();
	public void SearchEmployee(String id,String name,String email);
	public void addEmployee(Employee emp);
	
}
