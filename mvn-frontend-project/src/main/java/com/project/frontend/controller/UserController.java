package com.project.frontend.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.backend.DAO.UserDAO;
import com.project.backend.DAO_Implementation.UserDaoImp;
import com.project.backend.models.User;


@Controller
public class UserController {

	UserDAO dao = new UserDaoImp();
	
	@GetMapping("/user")
	public String userPage() {
		return "user";
	}
	
	@GetMapping("/get_users")
	public String getUsers(Model model) {
		
		List<User> users = dao.findAll();
		model.addAttribute("list", users);
		return "get_users";
	}
	
	@GetMapping("/add_user")
	public String addUser(Model model) {
		model.addAttribute("user", new User());
		return "add_user";
	}
	

	@PostMapping("/user_register")
	public String userRegister(@ModelAttribute("user") User user) {
		dao.addUser(user);
		return "redirect:/get_users";
	}
	
	@GetMapping("/delete_user/{id}")
	public String deleteUser(@PathVariable("id") Long id) {
		
		dao.deleteUser(id);
		return "redirect:/get_users";
	}
	
	@GetMapping("/update_user/{id}")
	public String updateUser(@PathVariable("id") Long id,Model model) {
		User user = dao.getUserById(id);
		model.addAttribute("user", user);
		return "update_user";
	}
	
	@PostMapping("/update_user")
	public String updateUser(@ModelAttribute("user") User user) {
		dao.updateUser(user);
		return "redirect:/get_users";
	}
	
}
