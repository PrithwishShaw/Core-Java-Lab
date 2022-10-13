/*
Program: Create a Class student which is inherited by college and school student .
		 Override the method calculate average marks.
@Author: Prthwish Shaw
@Date: 6 Oct 2022
*/
package com.demo;

import java.util.Scanner;
//declaring class Student
public class Student {

	//declaring variables
	String name;
	double marks[]=new double[5];
	double average=0;
	
	//method for taking the name and marks from the user
	void Input() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter The name: ");
		name= sc.next();

		System.out.println("Enter the marks obtain in 5 subjects: ");
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextDouble();
		}
		sc.close();
	}
	//end of method Input

	//method for calculating the average and displaying name and marks
	void Average() {
		for(int j=0;j<marks.length;j++) {
			average=average+marks[j]/marks.length;	 // average calculation
		}
		System.out.println("Student Name: "+name);
		System.out.println("Marks: ");
		for(double i : marks) {
			System.out.println(i+" ");
		}
		System.out.println("The average of the given marks are: "+average);
	}
	//end of method Average
}
//end of class Student

