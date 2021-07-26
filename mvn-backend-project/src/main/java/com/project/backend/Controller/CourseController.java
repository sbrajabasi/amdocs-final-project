package com.project.backend.Controller;

import java.util.*;

import com.project.backend.DAO.CourseDAO;
import com.project.backend.DAO_Implementation.CourseDaoImp;
import com.project.backend.models.Course;

public class CourseController {

	public static void main(String[] args) {
		
		CourseDAO dao = new CourseDaoImp(); 
		
//      // Insertion		
//      Course course = new Course(150L,"python","Programming language","500","py.mp4");
//		
//		if(dao.addCourse(course))
//		System.out.println("Row Added Successfully");
//		else
//			System.out.println("Error , Can't Add");
		
		

//		//Deletion
//		if(dao.deleteCourse(150L))
//			System.out.println("Row Deleted successfully");
//		
//		else
//			System.out.println("ERROR, can't Delete");
		
		
		//Get Course by Id
		Course course = dao.getCourseById(150L);
		System.out.println(course);
		System.out.println();
		
		
		// Update 
		course.setName("data Secience");
		if(dao.updateCourse(course)) {
			System.out.println("Row Updated successfully");
		}
		else
			System.out.println("Error , Can't Update");
		
		
		
		// Get All Courses
		List<Course> courses = new ArrayList<>();		
		courses= dao.findAll();
		
		for(Course c:courses) {
			System.out.println(c);
		}
		
		
		
	}
}
