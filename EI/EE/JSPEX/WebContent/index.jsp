<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.sql.*" %>
    <%@ page import ="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp</title>
</head>
<body>
<%
try 

{

	
	String jdbc = "jdbc:mysql://localhost:3306/employee?useSSL=false&serverTimezone=UTC";
	String user = "root";
	String pass="Rk@918244";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(jdbc,user,pass);
	PreparedStatement stmt = con.prepareStatement("select *from persons");
	ResultSet rs= stmt.executeQuery();
	while(rs.next()){
		out.print(rs.getString(1));
		out.print(rs.getString(2));
		out.print(rs.getString(3));
		out.print(rs.getString(4));
		out.print(rs.getString(5));
		out.print("<br><img src='"+rs.getBlob(6)+"'>");
	}
	con.close();
	
} catch (Exception e) {
	
	e.printStackTrace();
} 
%>
</body>
</html>