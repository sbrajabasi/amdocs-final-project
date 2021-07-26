package models;

public class Feedback {

	private Long feedbackId;
	private Long userId;
	private String name;
	private String feedback;
	private String email;
	
	public Feedback() {
		super();
	}

	public Feedback(Long feedbackId, Long userId, String name, String feedback, String email) {
		super();
		this.feedbackId = feedbackId;
		this.userId = userId;
		this.name = name;
		this.feedback = feedback;
		this.email = email;
	}

	
	public Long getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(Long feedbackId) {
		this.feedbackId = feedbackId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", userId=" + userId + ", name=" + name + ", feedback=" + feedback
				+ ", email=" + email + "]";
	}
	
	
	
	
	
}
