
package com.Student;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConn {
	public static String Change = "Update Student set pass = ? where sid = ?";
	public static String insert = "insert into Student values(?,?,?,?,?,?)";
	static String driverName = "com.mysql.jdbc.Driver";
	public static Connection con = null;
	public static Connection getConnection() {
		
		String jdbc = "jdbc:mysql://localhost:3306/rbac?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String pass = "Rk@918244";

	try{

		Class.forName(driverName);
		con = DriverManager.getConnection(jdbc, user, pass);
	}
	catch(Exception e) {
		System.out.println("Not Exceuted");
	}
	return con;
}
}
