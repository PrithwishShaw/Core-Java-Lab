/*
Program: Calculation of Area of rectangle, square and circle using abstraction
@Author: Prthwish Shaw
@Date: 6 Oct 2022
*/

package com.demo;

//declaring of class inheriting shape class
public class Area extends Shape {
	
	//declaring variable area and pi
	double area=0;
	double pi=3.14;
	
	@Override
	//method for calculating the area of rectangle
	void RectangleArea(double length, double breath) {
		area=length*breath;
		System.out.println("Area of rectangle: "+area);
	}
	//end of method RectangleArea
	
	@Override
	//method for calculating the area of square
	void SquareArea(double side) {
		area= side*side;
		System.out.println("Area of square: "+area);
	}
	//end of method SquareArea
	
	@Override
	//method for calculating the area of circle
	void CircleArea(double radius) {
		area= pi*radius*radius;
		System.out.println("Area of circle:"+area);
	}
	//end of method CircleArea
}
//end of class Area
