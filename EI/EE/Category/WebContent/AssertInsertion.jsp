<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@  page import="java.sql.*"%>
<%@  page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Values</title>
</head>
<body>
<%
					try {
						
						String an = request.getParameter("Aname");
						String desc = request.getParameter("desc");
						int catid = Integer.parseInt(request.getParameter("catid"));
						int subcatid = Integer.parseInt(request.getParameter("subcatid"));
						Class.forName("com.mysql.cj.jdbc.Driver");

						String jdbc = "jdbc:mysql://localhost:3306/category?useSSL=false&serverTimezone=UTC";
						String user = "root";
						String pass = "Rk@918244";
						Connection con = DriverManager.getConnection(jdbc, user, pass);

						PreparedStatement stmt = con.prepareStatement("insert into asserts values(?,?,?,?)");
						
						stmt.setString(1,an);
						stmt.setString(2,desc);
						stmt.setInt(3,catid);
						stmt.setInt(4,subcatid);
						int in = stmt.executeUpdate();
						if(in>0){
					%>
					<h1>Record Inserted Successfully</h1>
					
					<%}
						else{
						%>
						<h1> Record  Not Inserted</h1>
						<%} %>
					<% }
	catch (Exception e) {
	e.printStackTrace();
	}
	%>
</body>
</html>