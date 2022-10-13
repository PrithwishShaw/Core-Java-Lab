/*
Program: Create a Class student which is inherited by college and school student .
		 Override the method calculate average marks.
@Author: Prthwish Shaw
@Date: 6 Oct 2022
*/

package com.demo;

import java.util.Scanner;
//declaring class SchoolStudent inheriting Student
public class SchoolStudent extends Student {
	
	@Override
	//overriding the Input method
	void Input() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter The name of School Student: ");
		name= sc.nextLine();

		System.out.println("Enter the marks obtain in 5 subjects: ");
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextDouble();
		}
		sc.close();
	}
	//end of method Input
	
	@Override
	//overriding the Average method
	void Average() {
		for(int j=0;j<marks.length;j++) {
			average=average+marks[j]/marks.length;	
		}
		System.out.println("School Student Name: "+name);
		System.out.println("Marks: ");
		for(double i : marks) {
			System.out.println(i+" ");
		}
		System.out.println("The average of the given marks is: "+average);
	}
	//end of method Average
}
//end of class CollegeStudent





