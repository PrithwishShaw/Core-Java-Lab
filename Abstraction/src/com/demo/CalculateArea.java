/*
Program: Calculation of Area of rectangle, square and circle using abstraction
@Author: Prthwish Shaw
@Date: 6 Oct 2022
*/

package com.demo;

import java.util.Scanner;
//declaring class 
public class CalculateArea {

	//main method
	public static void main(String[] args) {
		
		Area a1= new Area();
		
		Scanner sc=new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter the lenght and breath of the rectangle:");
		a1.RectangleArea(sc.nextDouble(), sc.nextDouble());
		
		//taking input from the user
		System.out.println("Enter the side of the square:");
		a1.SquareArea(sc.nextDouble());
		
		//taking input from the user
		System.out.println("Enter the radius pof the circle:");
		a1.CircleArea(sc.nextDouble());

		sc.close();
	}
	//end of main method	
}
//end of class CalculateArea

