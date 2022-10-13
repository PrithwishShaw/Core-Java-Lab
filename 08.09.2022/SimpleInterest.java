/*
Program: To calculate Simple Interest
@author: Prithwish Shaw
@Date: 8 sep 2022
*/

//declaring a class
class SimpleInterest
{
	//calling main
	public static void main(String[] args)
	{
		int principle, rate, time = 5, simpleInterest;		//declaring the variable
		principle = Integer.parseInt(args[0]);				// taking input
		rate = Integer.parseInt(args[1]);					// taking input
		simpleInterest = (principle*rate*time)/100;				// calculating the Simple Interest
		
		System.out.println("The Simple Interest will be :" + simpleInterest);	// Printing the Simple Interest
		
	}
	//end of main
}
//end of class SimpleInterest