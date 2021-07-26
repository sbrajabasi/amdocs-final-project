package com.project.backend.DAO;

import java.util.*;

import com.project.backend.models.Course;

public interface CourseDAO {

	List<Course> findAll();

	boolean addCourse(Course Course);

	Course getCourseById(Long id);

	boolean deleteCourse(Long id);
	
	boolean updateCourse(Course Course);
}
