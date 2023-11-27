package com.knot;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginController() {
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String loginName=request.getParameter("loginName");
		String password =request.getParameter("pass");
		RequestDispatcher rd;
		if(loginName !=null & loginName.equals("Rakesh")){
			rd=request.getRequestDispatcher("success.html");
			rd.forward(request, response);
		}
		else {
			
			PrintWriter out= response.getWriter();
			out.print("Your PassWord :"+password+" is invalid");
			rd=request.getRequestDispatcher("failure.html");
			rd.forward(request, response);
		}
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
}
}
