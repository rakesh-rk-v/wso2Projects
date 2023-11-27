package com.jyo.SoapwithDb.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DaoClass 
{
	@Id
   String id;
	@Column
   String name;
	@Column
	String pno;
	@Column
	String adress;
	public DaoClass(String id, String name, String pno, String adress) {
		super();
		this.id = id;
		this.name = name;
		this.pno = pno;
		this.adress = adress;
	}
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
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public DaoClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
