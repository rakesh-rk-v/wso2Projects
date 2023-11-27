package com.wso2.employee.vivo;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String id;
	String name;
	String mobile;
	String dept;
	String address;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(String id, String name, String mobile, String dept, String address) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.dept = dept;
		this.address = address;
	}
	public Employee() {
		super();
	}
	
}
