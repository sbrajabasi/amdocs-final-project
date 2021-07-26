package com.project.backend.DAO_Implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.project.backend.DAO.CourseDAO;
import com.project.backend.DB_Utility.DbConfig;
import com.project.backend.models.Course;


public class CourseDaoImp implements CourseDAO {
	
	Connection conn  = DbConfig.getConection();

	@Override
	public List<Course> findAll() {

		List<Course> courses = new ArrayList<>();
		String sql = "select * from course";
		
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				
				Long id = rs.getLong("course_id");
				String name = rs.getString("c_name");
				String desp = rs.getString("c_desp");
				String fees = rs.getString("c_fees");
				String resource = rs.getString("c_resource");

				
				Course course = new Course(id, name, desp, fees, resource);
				courses.add(course);
			}
			
			return courses;
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addCourse(Course course) {
		
        String sql = "insert into course (course_id,c_name,c_desp,c_fees,c_resource) values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setLong(1, course.getId());
			ps.setString(2, course.getName());
			ps.setString(3, course.getDesp());
			ps.setString(4, course.getFees());
			ps.setString(5, course.getResource());
			
			
			ps.executeUpdate();
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Course getCourseById(Long courseId) {
		// TODO Auto-generated method stub
		
        String sql = "select * from course where course_id = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);			
			ps.setLong(1, courseId);
			
			ResultSet rs = ps.executeQuery();
			
			Course course = null;
			
			while(rs.next()) {
			Long id = rs.getLong("course_id");
			String name = rs.getString("c_name");
			String desp = rs.getString("c_desp");
			String fees = rs.getString("c_fees");
			String resourse = rs.getString("c_resource");
			
			course = new Course(id,name,desp,fees,resourse);
			}
			
			return course;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteCourse(Long id) {
		// TODO Auto-generated method stub
		
	       String sql = "delete from course where course_id =?";
		    
		    try {
		    	PreparedStatement ps = conn.prepareStatement(sql);
		    	
		    	ps.setLong(1, id);
		    	
		    	ps.executeUpdate();
		    	
		    	return true;
		    	
		    }catch(SQLException e) {
		    	e.printStackTrace();
		    }
		return false;
	}

	
	@Override
	public boolean updateCourse(Course course) {
		// TODO Auto-generated method stub
		
		String sql = "update course set c_name=?,c_desp=?,c_fees=?,c_resource=? where course_id = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, course.getName());
			ps.setString(2, course.getDesp());
			ps.setString(3, course.getFees());
			ps.setString(4, course.getResource());
			ps.setLong(5, course.getId());
			
			ps.executeUpdate();
			
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
