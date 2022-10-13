/*
Program: Create a Class student which is inherited by college and school student .
		 Override the method calculate average marks.
@Author: Prthwish Shaw
@Date: 6 Oct 2022
*/

package com.demo;

import java.util.Scanner;
//declaring class TestStudent
public class TestStudent {

	//main method
	public static void main(String[] args) {
		
		//letting the user choice which students average marks they want to calculate
		Scanner sc=new Scanner(System.in);
		System.out.println("Want marks of School or College Student?");
		String choice=sc.next().toLowerCase();
	
		//start of if else
		if(choice=="college"){
			CollegeStudent c1= new CollegeStudent();
			c1.Input(); // calling method
			c1.Average();	// calling method
		}			
		else {
			SchoolStudent s1= new SchoolStudent();
			s1.Input();	// calling method
			s1.Average();	// calling method
		}
		//end of if else
		sc.close();
	}
	//end of main method
}
//end of class TestStudent
