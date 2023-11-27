package com.knot.custom.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.knot.custom.db.DB;
import com.knot.custom.repo.CustomRepo;

public class CustomServ implements CustomRepo{
	Connection con = DB.getConnection();
	PreparedStatement stmt;
	ResultSet res;
	String ele;
	@Override
	public String getNameById(String id) {
		System.out.println("The Get GetName By Id Method Is called......");
		try {
			stmt = con.prepareStatement("select name from custom where id=?");
			stmt.setString(1, id);
			res=stmt.executeQuery();
			while(res.next()) {
				System.out.println("Element found.........");
			ele = res.getString("name");
			return ele;
			}
		} catch (SQLException e) {
			System.out.println("Prepared Statement .............");
			e.printStackTrace();
		}
		return ele;
	}
	
//E:\EI\Custom\WebContent\wsdl\CustomServ.wsdl
}
