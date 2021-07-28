package com.project.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping({"/","/index"})
	public String homepage() {
		return "index";
	}

	@GetMapping("/admin_page")
	public String adminpage() {
		return "admin";
	}
	
	@GetMapping("/user_page")
	public String userpage() {
		return "user";
	}
	
	@GetMapping("/course_page")
	public String coursepage() {
		return "course";
	}
	
	@GetMapping("/contact_page")
	public String contactpage() {
		return "contact";
	}
	
	@GetMapping("/feedback_page")
	public String feedbackpage() {
		return "feedback";
	}

}
