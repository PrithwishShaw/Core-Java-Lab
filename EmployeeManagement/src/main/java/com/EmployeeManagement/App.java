/*
Program: Employee Management System
@Author: Prithwish Shaw
@Date: 20 October 2022 
 */

package com.EmployeeManagement;

import java.util.Scanner;

import com.EmployeeManagement.dao.EmployeeDao;
import com.EmployeeManagement.daoimpl.EmployeeDaoImpl;
import com.EmployeeManagemnet.model.Employee;

//declaring class
public class App 
{
	//method for displaying the menu
	public static void menu() {
		System.out.println("MENU:");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Search Employee");
		System.out.println("5. Display all the Employee");
		System.out.println("6. Exit");
		
	}
	//end of method menu
	
	//main class
    public static void main( String[] args ) {
    	
    	//creating scanner object
    	Scanner sc= new Scanner(System.in);
    	
    	//creating company object
    	EmployeeDao company= new EmployeeDaoImpl();
    	
    	//declaring choice variable
    	int ch=0;
    	
    	//do while for calling the methods
    	do {
    		
    		//calling method 
    		menu();
    		
    		//taking input in choice 
    		ch=sc.nextInt();
    		
    		//switch for performing the operations
    		switch(ch) {
    		
    		//case for adding employee
    		case 1:
    			company.addEmployee();
    			System.out.println("Employee Added..........");
				break;
				
			//case for deleting employee	
    		case 2:
    			System.out.println("Enter the ID to be Deleted");
    			int id=sc.nextInt();
    			boolean flag=company.deleteEmployee(id);
    			if(flag)
    				System.out.println("Employee Deleted.........");
    			else
    				System.out.println("Employee not found........");
    			break;
    			
    		//case for updating employee 	
    		case 3:
    			System.out.println("Enter the ID to be updated: ");
    			id=sc.nextInt();
    			flag=company.updateEmployee(id);
    			if(flag)
    				System.out.println("Employee Updated.......");
    			else
    				System.out.println("Employee not found.........");
    			break;
    			
    		//case for searching employee	
    		case 4:
    			Employee e=null;
    			System.out.println("Enter the ID to be searched: ");
    			id=sc.nextInt();
    			e=company.findEmployee(id);
    			if(e==null)
    				System.out.println("Employee not found........");
    			else
    				System.out.println("Employee ID: "+e.getId()+" Name: "+e.getName()+" Salary: "+e.getSalary());
    			break;
    			
    		//case for displaying all employees	
    		case 5:
    			company.displayAll();
    			break;
    			
    		//case for exit
    		case 6:
    			System.exit(0);
    			break;
    			
    		//default case for wrong input	
    		default:
    			System.out.println("Wrong input........");
    		}
    	}
    	//end of do
    	while(ch!=6);	//performing the operations till the choice is not 6
    	
    	sc.close();		//closing the scanner
    	
    }
    //end of main method
}
//end of class App 
