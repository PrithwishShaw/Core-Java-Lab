/*
Program: Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee  
		and functionality . 
@Author: Prthwish Shaw
@Date: 13 Oct 2022
*/

package com.employee;

import java.util.Scanner;

public class HourlyEmp {
	
	static HourlyEmployee h;

	static void enterHourlyEmoloyeeDetails() {
		
		double rate;
		h= new HourlyEmployee();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Employee ID: ");
		h.setId(sc.nextInt());
		System.out.println("Enter the Employee Name: ");
		h.setName(sc.next().toUpperCase());
		System.out.println("Enter the Employee age: ");
		h.setAge(sc.nextInt());
		System.out.println("Enter the Employee Area: ");
		h.setArea(sc.next().toUpperCase());
		System.out.println("Enter the Employee Working Days: ");
		h.setWorkingDays(sc.nextInt());
		System.out.println("Enter the Employee Working Hours: ");
		h.setWorkingHours(sc.nextInt());
		System.out.println("Enter the Employee Rate per hour: ");
		rate=sc.nextDouble();
		
		
		h.setSalary(rate);
		displayHourlyEmployee();
		
		sc.close();
	}

	
	static void displayHourlyEmployee() {
		
		System.out.println("ID: " + h.getId());
		System.out.println("Name: " + h.getName());
		System.out.println("Age: " + h.getAge());
		System.out.println("Area: " + h.getArea());
		System.out.println("Salary: " + h.getSalary());

		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Hourly Employee details: ");
		enterHourlyEmoloyeeDetails();

		
	}

}
