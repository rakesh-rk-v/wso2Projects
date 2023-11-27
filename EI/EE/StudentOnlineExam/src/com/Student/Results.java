package com.Student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Results
 */
@WebServlet("/Results")
public class Results extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Results() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("This Is The Results Page");
		String q1 = request.getParameter("q1");
		String q2 = request.getParameter("q2");
		String q3 = request.getParameter("q3");
		String q4 = request.getParameter("q4");
		String q5 = request.getParameter("q5");
		String[] arr = { q1, q2, q3, q4, q5 };
		out.println("<html><body>");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			out.print("Connection established");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/users?useSSL=false&serverTimezone=UTC", "root", "Rk@918244");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Questions");

			out.print("<table><tr>");
			int Correct = 0;
			int Wrong = 0;
			int i = 1;
			int x = 1;
			while (rs.next()) {
				x = Integer.parseInt(rs.getString("Qno"));
				String s1 = rs.getString("Options");
				if (x == i && s1.equals(arr[i - 1]))
				{
					out.println(
							"<TD>	<h4 style='color='green''>CORRECT</h4> <td>Qno= " + i + " Your_Ans = " + arr[i]
									+ " and actual ans = " + s1 + "</td></td>");
					Correct++;
				} else {
					out.println("<TD>	<h4 style='color=red'>WRONG</h4> <td>Qno= " + i + " Your_Ans = " + arr[i]
							+ " but actual ans = " + s1 + "</td></td>");
					Wrong++;
				}


				i++;
				}
				out.println("</table></body></html>");


				out.println("Your Correct Answers Are :" + Correct);
				out.println("Your Wrong Answers Are :" + Wrong);
			}


			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
