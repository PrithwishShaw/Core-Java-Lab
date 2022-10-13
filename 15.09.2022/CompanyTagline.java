/*
Program: Tagline Display
@author: Prithwish Shaw
@Date: 15 sep 2022
*/
import java.util.Scanner;

//declaring a class
class CompanyTagline
{
	//method for printing the tagline
	static void tagLine(int company)
	{
			switch(company)
			{
				case 1 -> System.out.println("Just Do It.");	//printing tagline of NIKE

				case 2 -> System.out.println("I'm Lovin' It");		//printing tagline of MCDONALD			
				
				case 3 -> System.out.println("Have It Your Way");		//printing tagline of BURGER KING				
				
				case 4 -> System.out.println("PAYTM Karo.");		//printing tagline of PAYTM		
				
				case 5 -> System.out.println("Zindagi Ke Saath Bhi, Zindagi Ke Baad Bhi.");		//printing tagline of LIC	
				
				default -> System.out.println("Please enter the number from the above.");		//printing for invalid value
			}
		
		}
		// end of method tagLine
		
		//calling main
		public static void main(String[] args)
		{
			System.out.println(); 	// printing new lines
			System.out.println("-----WELCOME-----");	//printing welcome message
			System.out.println();	// printing new lines
			System.out.println("Enter the number of the company name given below");		// printing instruction
			System.out.println();	// printing new lines
			System.out.println("1.NIKE -- 2.MCDONALD'S -- 3.BURGER KING -- 4.PAYTM -- 5.LIC");		//printing the company names
			System.out.println();	// printing new lines
			Scanner sc=new Scanner(System.in);		// Scanner object for taking input 
			int company = sc.nextInt();		//assinging the input value
			System.out.println();	// printing new lines
			tagLine(company);	//calling method
		}
	}
	//end of main

//end of class CompanyTagline