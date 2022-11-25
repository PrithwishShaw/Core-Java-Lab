/*
 Creating Student POJO class
 */

package com.entity;

import jakarta.persistence.*;

//table name
@Entity
@Table(name="student")
//declaring class Student
public class Student {
	
	//creating Auto generated student Id column and declaring variable
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
	
	//creating Student first name column and declaring variable 
	@Column(name="student_first_name")
    private String firstName;
    
	//creating Student first last column and declaring variable
	@Column(name="student_last_name")
    private String lastName;
	
	//creating Student email column and declaring variable
    @Column(name="student_email")
    private String email;
    
    //declaring relation with Course 
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="course_id")
    private Course course;

    //default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterize constructor
	public Student(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	//getter and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	//end of getters and setters

	//to toString method
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", course=" + course + "]";
	}
	//end of toString method
}
//end of class Student
