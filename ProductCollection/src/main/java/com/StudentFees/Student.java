package com.StudentFees;

public class Student {
	
	private int studentId;
	private String studentName;
	private double studentFees;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studentId, String studentName, double studentFees) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudentFees() {
		return studentFees;
	}
	public void setStudentFees(double studentFees) {
		this.studentFees = studentFees;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", Name=" + studentName + ", Fees=" + studentFees
				+ "]";
	}
	
}
