/*
Program: Create a custom exception (Name cannot be null). The user will enter student details ,
		it will throw an exception if the name or id id null
@Author: Prthwish Shaw
@Date: 13 Oct 2022
*/

package com.exception;

public class NullException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	NullException(String message){
		super(message);
		
	}
}
