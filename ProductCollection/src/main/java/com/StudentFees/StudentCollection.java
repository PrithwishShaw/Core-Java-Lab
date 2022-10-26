package com.StudentFees;

import java.util.HashMap;
import java.util.Scanner;

public class StudentCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, Student> sFees = new HashMap<>();
		
		int id;
		
		Student sInfo = new Student();
		
		sFees.put(101, new Student(101, "Prithwish", 5000));
		sFees.put(102, new Student(102, "Raj", 2050));
		sFees.put(103, new Student(103, "Ravi", 2000));
		sFees.put(104, new Student(104, "Kushshi", 3000));
		sFees.put(105, new Student(105, "Rahul", 1500));
		
		System.out.println("----Student  Payment Status Checking ------");

		System.out.println("Enter Student uId :");
		id = sc.nextInt(); 

		boolean status = sFees.containsKey(id);

		if (status) {

			System.out.println("-----------Student Information Found------------------");
			sInfo = sFees.get(id);
			System.out.println(sInfo);

		}

		else {
			System.out.println("----------------Student Information Not Found-------------");
		}

		sc.close();


	}

}
