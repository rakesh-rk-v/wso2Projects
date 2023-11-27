package com.knot.vo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
	static String driverName = "com.mysql.cj.jdbc.Driver";
	public static Connection con = null;
	public static Connection getConnection() {
		
		String jdbc = "jdbc:mysql://localhost:3306/wso2-1";
		String user = "root";
		String pass = "mysql";

	try{

		Class.forName(driverName);
		con = DriverManager.getConnection(jdbc, user, pass);
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("Not Exceuted"+e);
	}
	return con;
	}


}
