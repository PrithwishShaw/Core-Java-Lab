/*
Program: Create a Account and perform synchronized withdrawal in it using Threads	
@Author: Prthwish Shaw
@Date: 13 Oct 2022
*/

package com.synchronization;

// declaring class extending the thread class
public class JointAccount extends Thread{
	
	//outside so it can be refer by all the methods
	private Account acc = new Account();
	
	// main method
	public static void main(String[] args) throws InterruptedException {
		
		JointAccount a1= new JointAccount();
		Thread t1= new Thread(a1,"Ram");
		Thread t2= new Thread(a1,"Laxman");
		t1.start();
		//t1.join();   //we can also use join to fully execute any thread first 
		t2.start();
		
	}
	//end of main
	
		//synchronized method for withdrawing
	 	synchronized private void makeWithdrawal(int amt) { 	//locking the amount for withdrawal by synchronization 
	 	
	 	//start of if	
		if(acc.getBalance()>=amt) {
			System.out.println(Thread.currentThread().getName()+  "  is going to withdraw "+amt);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			acc.withdraw(amt);
			System.out.println(Thread.currentThread().getName()+"  has withdrawn "+amt);
			System.out.println("The balance is "+acc.getBalance());
			System.out.println();
		}
		//end of if
		else {
			System.out.println(Thread.currentThread().getName()+"  low balance "+amt);
			System.out.println("The balance is "+acc.getBalance());
		}
	 }
	 //end of method makeWithdrawal

	@Override
	//run method
	public void run() {
		
		//calling method
		makeWithdrawal(100);
		if (acc.getBalance() <=0) {
			System.out.println("Amount is overdrawn");
		}
		//end of if
		
	}
	//end of method run
}
//end of class JointAccount
