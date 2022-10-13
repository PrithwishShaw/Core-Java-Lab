/*
Program: Create a custom exception (Name cannot be null). The user will enter student details ,
		it will throw an exception if the name or id id null
@Author: Prthwish Shaw
@Date: 13 Oct 2022
*/

package com.exception;

//class declaring
public class Test {
	//main method
	public static void main(String[] args) {
		
		String name=null;
		String id="10";
		
		//try catch for name
		try {
		checkName(name);
		}
		catch(Exception e) {
			System.out.println("exception occured "+e);
		}
		
		//try catch for ID
		try {
			checkID(id);
			}
			catch(Exception e) {
				System.out.println("exception occured "+e);
			}
	}
	//end of main method
	
	//method to check name
	static void checkName(String name) throws Exception {
		
		if(name==null) {
			throw new Exception("\n"+"Name cannot be null");
			}
		else {
			System.out.println("Student name: "+name);
		}
	}
	//checkName method end
		
	//method to check ID
	static void checkID(String id) throws Exception {
			
		if(id==null) {
			throw new Exception("\n"+"ID cannot be null");
			}
		else {
			System.out.println("Student ID: "+id);
		}	
	}
	//checkID method end
}
//end of class Test
