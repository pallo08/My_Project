package com.flp.ems.view;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.flp.ems.Service.EmployeeServiceImpl;
import com.flp.ems.Service.IEmployeeService;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;
import com.flp.ems.util.Validate;
public class UserInteraction {

	HashMap<String, Object> emp = new HashMap<String, Object>();
	Scanner sc=new Scanner(System.in);
	Employee e = new Employee();
	Role r = new Role();
	Project p = new Project();
	Department d= new Department();
	IEmployeeService iemp;
	
	
	public UserInteraction() {
		iemp=new EmployeeServiceImpl();
	}




	public void AddEmployee(){
		
		String name,email,address,phone;
		String dob,doj;
		int roleid,deptid,prjid;
		int kinid;
		Validate vd=new Validate();
		
		System.out.println("Enter the name of an employee :");
		name=sc.next();
		emp.put("name",name);
		
		System.out.println("Enter the kin_id of an employee :");
		kinid=sc.nextInt();
		emp.put("kin_id",kinid);
		
		System.out.println("Enter the email_id of an employee :");
		email=sc.next();
		emp.put("email_id",email);
		
		System.out.println("Enter the phone number of an employee :");
		phone=sc.next();
		emp.put("phone_no",phone);
		
		System.out.println("Enter the address of an employee :");
		address=sc.next();
		emp.put("address",address);
		
		System.out.println("Enter the date of birth of an employee :");
		dob=sc.next();
		boolean fb=vd.valid_Date(dob);
		emp.put("dob",dob);
		
		System.out.println("Enter the date of joining of an employee :");
		doj=sc.next();
		boolean fj=vd.valid_Date(doj);
		emp.put("doj",doj);
		
		System.out.println("Enter the project_id of an employee :");
		prjid=sc.nextInt();
		emp.put("project_id",prjid);
		
		System.out.println("Enter the dept_id of an employee :");
		deptid=sc.nextInt();
		emp.put("deptid",deptid);
		
		System.out.println("Enter the role_id of an employee :");
		roleid=sc.nextInt();
		emp.put("role_id",roleid);
		
	
		iemp.addEmployee(emp);
	}
	
	
	
	
	public void ModifyEmployee(){
		
	}
	
	public void RemoveEmployee(){
		
	}
	
	public void SearchEmployee(){
		
	}
	
	public void getAllEmployee(){
		
	}
}
