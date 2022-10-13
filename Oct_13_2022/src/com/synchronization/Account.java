/*
Program: Create a Account and perform synchronized withdrawal in it using Threads	
@Author: Prthwish Shaw
@Date: 13 Oct 2022
*/

package com.synchronization;

//declaring of class
public class Account {
	
	private int balance=1000;

	//getter
	public int getBalance() {
		return balance;
	}
	//end of getter
	
	//method for updating the balance
	public void withdraw(int amount) {
		
		balance=balance-amount;
	}
	//end of method
}
//end of class Account
