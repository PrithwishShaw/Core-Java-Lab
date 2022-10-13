/*
Program: Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee  
		and functionality . 
@Author: Prthwish Shaw
@Date: 13 Oct 2022
*/

package com.employee;

import java.util.Scanner;

public class SalariedEmp {

	
	static SalariedEmployee s;
	
	static void enterSalariedEmployee() {
	
		s= new SalariedEmployee();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Employee ID: ");
		s.setId(sc.nextInt());
		System.out.println("Enter the Employee Name: ");
		s.setName(sc.next().toUpperCase());
		System.out.println("Enter the Employee age: ");
		s.setAge(sc.nextInt());
		System.out.println("Enter the Employee Department: ");
		s.setDepartment(sc.next().toUpperCase());
		System.out.println("Enter the Employee Salary: ");
		s.setSalary(sc.nextInt());
		displaySalariedEmployee();
		
		sc.close();
	}
	
	static public void displaySalariedEmployee() {
		System.out.println("ID: " + s.getId());
		System.out.println("Name: " + s.getName());
		System.out.println("Age: " + s.getAge());
		System.out.println("Department: " + s.getDepartment());
		System.out.println("Salary: " + s.getSalary());

		
	}
	
	public static void main(String[] args) {

		System.out.println("Enter the Salaried Employee details: ");
		enterSalariedEmployee();

	}
	

}
