<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<% try{

String jdbc = "jdbc:mysql://localhost:3306/category?useSSL=false&serverTimezone=UTC";
String user = "root";
String pas="Rk@918244";
String name=request.getParameter("uid");
String pass=request.getParameter("pwd");
out.println(name);
out.println(pass);
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(jdbc,user,pas);
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from login");
while(rs.next()){
	if(rs.getString(1).equals(name)&&rs.getString(2).equals(pass)){
		response.sendRedirect("index.html");
	}
}

	}
	catch(Exception e){
		e.printStackTrace();
	}
%>

</body>
</html>