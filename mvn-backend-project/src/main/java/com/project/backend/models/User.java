package com.project.backend.models;

public class User {

	private Long id;
	private String username;
	private String password;
	private String phoneNo;
	private String email;
	private String regDate;
	private String address;
	private String photo;
	
	public User() {
		super();
	}


	public User(Long id, String username, String password, String phoneNo, String email, String regDate, String address,
			String photo) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phoneNo = phoneNo;
		this.email = email;
		this.regDate = regDate;
		this.address = address;
		this.photo = photo;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", phoneNo=" + phoneNo
				+ ", email=" + email + ", regDate=" + regDate + ", address=" + address + ", photo=" + photo + "]";
	}
	
	
	
}
