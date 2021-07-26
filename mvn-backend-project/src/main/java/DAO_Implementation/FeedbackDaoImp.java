package DAO_Implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DAO.FeedbackDAO;
import DB_Utility.DbConfig;
import models.Feedback;

public class FeedbackDaoImp implements FeedbackDAO {
	
	Connection conn = DbConfig.getConection();

	@Override
	public List<Feedback> findAll() {
		List<Feedback> feedbacks = new ArrayList<>();
		String sql = "select * from feedback";
		
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				
				Long feedbackId = rs.getLong("f_id");
				Long userId = rs.getLong("user_id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String feed = rs.getString("feedback");	
				
				Feedback feedback = new Feedback(feedbackId,userId,name,feed,email);
				feedbacks.add(feedback);

			}
			
			return feedbacks;
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean addFeedback(Feedback feedback) {
		
        String sql = "insert into feedback (f_id,user_id,name,email,feedback) "
        		+ "values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setLong(1, feedback.getFeedbackId());
			ps.setLong(2, feedback.getUserId());
			ps.setString(3, feedback.getName());
			ps.setString(4, feedback.getEmail());
			ps.setString(5, feedback.getFeedback());
			
			
			ps.executeUpdate();
			
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Feedback getFeedbackById(Long fId) {
        String sql = "select * from feedback where f_id = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);			
			ps.setLong(1, fId);
			
			ResultSet rs = ps.executeQuery();
			
			Feedback feedback = null;
			
			while(rs.next()) {
				
				Long feedbackId = rs.getLong("f_id");
				Long userId = rs.getLong("user_id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String feed = rs.getString("feedback");	
				
			    feedback = new Feedback(feedbackId,userId,name,feed,email);
			}
			
			return feedback;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteFeedback(Long id) {
		
	       String sql = "delete from feedback where f_id =?";
		    
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
	public boolean updateFeedback(Feedback feedback) {
		
		String sql = "update feedback set user_id=?,name=?,email=?,feedback=? where f_id=?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);		


			ps.setLong(1, feedback.getUserId());
			ps.setString(2, feedback.getName());
			ps.setString(3, feedback.getEmail());
			ps.setString(4, feedback.getFeedback());
			ps.setLong(5, feedback.getFeedbackId());
			
			ps.executeUpdate();
			
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
