/*
 Creating Course POJO class
 */
package com.entity;

import jakarta.persistence.*;


@Entity
@Table(name="course")
//declaring class Course
public class Course {
	
	//creating Auto generated course Id column and declaring variable
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
	
	//creating course name column and declaring variable
	@Column(name="course_name")
    private String courseName;

	//mapping 
	@OneToOne(mappedBy="course", cascade=CascadeType.ALL)
    private Student student;
	
	//default constructor
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterize constructor
	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}

	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	//end of getters and setters

	//String method
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + "]";
	}
	// end of String method
}
//end of class Course
