package com.knot;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String jdbc = "jdbc:mysql://localhost:3306/employee?useSSL=false&serverTimezone=UTC";
			String user = "root";
			String pass = "Rk@918244";
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String id = request.getParameter("username");
			String psw = request.getParameter("password");
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Connection con;
			con = DriverManager.getConnection(jdbc, user, pass);

			PreparedStatement stmt = con.prepareStatement("insert into users values(?,?)");
			stmt.setString(1, id);
			stmt.setString(2, psw);
			int ex = stmt.executeUpdate();

			if (ex > 0) {
				out.println("Records inserted successfully");
			} else {
				out.println("Records not inserted successfully");
			}
			out.println("Connection closed");
			out.close();
			con.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {

		}

	}

}
