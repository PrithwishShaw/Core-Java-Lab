/*
Program: making class for taking the input and display
@Author: Prithwish Shaw
@Date: 22 Sep 2022
*/

import java.util.Scanner;
class InputStudents
{
	public static void main(String ...args)
	{
		Students[] student = new Students[10];
		Students student1 = new Students(101,"Ranbir Kapoor",50.5);
		Students student2 = new Students(102,"Raj Kumar",90.5);
		Students student3 = new Students(103,"Aniket Roy",80.5);
		Students student4 = new Students(104,"Raju KK",93.4);
		Students student5 = new Students(105,"Dipika Khan",55.3);
		Students student6 = new Students(106,"Ramesh Kumar",97.7);
		Students student7 = new Students(107,"Aamir Khan",22.2);
		Students student8 = new Students(108,"Salan Nigam",33.4);
		Students student9 = new Students(109,"Risha Roy",90.0);
		Students student10 = new Students(110,"Anup Kiran",77.4);
		
		
		student[0]=student1;
		student[0]=student2;
		student[0]=student3;
		student[0]=student4;
		student[0]=student5;
		student[0]=student6;
		student[0]=student7;
		student[0]=student8;
		student[0]=student9;
		student[0]=student10;
		
		System.out.println("Students having 90% or more: ");
		
		student1.display();
		System.out.println();
		student2.display();
		System.out.println();
		student3.display();
		System.out.println();
		student4.display();
		System.out.println();
		student5.display();
		System.out.println();
		student6.display();
		System.out.println();
		student7.display();
		System.out.println();
		student8.display();
		System.out.println();
		student9.display();
		System.out.println();
		student10.display();
		
	}
}