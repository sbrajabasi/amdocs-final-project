package com.project.backend.DAO;

import java.util.*;

import com.project.backend.models.Feedback;

public interface FeedbackDAO {

	List<Feedback> findAll();

	boolean addFeedback(Feedback Feedback);

	Feedback getFeedbackById(Long id);

	boolean deleteFeedback(Long id);
	
	boolean updateFeedback(Feedback Feedback);
}
