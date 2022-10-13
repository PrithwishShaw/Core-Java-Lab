/*
Program: Checking weather the value is vowel ,consonant ,number and special character.
@author: Prithwish Shaw
@Date: 15 sep 2022
*/
import java.util.Scanner;

//declaring a class
class VovConNumSpe
{
	//method for checking the value
	static void checkingTheValue(char value)
	{
		int asciiValue = value;		//converting the value to its ascii value
		if((asciiValue>=48) && (asciiValue<=57))	//checking weather the value is a number
		{
			System.out.println("It is a number");	//printing it is a number
		}
		else if((asciiValue>=97) && (asciiValue<=122))		//checking weather the value is a vovel or consonant(lowercas)
		{
			if((asciiValue == 'a')||(asciiValue == 'e')||(asciiValue == 'i')||(asciiValue == 'o')||(asciiValue == 'u'))
			{
				System.out.println("It is a vovel(Lowercase)");		//printing it is a vovel(Lowercase)
			}
			else
			{
				System.out.println("It is a consonant(Lowercase)");		//printing it is a consonant(Lowercase)
			}
		}
		else if((asciiValue>=65) && (asciiValue<=90))		//checking weather the value is a vovel or consonant(uppercas)
		{
			if((asciiValue == 'A')||(asciiValue == 'E')||(asciiValue == 'I')||(asciiValue == 'O')||(asciiValue == 'U'))
			{
				System.out.println("It is a vovel(Uppercase)");		//printing it is a vovel(uppercas)
			}
			else
			{
				System.out.println("It is a consonant(Uppercase)");		//printing it is a consonant(uppercas)
			}	
		}
		else
		{
			System.out.println("It is a special character");		////printing it is a special character
		}
			
	}
	//end of method checkingTheValue
	
	//calling main
	public static void main(String[] args)
	{
		System.out.println();	//printing new lines
		System.out.println("-----Welcome to my program-----");		//printing welcome message
		System.out.println();	//printing new lines
		System.out.println("Enter the value to be check");		//printing instruction
		System.out.println();	//printing new lines
		Scanner sc=new Scanner(System.in);		// Scanner object for taking input 
		char value = sc.next().charAt(0);		//assinging the input value
		System.out.println();	//printing new lines
		checkingTheValue(value);		//calling method
		System.out.println();
		System.out.println("-----Good Bye-----");
	}
	//end of main
}
//end of class VovConNumSpe