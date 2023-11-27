<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@  page import="java.sql.*"%>
<%@  page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
</head>
<body>

<%
	String arg[] = request.getParameterValues("eid");
	for(String s1 :arg){
		out.println(s1);
	}
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String jdbc = "jdbc:mysql://localhost:3306/employee?useSSL=false&serverTimezone=UTC";
			 String user = "root";
			 String pass = "Rk@918244";
			Connection con = DriverManager.getConnection(jdbc,user,pass);
			PreparedStatement stmt=con.prepareStatement("delete from employee where emp_id=?");
			for(String s2:arg){
				stmt.setString(1,s2);
				int flag = stmt.executeUpdate();
			}
			
			%>
			
			<% 	} catch (Exception e) {
			e.printStackTrace();
		}
		%>

</body>
</html>