<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.sql.*" %>
    <%@ page import ="com.Student.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InsertRec</title>
</head>
<body>
<%
 Connection con = null;
PreparedStatement stmt = null;
 ResultSet rs = null;
 
String sid =request.getParameter("sid");
String fname =request.getParameter("fname");
String lname =request.getParameter("lname");
String dob =request.getParameter("dob");
String addr =request.getParameter("addr");
String pass =request.getParameter("pass");
con=DBConn.getConnection();
stmt =con.prepareStatement(DBConn.insert);
stmt.setString(1,sid);
stmt.setString(2,fname);
stmt.setString(3,lname);
stmt.setString(4,dob);
stmt.setString(5,addr);
stmt.setString(6,pass);
int y = stmt.executeUpdate();
if(y>0){
	out.println("Record Inserted Successfully");
	
}

%>


</body>
</html>