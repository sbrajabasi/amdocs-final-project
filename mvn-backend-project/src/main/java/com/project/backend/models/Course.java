package com.project.backend.models;

public class Course {

	private Long id;
	private String name;
	private String desp;
	private String fees;
	private String resource;
	
	
	public Course() {
		super();
	}


	public Course(Long id, String name, String desp, String fees, String resource) {
		super();
		this.id = id;
		this.name = name;
		this.desp = desp;
		this.fees = fees;
		this.resource = resource;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesp() {
		return desp;
	}


	public void setDesp(String desp) {
		this.desp = desp;
	}


	public String getFees() {
		return fees;
	}


	public void setFees(String fees) {
		this.fees = fees;
	}


	public String getResource() {
		return resource;
	}


	public void setResource(String resource) {
		this.resource = resource;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", desp=" + desp + ", fees=" + fees + ", resource=" + resource
				+ "]";
	}
	
	
	
	
}
