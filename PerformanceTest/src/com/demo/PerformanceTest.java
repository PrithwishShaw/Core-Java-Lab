/*
Program: Compare string builder and string Buffer using performance test	
@Author: Prthwish Shaw
@Date: 6 Oct 2022
*/

package com.demo;

//declaring a class
public class PerformanceTest {
	
	//method for displaying StringBuffer Performance
	static void stringBufferPerformance()
	{
		long starttime= System.currentTimeMillis();
		StringBuffer a= new StringBuffer("Prithwish"); 
		for(int i=0;i<100000;i++)
		{
			a.append('P'); // adding the letter 'P'
		}
		long timeTaken= System.currentTimeMillis()-starttime;  //calculating the current Time
		System.out.println("Time taken by StringBuffer: "+timeTaken);	//printing the time taken
	}
	//end of method stringBufferPerformance
	
	//method for displaying StringBuilder Performance
	static void stringBuilderPerformance()
	{
		long starttime= System.currentTimeMillis();
		StringBuilder a= new StringBuilder("Prithwish");
		for(int i=0;i<100000;i++)
		{
			a.append('P');  // adding the letter 'P'
		}
		long timeTaken= System.currentTimeMillis()-starttime;	//calculating the current Time
		System.out.println("Time taken by StringBuilder: "+timeTaken);	//printing the time taken
	}
	//end of method stringBuilderPerformance
	
	//main method
	public static void main(String[] args) {
		
		stringBufferPerformance();	//calling method
		stringBuilderPerformance();	//calling method

	}
	//end of main method
}
//end of class PerformanceTest
