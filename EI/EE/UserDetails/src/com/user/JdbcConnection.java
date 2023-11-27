package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcConnection {

	public static void main(String[] args) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			String jdbc = "jdbc:mysql://localhost:3306/employee?useSSL=false&serverTimezone=UTC";
			String user = "root";
			String pass = "Rk@918244";

			Connection con = DriverManager.getConnection(jdbc, user, pass);
			PreparedStatement pst = con.prepareStatement("insert into login values(?,?,?,?)");
			// ResultSet rs = stmt.executeQuery("select *from login");
			/*
			 * while (rs.next()) { System.out.println(rs.getString(1) + "\t" +
			 * rs.getString(2) + rs.getString(3) + rs.getString(4)); }
			 */
			// int flag = stmt.executeUpdate("update login set role='Pwen' where id=7");
			pst.setInt(1, 15);
			pst.setString(2, "Knot-14");
			pst.setString(3, "Knot-09");
			pst.setString(4, "Devoloper");
			int flag = pst.executeUpdate();

			if (flag > 0) {
				System.out.println("Executed");
			} else {
				System.out.println("NotExecuted");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
