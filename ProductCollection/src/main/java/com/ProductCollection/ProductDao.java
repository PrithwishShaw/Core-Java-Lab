/*
Program: Employee Management System
@Author: Prithwish Shaw
@Date: 20 October 2022 
 */

package com.ProductCollection;


//declaring interface
public interface ProductDao {
	
	//method for Adding Employee
	void addProduct();
	
	//method for Deleting Employee
	boolean deleteProduct(String name);
	
	//method for Displaying All Employees
	void displayAll();
	
	void sortPrice();
	
	void sortQuantity();

}
//end of Interface EmployeeDao
