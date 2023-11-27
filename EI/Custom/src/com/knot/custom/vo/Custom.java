package com.knot.custom.vo;

import java.io.Serializable;

public class Custom implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	
	String id;
	String name;
	String quantity;
	String price;
	String gender;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Custom(String id, String name, String quantity, String price, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.gender = gender;
	}
	public Custom() {
		super();
		System.out.println("The Object For Custom Is Created...");
	}

}
