/*
Program: Creating an Array of studnts and Displaying the Students having 90%
@Author: Prithwish Shaw
@Date: 22 Sep 2022
*/

class Students
{
	private int studentId;
	private String studentName;
	private double studentPercentage;
 
	Students() // no argument constructor
	{
	 
	}
 
	Students(int studentId,String studentName,double studentPercentage) // parameterized constructor
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentPercentage=studentPercentage;
	}
	
	void display()
	{
		if(studentPercentage>=90)
		{
			System.out.println("Student ID: " + studentId);
			System.out.println("Student Name: " + studentName);
			System.out.println("Student %: " + studentPercentage);
		}
	}
}
	
	