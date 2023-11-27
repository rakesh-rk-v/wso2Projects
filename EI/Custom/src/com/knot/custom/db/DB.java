package com.knot.custom.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB{
	static String user;
	static String pass;
	public static Connection getConnection() {
		Connection con =null;
		try {
			String Driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(Driver);
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Class Not Found.........");
			e.printStackTrace();
		}
		try {
			 String Url ="jdbc:mysql://localhost:3306/wso2prac";
			 String file ="E:\\EI\\Custom\\src\\com\\knot\\custom\\prop\\Db.properties";
				 try {
					Properties prop = new Properties();
					prop.load(new FileInputStream(file));
					user = prop.getProperty("user") ;
					pass = prop.getProperty("password") ;
					System.out.println("User Name ="+user);
					System.out.println("Password ="+pass);
				} catch (FileNotFoundException e) {
					System.out.println("There Is A Error in the file path ..............");
					e.printStackTrace();
				} catch (IOException e) {
					System.out.println("IO Execption............");
					e.printStackTrace();
				}
			 con=DriverManager.getConnection(Url,user,pass);
		}
		catch (SQLException e) {
			System.out.println("Please Connection not Established.......");
			e.printStackTrace();
		}	return con;
		
	}
	}

