<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@  page import="java.sql.*"%>
<%@  page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validate</title>
</head>
<body>
<%
		try {
			String uid = request.getParameter("uid");
			String pas = request.getParameter("pwd");
			out.println("Hello User :"+uid);
			out.println("  Your Pass = :"+pas);
			Class.forName("com.mysql.cj.jdbc.Driver");
			String jdbc = "jdbc:mysql://localhost:3306/category?useSSL=false&serverTimezone=UTC";
			 String user = "root";
			 String pass = "Rk@918244";
			Connection con = DriverManager.getConnection(jdbc,user,pass);
			PreparedStatement stmt=con.prepareStatement("select user_id,password from login where user_id=? and password = ?");
			stmt.setString(1,uid);
			stmt.setString(2,pas);
			ResultSet rs = stmt.executeQuery();
			int a = 0;
			
			while(rs.next()==true){
				a++;
			}
			if(a>0){
				session.setAttribute("msg","valid");
				RequestDispatcher rd=request.getRequestDispatcher("view.jsp?msg=valid User");
				rd.forward(request,response);
			}
			else{
				session.setAttribute("msg","invalid");
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp?msg=invalid");
				rd.forward(request,response); 
			}
			%>
			
			<% 	} catch (Exception e) {
			e.printStackTrace();
		}
		%>
</body>
</html>