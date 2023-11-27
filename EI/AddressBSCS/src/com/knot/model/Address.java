package com.knot.model;


import javax.xml.bind.annotation.XmlType;


@XmlType(propOrder={"Line1", "Line2","Street","City","State","Zip_Code",})
public class Address {
	String Line1;
	String Line2;
	String Street;
	String City;
	String State;
	 String Zip_Code ;
	 String Address_Id;
	
	public String getAddress_Id() {
		return Address_Id;
	}
	public void setAddress_Id(String address_Id) {
		Address_Id = address_Id;
	}
	public Address() {
		super();
	}
	public Address(String line1, String line2, String street, String city, String state, String zip_Code) {
		super();
		Line1 = line1;
		Line2 = line2;
		Street = street;
		City = city;
		State = state;
		Zip_Code = zip_Code;
	}
	public String getLine1() {
		return Line1;
	}
	public void setLine1(String line1) {
		Line1 = line1;
	}
	public String getLine2() {
		return Line2;
	}
	public void setLine2(String line2) {
		Line2 = line2;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip_Code() {
		return Zip_Code;
	}
	public void setZip_Code(String zip_Code) {
		Zip_Code = zip_Code;
	}

}
