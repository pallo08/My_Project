package com.flp.ems.Dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;


public class EmployeeDaoImplForList implements IemployeeDao {

	ArrayList<Employee> employee=new ArrayList<Employee>();
	ArrayList<Department> dep=new ArrayList<Department>();
	ArrayList<Project> pr=new ArrayList<Project>();
	ArrayList<Role> ro=new ArrayList<Role>();
	
	

	public void addEmployee(Employee emp) {
		employee.add(emp);
		dep.add(emp.getDepartment());
		pr.add(emp.getProject());
		ro.add(emp.getRole());
	}
	
	
	

	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}


	public void RemoveEmployee(int x,Employee emp) {
		// TODO Auto-generated method stub
		for (Employee e : employee) {
		       if (e.getKinid()==x){
		          emp=null;
		          System.out.println("employee removed successfully with kin_id:"+x);
		         break; 
		         
		       }

		      
		  }
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}


	public void SearchEmployee(int id) {

		 for(Employee e : employee) {
		        if(e.getKinid() == id)
		        {
		           System.out.println("found");
		        }
		        else
		        {
		        	System.out.println("not found");
		        }
		    }
	}




	

	

}
