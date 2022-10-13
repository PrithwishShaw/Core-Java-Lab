/*
Program: To find Quotient and Remainder(Taking input from the user)
@author: Prithwish Shaw
@Date: 8 sep 2022
*/

//declaring a class
class QuotientAndRemainder
{
	//calling main
	public static void main(String[] args)
	{
		int divisibleNumber, divider, quotient, remainder;     // declaring the variables 
		divisibleNumber = Integer.parseInt(args[0]);     // taking input
		divider = Integer.parseInt(args[1]);	         //taking input   
		quotient = divisibleNumber/divider;
		remainder = divisibleNumber%divider;
		
		System.out.println("The Quotient is :" + quotient);   // Prnting the Quotient
		System.out.println("The Remainder is :" + remainder); // Prnting the Remainder
		
	}
	//end of main
}
//end of class QuotientAndRemainder