package com.project.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.backend.DAO.AdminDAO;
import com.project.backend.DAO_Implementation.AdminDaoImp;
import com.project.backend.models.Admin;
import java.util.*;

@Controller
public class AdminController {
	
	AdminDAO dao = new AdminDaoImp();
	
	@GetMapping("/get_admins")
	public String getAdmins(Model model) {
		
		List<Admin> admins = dao.findAll();		
		model.addAttribute("list", admins);
		return "get_admins";
	}
	
	@GetMapping("/delete_admin/{id}")
	public String deleteAdmin(@PathVariable("id") Long id) {
		dao.deleteAdmin(id);
		return "redirect:/get_admins";
	}
	
	@GetMapping("/add_admin")
	public String addAdmin(Model model) {
		model.addAttribute("admin", new Admin());
		return "add_admin";
	}
	
	@PostMapping("/admin_register")
	public String registerAdmin(@ModelAttribute("admin") Admin admin){
		dao.addAdmin(admin);
		return "redirect:/get_admins";
	}
	
	@GetMapping("/update_admin/{id}")
	public String updateAdmin(@PathVariable("id") Long id,Model model) {
		Admin admin =dao.getAdminById(id);
		model.addAttribute("admin", admin);
		return "update_admin";
	}
	
	
	@PostMapping("/update_admin")
	public String updateAdmin(@ModelAttribute("admin") Admin admin) {
		dao.updateAdmin(admin);
		return "redirect:/get_admins";
	}


}
