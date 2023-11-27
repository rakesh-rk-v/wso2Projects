package com.knot.customer.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static String url="jdbc:mysql://localhost:3306/sales";
	public static Connection con = null;
	public static String user="root";
	public static String pass="mysql";
	public static Connection DBconn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
		con = DriverManager.getConnection(url,user,pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
}
