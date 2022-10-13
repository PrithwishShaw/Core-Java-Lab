/*
Program: Main class for taking input of the Accounts 
@Author: Prithwish Shaw
@Date: 22 Sep 2022
*/

import java.util.Scanner;
class InputAccount
{
	public static void main(String ...args)
	{
		//------------construction injection--------------//
		BankAccount person1= new BankAccount(100100100,"Ranbir Kapoor",9500000);
		BankAccount person2 = new BankAccount(200200200,"Raj Kumar",25000);
		BankAccount person3 = new BankAccount(300300300,"Aniket Roy",1250.52);
		
		System.out.println("Account Number:  " + person1.getAccountNumber()+"  Account Holder: "+person1.getAccountHolder()+"  accountBalance: "+person1.getAccountBalance());
		System.out.println("Account Number:  " + person2.getAccountNumber()+"  Account Holder: "+person2.getAccountHolder()+"  accountBalance: "+person2.getAccountBalance());
		System.out.println("Account Number:  " + person3.getAccountNumber()+"  Account Holder: "+person3.getAccountHolder()+"  accountBalance: "+person3.getAccountBalance());
	}
}


