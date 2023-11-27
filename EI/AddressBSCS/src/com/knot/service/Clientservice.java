package com.knot.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import com.knot.DbConn.DBConn;
import com.knot.inter.Clinet_Inter;
import com.knot.model.Address;

public class Clientservice implements Clinet_Inter {
	Connection con= DBConn.DBconn();
	PreparedStatement pst;
	ResultSet res;
	Address add;
	@Override
	public String insert_Client_Address(Address add) {
		int Add_Id = ThreadLocalRandom.current().nextInt(); 
		try {
			pst = con.prepareStatement("insert into Cilent_Adress  values(?,?,?,?,?,?,?)");
		 	pst.setInt(1, Add_Id);
			pst.setString(2, add.getLine1());
			pst.setString(3, add.getLine2());
			pst.setString(4, add.getStreet());
			pst.setString(5, add.getCity());
			pst.setString(6, add.getState());
			pst.setString(7, add.getZip_Code());
		
			pst.executeUpdate();
			con.close();
			pst.close();
			res.close();
			} catch (SQLException e) {
			 e.printStackTrace();
		}
		return "Your Customer Id = "+Add_Id;
	}

	@Override
	public ArrayList<Address> getAllCustomerAddresses() {
		ArrayList <Address> lst= new ArrayList<Address>();
		System.out.println("Get all Address");
		try {
			pst = con.prepareStatement("select * from Customer_Address");
			res = pst.executeQuery();
			while(res.next()) {
				System.out.println("Results are there");
				add.setAddress_Id(res.getString(1));
				add.setLine1(res.getString(2));
				add.setLine2(res.getString(3));
				add.setStreet(res.getString(4));
				add.setCity(res.getString(5));
				add.setState(res.getString(6));
				add.setZip_Code(res.getString(7));
				//Address_id , line1 ,  line2 ,  street ,  city ,  state ,  zip_Code
				lst.add(add);
				
			}
			con.close();
			pst.close();
			res.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public Address getAddressWithDelay() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
