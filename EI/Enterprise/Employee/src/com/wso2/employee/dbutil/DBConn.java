package com.wso2.employee.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {

	static String driverName = "com.mysql.cj.jdbc.Driver";
	public static Connection con = null;
	public static Connection getConnection() {
		
		String jdbc = "jdbc:mysql://localhost:3306/wso2prac?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String pass = "mysql";

	try{

		Class.forName(driverName);
		con = DriverManager.getConnection(jdbc, user, pass);
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("Not Exceuted");
	}
	return con;

	}
}
