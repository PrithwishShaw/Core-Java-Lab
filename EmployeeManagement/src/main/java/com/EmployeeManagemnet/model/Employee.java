/*
Program: Employee Management System
@Author: Prithwish Shaw
@Date: 20 October 2022 
 */

package com.EmployeeManagemnet.model;

//declaring class
public class Employee {
	
	//declaring attributes
	private int id;
	private String name;
	private double salary;
	
	//default constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//getter method for ID
	public int getId() {
		return id;
	}

	//setter method for ID
	public void setId(int id) {
		this.id = id;
	}

	//getter method for Name
	public String getName() {
		return name;
	}

	//setter method for Name
	public void setName(String name) {
		this.name = name;
	}

	//getter method for Salary
	public double getSalary() {
		return salary;
	}

	//setter method for Salary
	public void setSalary(double salary) {
		this.salary = salary;
	}

	//String method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
//end of class Employee
