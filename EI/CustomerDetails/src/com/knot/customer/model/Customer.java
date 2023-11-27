package com.knot.customer.model;

import java.io.Serializable;

public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String firstName;
	String lastName;
	String dOB;
	String title;
	String marital_Status;
	String occupation;
	String gender;
	String customerId;
	String error;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getdOB() {
		return dOB;
	}
	public void setdOB(String dOB) {
		this.dOB = dOB;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMarital_Status() {
		return marital_Status;
	}
	public void setMarital_Status(String marital_Status) {
		this.marital_Status = marital_Status;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Customer(String firstName, String lastName, String dOB, String title, String marital_Status,
			String occupation, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dOB = dOB;
		this.title = title;
		this.marital_Status = marital_Status;
		this.occupation = occupation;
		this.gender = gender;
	}
	public Customer() {
		super();
	}


	
	
	
	
	
	
	
	

}
