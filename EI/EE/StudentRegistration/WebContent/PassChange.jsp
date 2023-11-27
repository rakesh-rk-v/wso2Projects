<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.sql.*" %>
    <%@ page import ="com.Student.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PassChange</title>
</head>
<body>
<%
Connection con = null;
PreparedStatement stmt = null;
 ResultSet rs = null;
 String sid =request.getParameter("sid");
String old =request.getParameter("old");
String newpass =request.getParameter("new");
String conf =request.getParameter("conf");
con=DBConn.getConnection();
stmt =con.prepareStatement(DBConn.Change);
stmt.setString(1,conf);
stmt.setString(2,sid);
int z = stmt.executeUpdate();
if(z>0){
	out.println("<h1>PassWord Successfully</h1>");
	
}
con.close();
%>

</body>
</html>