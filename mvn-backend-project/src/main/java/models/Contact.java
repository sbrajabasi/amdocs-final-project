package models;

public class Contact {

	private Long contactId;
	private Long userId;
	private String name;
	private String email;
	private String phoneNo;
	private String message;
	
	public Contact() {
		super();
	}

	public Contact(Long contactId, Long userId, String name, String email, String phoneNo, String message) {
		super();
		this.contactId = contactId;
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.message = message;
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", userId=" + userId + ", name=" + name + ", email=" + email
				+ ", phoneNo=" + phoneNo + ", message=" + message + "]";
	}
	
	 
}
