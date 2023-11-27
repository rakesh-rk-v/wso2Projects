package com.bscs.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BSCS_Db {
public static Connection con = null;
private static final String JDBC_URL = "jdbc:oracle:thin:@172.16.110.237:1521/bscsr17";
private static final String USER_NAME = "sysadm";
private static final String PASSWORD = "SYSADM2020";
public static Connection getConnection () {
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver not Found.");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	try {
		con = DriverManager.getConnection(JDBC_URL,USER_NAME,PASSWORD);
	} catch (SQLException e) {
		System.out.println("Connection not Established.");
		e.printStackTrace();
	}
return con;
}
}
