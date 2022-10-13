/*
Program: Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee  
		and functionality . 
@Author: Prthwish Shaw
@Date: 13 Oct 2022
*/

package com.employee;

public class SalariedEmployee extends Employee {

	private String department;
	private int salary;
	
	public SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(int id, String name, int age, String department, int salary) {
		super(id, name, age);
		this.department = department;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [department=" + department + ", workingDays=" + salary + "]";
	}	
}
