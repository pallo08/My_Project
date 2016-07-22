package com.flp.ems.view;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
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
	private static final AtomicInteger count = new AtomicInteger(10000); 
	int jobID;
	IEmployeeService iemp=new EmployeeServiceImpl();
	
	public void AddEmployee(){
		
		String name,email,address,phone;
		String dob,doj;
		String roleid,deptid,prjid;
		int empid=1;
		String kinid;
		boolean flag;
		String deptname,deptdesc;
		String rolename,roledesc;
		String projname,projdesc;
		Validate vd=new Validate();
		

		jobID = count.incrementAndGet(); 
		emp.put("jobId",jobID);
		
		do{
		System.out.println("Enter the name of an employee :");
		name=sc.next();
		flag=vd.validateName(name);
		if(flag){
		emp.put("name",name);
		}
		else{
			System.out.println("Error! Please enter the correct name......");
		}
		}while(flag==false);
		do{
		System.out.println("Enter the kin_id of an employee :");
		kinid=sc.next();
		flag=vd.validateKinid(kinid);
		if(flag){
			emp.put("kin_id",kinid);
			}
			else{
				System.out.println("Error! Please enter the correct Kin id......");
			}
		}while(flag==false);
		
		do{
		System.out.println("Enter the email_id of an employee :");
		email=sc.next();
		flag=vd.validateEmail(email);
		if(flag){
			emp.put("email_id",email);
			}
			else{
				System.out.println("Error! Please enter the correct email id......");
			}
		}while(flag==false);
		
		do{
		System.out.println("Enter the phone number of an employee :");
		phone=sc.next();
		flag=vd.validatephone(phone);
		if(flag){
			emp.put("phone_no",phone);
			}
			else{
				System.out.println("Error! Please enter the valid phone number......");
			}
		}while(flag==false);
		
		System.out.println("Enter the address of an employee :");
		address=sc.next();
		emp.put("address",address);
		
		do{
		System.out.println("Enter the date of birth of an employee :");
		dob=sc.next();
		flag=vd.valid_Date(dob);
		if(flag){
		emp.put("dob",dob);
		}
		else{
			System.out.println("Date is invalid.....Please enter the correct date");
		}
		}while(flag==false);
		
		do{
		System.out.println("Enter the date of joining of an employee :");
		doj=sc.next();
		flag=vd.valid_Date(doj);
		if(flag){
		emp.put("doj",doj);
		}
		else{
			System.out.println("Date is invalid.....Please enter the correct date");
		}
		}while(flag==false);
		
		System.out.println("Enter the Department\n1.ADM\n2.CARDS\n3.I&D\n4.TESTING");
		int c=sc.nextInt();
		String ddesc;
		switch(c){
		case 1:System.out.println("Into ADM");
		emp.put("dept_id", 1);
		emp.put("dept_name","ADM");
		System.out.println("Enter department description");
		ddesc=sc.next();
		emp.put("dept_desc",ddesc);
		break;
		case 2:System.out.println("Into CARDS");
		emp.put("dept_id", 2);
		emp.put("dept_name","CARDS");
		System.out.println("Enter department description");
		ddesc=sc.next();
		emp.put("dept_desc",ddesc);
		break;
		case 3:System.out.println("Into I&D");
		emp.put("dept_id", 3);
		emp.put("dept_name","I&D");
		System.out.println("Enter department description");
		ddesc=sc.next();
		emp.put("dept_desc",ddesc);
		break;
		case 4:System.out.println("Into TESTING");
		emp.put("dept_id", 4);
		emp.put("dept_name","TESTING");
		System.out.println("Enter department description");
		ddesc=sc.next();
		emp.put("dept_desc",ddesc);
		break;
		case 5:return;
		}
	
		System.out.println("Enter Project\n1.Morgan Stanley\n2.HSBC\n3Barclays");
		c=sc.nextInt();
		String pdesc;
		switch(c){
		case 1:emp.put("project_id", 1);
		emp.put("project_name","Morgan_Stanley");
		System.out.println("Enter project description");
		pdesc=sc.next();
		emp.put("project_desc",pdesc);
		break;
		case 2:emp.put("project_id", 2);
		emp.put("project_name","HSBC");
		System.out.println("Enter project description");
		pdesc=sc.next();
		emp.put("project_desc",pdesc);
		break;
		case 3:emp.put("project_id", 3);
		emp.put("project_name","Barclays");
		System.out.println("Enter project description");
		pdesc=sc.next();
		emp.put("project_desc",pdesc);
		break;
		case 4:return;
		}
		
		System.out.println("Enter Role\n1.Developer\n2.Tester\n3Database Developer");
		c=sc.nextInt();
		String rdesc;
		switch(c){
		case 1:emp.put("role_id", 1);
		emp.put("role_name", "Developer");
		System.out.println("Enter role description");
		rdesc=sc.next();
		emp.put("role_desc",rdesc);
		break;
		case 2:emp.put("role_id", 2);
		emp.put("role_name", "Tester");
		System.out.println("Enter role description");
		rdesc=sc.next();
		emp.put("role_desc",rdesc);
		break;
		case 3:emp.put("role_id", 3);
		emp.put("role_name", "Database_Developer");
		System.out.println("Enter role description");
		rdesc=sc.next();
		emp.put("role_desc",rdesc);
		break;
		case 4:return;
		
		}
		iemp.addEmployee(emp);
	}
	
	
	
	
	public void ModifyEmployee(){
		String email;
		String name;
		String kin_id;
		while(true){
			System.out.println("0 for modify by email_id:");
			System.out.println("1 for modify by name:");
			System.out.println("2 for modify by Kin_Id:");
			System.out.println("3 for modify by name and email_id:");
			System.out.println("4 for modify by name and Kin_id:");
			System.out.println("5 for modify by Kin_id and email_id:");
			System.out.println("6 for modify by name ,email_id and Kin_id:");
			System.out.println("option 7 for Exit");
			int i=sc.nextInt();
			
			switch(i){
			case 0: 
				System.out.println("enter the email to be removed:");
				 email=sc.next();
				iemp.ModifyEmployee(",", email,"");
				break;
			case 1:
				System.out.println("enter the name to be removed:");
				 name=sc.next();
				iemp.ModifyEmployee(name,"*","");
				break;
			case 2:
				System.out.println("enter the Kin_Id to be searched:");
				kin_id=sc.next();
				iemp.ModifyEmployee(",","*",kin_id);
				break;
			case 3:
				System.out.println("enter the name to be searched:");
				name=sc.next();
				System.out.println("enter the email to be searched:");
				email=sc.next();
				iemp.ModifyEmployee(name,email,"");
				break;
			case 4:
				System.out.println("enter the name to be searched:");
				name=sc.next();
				System.out.println("enter the kin_id to be searched:");
				kin_id=sc.next();
				iemp.ModifyEmployee(name,"",kin_id);
				break;
			case 5:
				System.out.println("enter the email to be searched:");
				email=sc.next();
				System.out.println("enter the kin_id to be searched:");
				kin_id=sc.next();
				iemp.ModifyEmployee("",email,kin_id);
				break;
			case 6:
				System.out.println("enter the name to be searched:");
				name=sc.next();
				System.out.println("enter the email to be searched:");
				email=sc.next();
				System.out.println("enter the kin_id to be searched:");
				kin_id=sc.next();
				iemp.ModifyEmployee(name,email,kin_id);
				break;
			case 7 : return;
			
			}
		}
	}
	
	public boolean RemoveEmployee(){
	System.out.println("kin_id");
	String empId;
	empId=sc.next();
	return iemp.RemoveEmployee(empId);
	}

	
	public void SearchEmployee(){
		while(true){
			System.out.println("0 for search by email_id:");
			System.out.println("1 for search by name:");
			System.out.println("2 for search by Kin_Id:");
			System.out.println("3 for search by name and email_id:");
			System.out.println("4 for search by name and Kin_id:");
			System.out.println("5 for search by Kin_id and email_id:");
			System.out.println("6 for search by name ,email_id and Kin_id:");
			System.out.println("option 7 for Exit");
			int i=sc.nextInt();
			
			switch(i){
			case 0: 
				System.out.println("enter the email to be searched:");
				String email=sc.next();
				iemp.SearchEmployee("*",",",email);
				break;
			case 1:
				System.out.println("enter the name to be searched:");
				String name=sc.next();
				iemp.SearchEmployee("*",name,",");
				break;
			case 2:
				System.out.println("enter the Kin_Id to be searched:");
				String kin_id=sc.next();
				iemp.SearchEmployee(kin_id,",","*");
				break;
				
			case 3:
				System.out.println("enter the name to be searched:");
				String name1=sc.next();
				System.out.println("enter the email to be searched:");
				String email1=sc.next();
				iemp.SearchEmployee("",name1,email1);
				break;
			case 4:
				System.out.println("enter the name to be searched:");
				name=sc.next();
				System.out.println("enter the Kin_Id to be searched:");
				kin_id=sc.next();
				iemp.SearchEmployee(kin_id,name,"");
				break;
			case 5:
				System.out.println("enter the email to be searched:");
				email=sc.next();
				System.out.println("enter the Kin_Id to be searched:");
				kin_id=sc.next();
				iemp.SearchEmployee(kin_id,"",email);
				break;
			case 6:
				System.out.println("enter the name to be searched:");
				name=sc.next();
				System.out.println("enter the email to be searched:");
				email=sc.next();
				System.out.println("enter the Kin_Id to be searched:");
				kin_id=sc.next();
				iemp.SearchEmployee(kin_id,name,email);
				break;
			case 7 : return;
			}
		}
	}
	
	public List<Employee> getAllEmployee(){
		return (List<Employee>) iemp.getAllEmployee();
		}

}
