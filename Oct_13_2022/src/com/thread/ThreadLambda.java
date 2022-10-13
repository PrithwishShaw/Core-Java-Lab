/*
Program: Create a Thread using Lambda .
@Author: Prthwish Shaw
@Date: 13 Oct 2022
*/

package com.thread;


//declaring class
public class ThreadLambda {

	//main method
	public static void main(String[] args)
    {
 
	
        Runnable r1 = new Runnable() {

			@Override
			//run method
			public void run() {
				System.out.println(Thread.currentThread().getName() + " is running");  // printing the thread

			}
			//end of run method
		};

		// reference to Thread constructor and passing the name
		Thread t1 = new Thread(r1, "Ram");
		System.out.println("---Without Lambda---");
		t1.start();	// Starting the thread

		
		//thread with lambda
		Runnable r2 = () -> {
			System.out.println(Thread.currentThread().getName() + " is following him");	// printing the thread
		};

		// reference to Thread constructor and passing the name
		Thread t2 = new Thread(r2, "Laxman");
		System.out.println();
		System.out.println("---With Lambda---");
		t2.start();	//staring the thread

	}
	//end of main method
}
// end of class ThreadLambda

 
