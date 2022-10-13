/*
Program: Write a code to check a string is palindrome or not
@Author: Prthwish Shaw
@Date: 6 Oct 2022
*/

package com.demo;

import java.util.Scanner;

//declaring a class
public class Palindrome {
	
	//method to check the string is Palindrome or not
	static boolean checkPalindrome(String str) {
		boolean status;
		char ch[]= str.toCharArray(); 
		String revstrString= "";
		
		for(int i=ch.length-1;i>=0;i--)  
		{
			revstrString+=ch[i];
		}
		
		int flag = str.compareTo(revstrString);
		
		if(flag==0)
			status = true;
		else 
			status = false;
		return status;
	}
	// end of method checkPalindrome
	
	//method for taking input and displaying
	static void inputdisplay()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.next(); 
		boolean check = checkPalindrome(s); 
		
		if(check) {
			System.out.println("---The String is a Palindrome---"); 
		}
		else
			System.out.println("---The String is not a Palindrome---");
		sc.close();
	}
	//end of method inputDisplay

	//main method
	public static void main(String[] args) {
		
		inputdisplay(); //calling method
		
	}
	//end of main method

}
//end of class Palindrome
