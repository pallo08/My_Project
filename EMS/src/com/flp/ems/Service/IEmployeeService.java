package com.flp.ems.Service;

import java.util.HashMap;
import java.util.Map;

import com.flp.ems.domain.Employee;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public interface IEmployeeService {


	public boolean RemoveEmployee(String empId);
	public java.util.List<Employee> getAllEmployee();
	public void SearchEmployee(String id,String name,String email);
	public void addEmployee(HashMap<String, Object> emp);
	public void ModifyEmployee(String name,String email,String kin_id);
}
