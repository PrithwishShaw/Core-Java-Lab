/*
Program: Employee Management System
@Author: Prithwish Shaw
@Date: 20 October 2022 
 */

package com.EmployeeManagement.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.EmployeeManagement.dao.EmployeeDao;
import com.EmployeeManagemnet.model.Employee;

//declaring class
public class EmployeeDaoImpl implements EmployeeDao{
	
	//creating an ArrayList for storing all 
	List<Employee> eList= new ArrayList<Employee>();
	
	//creating Scanner Object
	Scanner sc= new Scanner(System.in);
	
	//method for adding employees
	public void addEmployee() {
		//creating Employee Object
		Employee e= new Employee();
		
		//input Employee Details
		System.out.println("Enter the Employee ID: ");
		e.setId(sc.nextInt());
		System.out.println("Enter the Employee Name: ");
		e.setName(sc.next());
		System.out.println("Enter the Employee Salary: ");
		e.setSalary(sc.nextDouble());
		
		//Adding Employee into collection
		eList.add(e);
		
		//displaying the added employee
		System.out.println(eList);
		
	}
	
	//method for deleting employees
	public boolean deleteEmployee(int id) {
		
		//declaring variable
		boolean status=false;
		Employee eDel=null;
		
		//searching the employee
		for(Employee e:eList) {
			if(e.getId()==id)
				eDel=e;
		}
		
		//checking weather the given id is present of not
		if(eDel==null)
			status=false;
		else {
			eList.remove(eDel);
			status=true;
		}
		return status;
	}
	//end of Method deleteEmployee
	
	//method for updating employees
	public boolean updateEmployee(int id) {
		
		//declaring variables
		boolean status= false;
		Employee eFind=null;
		
		//searching the employee
		for(Employee e:eList) {
			if(e.getId()==id)
				eFind=e;
		}
		
		//checking weather the given id is present of not 
		if(eFind!=null) {
			
			//declaring choice variable
			int ch=0;
			
			//input for choice
			System.out.println("1. Update Name:\n"+"2. Update Salary: ");
			ch=sc.nextInt();
			
			//switch case for updating name or salary
			switch(ch) {
			
			//case for updating name
			case 1:
				System.out.println("Enter the Name: ");		//input Employee name
				eFind.setName(sc.next());
				System.out.println("Name updated........");
				status=true;
				break;
			
			//case for updating salary	
			case 2:
				System.out.println("Enter the Salary:");	//input Employee salary
				eFind.setSalary(sc.nextDouble());
				System.out.println("Salary updated.........");
				status=true;
				break;
			
			//default case	
			default:
				System.out.println("No such property found.......");
			}
		}
		//end of if
		
		else {
			status=false;
		}
		//end of else
		
		return status;
	}
	//end of method updateEmployee

	//method for searching employee
	public Employee findEmployee(int id) {
		
		//declaring variable
		Employee eFind= null;
		
		//searching the employee
		for(Employee e:eList) {
			if(e.getId()==id)
				eFind=e;
		}
		return eFind;
	}
	//end of method findEmployee
	
	//method for displaying employees
	public void displayAll() {
		
		//displaying all the employees 
		for(Employee e:eList) {
			System.out.println(e);	//printing the employee list
		}
		//end of for
	}
	//end of method displayAll
}
//end of class EmployeeDaoImpl















