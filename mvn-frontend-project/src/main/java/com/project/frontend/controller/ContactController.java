package com.project.frontend.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.backend.DAO.ContactDAO;
import com.project.backend.DAO_Implementation.ContactDaoImp;
import com.project.backend.models.Contact;


@Controller
public class ContactController {

	  ContactDAO dao = new ContactDaoImp();
	  
		@GetMapping("/get_contacts")
		public String get_contacts(Model model) {
			
			List<Contact> contacts =dao.findAll();
			model.addAttribute("list", contacts);
			return "get_contacts";
			
		}
		
		@GetMapping("/add_contact")
		public String addContact(Model model) {
			model.addAttribute("model", new Contact());
			return "add_contact";
		}
		
		@PostMapping("/contact_register")
		public String contactRegister(@ModelAttribute("model") Contact contact) {
			dao.addContact(contact);
			return "redirect:/get_contacts";
		}
		
		@GetMapping("/delete_contact/{contactId}")
		public String deleteContact(@PathVariable("contactId") Long id) {
			dao.deleteContact(id);
			return "redirect:/get_contacts";
		}
		
		@GetMapping("/update_contact/{contactId}")
		public String updateContact(@PathVariable("contactId") Long id,Model model) {
			Contact contact = dao.getContactById(id);
			
			model.addAttribute("model", contact);
			return "update_contact";
		}
		
		@PostMapping("/update_contact")
		public String updateContact(@ModelAttribute("model") Contact contact) {
			dao.updateContact(contact);
			return "redirect:/get_contacts";
		}
}
