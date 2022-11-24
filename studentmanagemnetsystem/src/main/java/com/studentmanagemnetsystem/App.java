/*
Program: Student management system
@author: Prithwish Shaw
@Date: 24th November 2022
 */
package com.studentmanagemnetsystem;

import java.util.List;

import com.dao.StudentDao;
import com.entity.Course;
import com.entity.Student;

//  declaring App class
public class App 
{
	//main method
    public static void main( String[] args ){
        
    	//creating student and course object and passing the values
    	Student student1= new Student("Prithwish","Shaw","prithwishshaw23@gmail.com");
    	Course course1= new Course("BCA");
    	course1.setStudent(student1);
    	student1.setCourse(course1);
    	
    	//creating student and course object and passing the values
    	Student student2= new Student("Hrithik","Roshan","hrithikroshan05@gmail.com");
    	Course course2= new Course("B.Tech");
    	course2.setStudent(student2);
    	student2.setCourse(course2);
    	
    	//creating StudentDao object and calling methods
    	StudentDao studentDao= new StudentDao();
    	studentDao.saveStudent(student1);
    	studentDao.saveStudent(student2);
    	studentDao.deleteStudent(1);
    	
    	//creating student list 
    	List<Student> students = studentDao.getAllStudent();
        students.forEach(studentTemp -> System.out.println(studentTemp.getFirstName()));
    }
}
