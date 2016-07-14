package com.flp.ems.Service;

import java.util.HashMap;

import com.flp.ems.Dao.IemployeeDao;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;
import com.sun.javafx.collections.MappingChange.Map;

public class EmployeeServiceImpl implements IEmployeeService {

	Employee employee = new Employee();
	Department d= new Department();
	Role r =new Role();
	Project p = new Project();
	IemployeeDao emp_dao;
	
	@Override
	public void addEmployee(HashMap emp) {
		employee.setKinid((Integer) emp.get("kin_id"));
		employee.setName((String) emp.get("name"));

		d.setDeptid((Integer) emp.get("deptid"));
		//d.setName((String) emp.get("name"));

		employee.setDepartment(d);

		p.setPrjectid((Integer) emp.get("project_id"));
		//p.setPrjname((String) emp.get("name"));

		employee.setProject(p);

		r.setRoleid((Integer) emp.get("role_id"));
		//r.setName((String) emp.get("name"));

		employee.setRole(r);

		emp_dao.addEmployee(employee);  
	}
	
	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}


	public void RemoveEmployee(int x,Employee emp) {
		// TODO Auto-generated method stub
		emp_dao.RemoveEmployee(x,emp);
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void SearchEmployee(int id) {
		emp_dao.SearchEmployee(id);
		
	}

}
