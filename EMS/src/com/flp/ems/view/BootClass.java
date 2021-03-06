package com.flp.ems.view;

import java.util.Scanner;

import com.flp.ems.domain.Employee;

public class BootClass {

	static Scanner sc = new Scanner(System.in);
	
	public static void MenuSelection(){
		
		UserInteraction ui=new UserInteraction();
		while(true){
		System.out.println("MAIN MENU");
		System.out.println("1. Add\n2. Modify\n3. Remove\n4. Search\n5. Get All");
		int i;
		Employee emp;
		java.util.List<Employee> emp_l;
		System.out.println("\nEnter your choice:");
		i=sc.nextInt();
		switch(i){
		
		case 1: ui.AddEmployee();
		break;
		case 2: ui.ModifyEmployee();
		break;
		case 3: System.out.println("Employee removed? "+ui.RemoveEmployee());
		break;
		case 4:ui.SearchEmployee();
		break;
		case 5: emp_l=ui.getAllEmployee();
		if(emp_l != null)
			System.out.println("All Employees details are "+emp_l);
		else
			System.out.println("No Employees Found");
		break;
		case 6: System.exit(0);
		}
		}
	}
	
	public static void main(String[] args) {
		BootClass.MenuSelection();
	}
}
