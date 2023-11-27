package com.knot;

 import java.sql.*;
public class MyConnection {
	static String password="Dummy";

	
	public static String getPassWord(String uid) {
		
		String url="jdbc:mysql://localhost:3306/employee?useSSL=false&serverTimezone=UTC";
		String username="root";
		String pw="Rk@918244";
		try {
			Connection con;	con = DriverManager.getConnection(url,username,pw);
			PreparedStatement stmt=con.prepareStatement("select userpassword from users where username=?");
			stmt.setString(1,uid);
			
			ResultSet rs= stmt.executeQuery();
		
			while(rs.next()) {
				password=rs.getString("userpassword");
				
			}
			con.close();
			
			
		}
		catch (SQLException e) {

			e.printStackTrace();
		}
		
		return password;
	}

}
