package com.flp.ems.Dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;


public class EmployeeDaoImplForList implements IemployeeDao {

	List<Employee> emps=new ArrayList<Employee>();
	List<Department> dep=new ArrayList<Department>();
	List<Project> pr=new ArrayList<Project>();
	List<Role> ro=new ArrayList<Role>();
	Scanner sc = new Scanner(System.in);

	public void addEmployee(Employee emp) {
		if(!emps.contains(emp))
		emps.add(emp);
		dep.add(emp.getDepartment());
		pr.add(emp.getProject());
		ro.add(emp.getRole());
		System.out.println("Employee added successfully");
	}
	
	public void ModifyEmployee(String name, String email, String kin_id) {
		for(Employee emply:emps)
		{		
	if((emply.getEmail().equals(email))||(emply.getName().equals(name))||(emply.getName().equals(name) && emply.getEmail().equals(email))||(emply.getKinid().equals(kin_id))||(emply.getName().equals(name) && emply.getEmail().equals(email))||(emply.getKinid().equals(kin_id) && emply.getName().equals(name))||(emply.getKinid().equals(kin_id) && emply.getName().equals(name) && emply.getEmail().equals(email))){
			
			System.out.println("enter the new name of an employee:");
			String name1=sc.next();
			emply.setName(name1);
			System.out.println("enter the new phone no of an employee:");
			String phone_no=sc.next();
			emply.setPhone(phone_no);
			System.out.println("enter the new address of an employee:");
			String address=sc.next();
			emply.setAddress(address);
			System.out.println("enter the new date of birth of an employee:");
			String dateofbirth=sc.next();
			emply.setDob(dateofbirth);
			System.out.println("enter the new date of joining of an employee:");
			String j_date=sc.next();
			emply.setDoj(j_date);
			System.out.println("enter the new email_id of an employee:");
			String email_id=sc.next();
			emply.setEmail(email_id);
			System.out.println(emps);
			
		}
		
		else{
			System.out.println("No such employee found");
		}	
		}
	}

	public boolean RemoveEmployee(String empId) {
		
		for (Employee emp : emps) {
			if (emp.getKinid().equals(empId)){
				emps.remove(emp);
				return true;
			}
		}
		return false;
	}

	public List<Employee> getAllEmployee() {
		
		if(emps.isEmpty())
		return null;
		return emps;
		}

	public void SearchEmployee(String id,String name,String email) {

		 for(Employee emp : emps){
		        if((emp.getKinid().equals(id))||(emp.getName().equals(name))||(emp.getEmail().equals(email))||((emp.getKinid().equals(id))&&(emp.getName().equals(name)))||((emp.getKinid().equals(id))&&(emp.getEmail().equals(email)))||((emp.getName().equals(name))&&(emp.getEmail().equals(email)))||((emp.getKinid().equals(id))&&(emp.getName().equals(name))&&(emp.getEmail().equals(email))))
		        {
		        	System.out.println("Employee  found");
					System.out.println(emp.toString());
		        }
		        else{
		        	System.out.println("Employee not found");
		        	break;
		        }
		  }
	}



}
