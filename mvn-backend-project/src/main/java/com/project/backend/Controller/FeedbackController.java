package com.project.backend.Controller;

import java.util.*;

import com.project.backend.DAO.FeedbackDAO;
import com.project.backend.DAO_Implementation.FeedbackDaoImp;
import com.project.backend.models.Feedback;

public class FeedbackController {

	public static void main(String[] args) {
		
	  FeedbackDAO dao = new FeedbackDaoImp();
		
//      // Insertion		
//      Feedback feedback = new Feedback(4L,109L,"sujit","sujit@gmail.com","good");
//		
//		if(dao.addFeedback(feedback))
//		System.out.println("Row Added Successfully");
//		else
//			System.out.println("Error , Can't Add");
		
	  
//		//Deletion
//		if(dao.deleteFeedback(4L))
//			System.out.println("Row Deleted successfully");
//		
//		else
//			System.out.println("ERROR, can't Delete");
	  
	  
		//Get Feedback by Id
		Feedback feedback = dao.getFeedbackById(4L);
		System.out.println(feedback);
		System.out.println();
		
		
		// Update 
		feedback.setName("rahul");
		if(dao.updateFeedback(feedback)) {
			System.out.println("Row Updated successfully");
		}
		else
			System.out.println("Error , Can't Update");
		
		
		
		//Get All Feedbacks
		List<Feedback> feedbacks = new ArrayList<>();
		
		feedbacks = dao.findAll();
		for(Feedback f:feedbacks) {
			System.out.println(f);
		}
		
		

	}

}
