/*
Program: Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee  
		and functionality . 
@Author: Prthwish Shaw
@Date: 13 Oct 2022
*/

package com.employee;

public class HourlyEmployee extends Employee{

	private String area;
	private int workingHours;
	private double ratePerHour; 
	private double salary;
	private int workingDays;
	
	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(String area, int workingHours, double ratePerHour, double salary, int workingDays) {
		super();
		this.area = area;
		this.workingHours = workingHours;
		this.ratePerHour = ratePerHour;
		this.salary = salary;
		this.workingDays = workingDays;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	public double getRatePerHour() {
		return ratePerHour;
	}


	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	

	public double getSalary() {
		return salary;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

	public void setSalary(double salary) {
		salary= (workingHours*salary)*workingDays;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [area=" + area + ", workingHours=" + workingHours + ", ratePerHour=" + ratePerHour
				+ ", salary=" + salary + "]";
	}

}
