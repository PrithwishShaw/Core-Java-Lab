/*
Program: Creating a bank account and Display the on having balance=10000
@Author: Prithwish Shaw
@Date 22 Sep 2022
*/

import java.util.Scanner;

class BankAccount
{
	private String accountHolder;
	private int accountNumber;
	private double accountBalance;
 
	BankAccount() // no argument constructor
	{
	 
	}
 
	BankAccount(int accountNumber, String accountHolder,double accountBalance) // parameterized constructor
	{
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.accountBalance=accountBalance;
	}
	
	public int getAccountNumber()
	{
		return this.accountNumber;
	}
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	
	public String getAccountHolder()
	{
		return this.accountHolder;
	}
	
	public void setAccountHolder(String accountHolder)
	{
		this.accountHolder=accountHolder;
	}
	
	public double getAccountBalance()
	{
		return this.accountBalance;
	}
	
	public void setAccountBalance(double accountBalance)
	{
		this.accountBalance=accountBalance;
	}
}
	
	