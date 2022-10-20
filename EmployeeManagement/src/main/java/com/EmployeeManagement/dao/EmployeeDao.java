/*
Program: Employee Management System
@Author: Prithwish Shaw
@Date: 20 October 2022 
 */

package com.EmployeeManagement.dao;

import com.EmployeeManagemnet.model.Employee;

//declaring interface
public interface EmployeeDao {
	
	//method for Adding Employee
	void addEmployee();
	
	//method for Deleting Employee
	boolean deleteEmployee(int id);
	
	//method for Updating Employee
	boolean updateEmployee(int id);
	
	//method for Searching Employee
	Employee findEmployee(int id);
	
	//method for Displaying All Employees
	void displayAll();

}
//end of Interface EmployeeDao
