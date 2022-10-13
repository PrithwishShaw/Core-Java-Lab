/*
Program: Pyramid Pattern
@author: Prithwish Shaw
@Date: 15 sep 2022
*/

//declaring a class

import java.util.Scanner;

class PyramidPattern
{
	//method to display the pyramid
	static void pattern(int noOfRows)
	{
		//loop for creating the pattern
		for(int i=1;i<=noOfRows;i++)
		{
			System.out.println(); //printing new lines
			for(int spaces=noOfRows-i;spaces>0;spaces--)
			{
				System.out.print(" "); //printing the spaces
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* "); //printing stars
			}
		}
		System.out.println();       // printing new lines
		System.out.println();		// printing new lines
		System.out.println("------Well Done------");		//printing "Well done"
		
	}
	//end of method pattern
		
	//calling main
	public static void main(String[] args)
	{
		System.out.println();		// printing new lines
		System.out.println("-----------Welcome to the creation of Pyramid-----------");		//printing welcome message
		System.out.println();		// printing new lines
		Scanner sc=new Scanner(System.in);		// Scanner object for taking input 	
		System.out.println("Enter the length of the Pyramid to be build");		//printing instruction
		int number=sc.nextInt();	//assinging the input value to number;
		System.out.println();		// printing new lines
		System.out.println("------Your Pyramid------");		//printing "your pyramid"
		System.out.println();		// printing new lines
		pattern(number);	//calling method
	

	}
	//end of main
}
//end of class PyramidPattern  