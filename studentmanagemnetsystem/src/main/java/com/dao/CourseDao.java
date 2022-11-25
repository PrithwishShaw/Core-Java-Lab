/*
Dao class for crud operations in course
 */

package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Course;
import com.util.HibernateUtil;

public class CourseDao {

	//method for saving the course details
	    public void saveCourse(Course course) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.save(course);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }
	 // end of method saveCourse
	
	//method for updating Course    
	public void updateCourse(Course course) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(course);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
	//end of method updateCourse
	
	//method for getting all the courses
	public Course getCourse(int id) {
        Transaction transaction = null;
        Course course = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an instructor object
            course = session.get(Course.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return course;
    }
	//end of method getCourse
}
//end of class CourseDao
