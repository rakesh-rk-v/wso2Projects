package com.Student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OnlineExam
 */
@WebServlet("/OnlineExam")
public class OnlineExam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OnlineExam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><title>Online Exam</title><body>");
		String action = request.getParameter("action");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "root");

			Statement stmt = con.createStatement();
			out.println("<form action='OnlineExam?action=Submitted' method='POST'><table border=1 width=50%>");
			out.println("<tr><th>Online Exam</th></tr>");
			if (action != null && action.equals("Submitted")) {
				String qids[] = request.getParameterValues("qid");
				int correctAnswers = 0;
				for (String qid : qids) {
					// out.println(qid);
					String answer = request.getParameter("option" + qid);
					ResultSet rs2 = stmt.executeQuery("select correct_answer from questions where qid = " + qid);
					while (rs2.next()) {
						String correct_answer = rs2.getString("correct_answer");
						if (correct_answer.equals(answer)) {
							correctAnswers++;
						}
					}
				}
				out.println("<tr><td>Result: " + correctAnswers + "/" + qids.length + "</td></tr>");
				/*
				 * ResultSet rs2 =
				 * stmt.executeQuery("select * from questions where qid = "+qid);
				 * while(rs2.next()) { String correct_answer = rs2.getString("correct_answer");
				 * if(correct_answer.equals(answer)) {
				 * out.println("<tr><td>Correct Answer</td></tr>"); }else {
				 * out.println("<tr><td>Wrong Answer</td></tr>"); } }
				 */
			} else {
				// if(index < 2) {
				int index = 1;
				ResultSet rs = stmt.executeQuery("select * from questions");
				while (rs.next()) {
					String qid = rs.getString("qid");
					String question = rs.getString("question");
					String option1 = rs.getString("option1");
					String option2 = rs.getString("option2");
					String option3 = rs.getString("option3");
					String option4 = rs.getString("option4");

					out.println("<tr><td>" + index + ") " + question + "</td><input type='hidden' name='qid' value='"
							+ qid + "'/></tr>");
					out.println("<tr><td>" + "<input type='radio' value='" + option1 + "' name='option" + qid + "'/>"
							+ option1 + "<br/>" + "<input type='radio' value='" + option2 + "' name='option" + qid
							+ "'/>" + option2 + "<br/>" + "<input type='radio' value='" + option3 + "' name='option"
							+ qid + "'/>" + option3 + "<br/>" + "<input type='radio' value='" + option4
							+ "' name='option" + qid + "'/>" + option4 + "<br/>" + "</td></tr>");
					index++;
				}

				out.println("<tr><td><input type='Submit'></td></tr>");
				// }
			}
			out.println("</table></form>");
			out.println("</body></html>");
			con.close();
		} catch (Exception e) {
			out.println("error: " + e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
