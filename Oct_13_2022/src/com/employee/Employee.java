/*
Program: Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee  
		and functionality . 
@Author: Prthwish Shaw
@Date: 13 Oct 2022
*/

package com.employee;

public class Employee {

	private int id;
	private String name;
	private int age;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}



















