/*
Program: Calculation of Area of rectangle, square and circle using abstraction
@Author: Prthwish Shaw
@Date: 6 Oct 2022
*/

package com.demo;

//declaring an abstract class
public abstract class Shape {
	
	//abstract method for with 2 parameters
	abstract void RectangleArea(double length, double breadth);
	
	//abstract method for with 1 parameters
	abstract void SquareArea(double side);
	
	//abstract method for with 1 parameters
	abstract void CircleArea(double radius);
}
//end of abstract class