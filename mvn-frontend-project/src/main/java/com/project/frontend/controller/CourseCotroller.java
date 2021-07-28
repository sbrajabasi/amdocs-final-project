package com.project.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.backend.DAO.CourseDAO;
import com.project.backend.DAO_Implementation.CourseDaoImp;
import com.project.backend.models.Course;

import java.util.*;


@Controller
public class CourseCotroller {

	CourseDAO dao = new CourseDaoImp();
	
	@GetMapping("/get_courses")
	public String get_courses(Model model) {
		
		List<Course> courses =dao.findAll();
		model.addAttribute("list", courses);
		return "get_courses";
		
	}
	
	@GetMapping("/add_course")
	public String addCourse(Model model) {
		model.addAttribute("model", new Course());
		return "add_course";
	}
	
	@PostMapping("/course_register")
	public String courseRegister(@ModelAttribute("model") Course course) {
		dao.addCourse(course);
		return "redirect:/get_courses";
	}
	
	@GetMapping("/delete_course/{id}")
	public String deleteCourse(@PathVariable("id") Long id) {
		dao.deleteCourse(id);
		return "redirect:/get_courses";
	}
	
	@GetMapping("/update_course/{id}")
	public String updateCourse(@PathVariable("id") Long id,Model model) {
		Course course = dao.getCourseById(id);
		
		model.addAttribute("model", course);
		return "update_course";
	}
	
	@PostMapping("/update_course")
	public String updateCourse(@ModelAttribute("model") Course course) {
		dao.updateCourse(course);
		return "redirect:/get_courses";
	}
	
	
}
