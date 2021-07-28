package com.project.frontend.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.backend.DAO.FeedbackDAO;
import com.project.backend.DAO_Implementation.FeedbackDaoImp;
import com.project.backend.models.Feedback;

@Controller
public class FeedbackController {

	FeedbackDAO dao = new FeedbackDaoImp();
	
	@GetMapping("/get_feedbacks")
	public String get_feedbacks(Model model) {
		
		List<Feedback> feedbacks =dao.findAll();
		model.addAttribute("list", feedbacks);
		return "get_feedbacks";
		
	}
	
	@GetMapping("/add_feedback")
	public String addFeedback(Model model) {
		model.addAttribute("model", new Feedback());
		return "add_feedback";
	}
	
	@PostMapping("/feedback_register")
	public String feedbackRegister(@ModelAttribute("model") Feedback feedback) {
		dao.addFeedback(feedback);
		return "redirect:/get_feedbacks";
	}
	
	@GetMapping("/delete_feedback/{feedbackId}")
	public String deleteFeedback(@PathVariable("feedbackId") Long id) {
		dao.deleteFeedback(id);
		return "redirect:/get_feedbacks";
	}
	
	@GetMapping("/update_feedback/{feedbackId}")
	public String updateFeedback(@PathVariable("feedbackId") Long id,Model model) {
		Feedback feedback = dao.getFeedbackById(id);
		
		model.addAttribute("model", feedback);
		return "update_feedback";
	}
	
	@PostMapping("/update_feedback")
	public String updateFeedback(@ModelAttribute("model") Feedback feedback) {
		dao.updateFeedback(feedback);
		return "redirect:/get_feedbacks";
	}
}
