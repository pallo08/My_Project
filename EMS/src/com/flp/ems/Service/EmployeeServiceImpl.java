package com.flp.ems.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import com.flp.ems.Dao.EmployeeDaoImplForList;
import com.flp.ems.Dao.IemployeeDao;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;
import com.flp.ems.util.Validate;

import java.util.List;
import java.util.Set;

public class EmployeeServiceImpl implements IEmployeeService {
    
	IemployeeDao emp_dao;
	Validate vd = new Validate();
	HashSet<String> hskin=new HashSet<String>();
	HashSet<String> hsemail=new HashSet<String>();
	
	public EmployeeServiceImpl(){
		emp_dao=new EmployeeDaoImplForList();
	}
	
	@Override
	public void addEmployee(HashMap emp) {
		Employee employee = new Employee();
		Department d= new Department();
		Role r =new Role();
		Project p = new Project();
		
		employee.setEmpid((int) emp.get("jobId"));
		employee.setKinid((String) emp.get("kin_id"));
		employee.setName((String) emp.get("name"));
		employee.setEmail((String) emp.get("email_id"));
		employee.setAddress((String) emp.get("address"));
		employee.setDob((String) emp.get("dob"));
		employee.setDoj((String) emp.get("doj"));
		employee.setPhone((String) emp.get("phone_no"));
		d.setDeptid((int) emp.get("dept_id"));
		d.setDname((String) emp.get("dept_name"));
		d.setDescription((String) emp.get("dept_desc"));
		employee.setDepartment(d);
		p.setPrjectid((int) emp.get("project_id"));
		p.setPrjname((String) emp.get("project_name"));
		p.setDescription((String) emp.get("project_desc"));
		employee.setProject(p);
		r.setRoleid((int) emp.get("role_id"));
		r.setName((String) emp.get("role_name"));
		r.setDescription((String) emp.get("role_desc"));
		employee.setRole(r);
		
		if(hskin.contains(emp.get("kin_id"))){
			System.out.println("Employee with this kinid already exist");
			return;
		}
		else{
			hskin.add((String) emp.get("kin_id"));
		}
		if(hsemail.contains(emp.get("email_id"))){
			System.out.println("Employee with this emailid already exist");
			return;
		}
		else{
			hsemail.add((String) emp.get("email_id"));
		}
	 emp_dao.addEmployee(employee);
	}
	
	public void ModifyEmployee(String name, String email, String kin_id) {
		
		emp_dao.ModifyEmployee(name,email,kin_id);
		
	}

	public boolean RemoveEmployee(String empId) {
		
		return emp_dao.RemoveEmployee(empId);
			
		}

	public List<Employee> getAllEmployee() {
		
		return (List<Employee>) emp_dao.getAllEmployee();
			
		}

	public void SearchEmployee(String id,String name,String email) {
		
		emp_dao.SearchEmployee(id,name,email);
		
	}



}
