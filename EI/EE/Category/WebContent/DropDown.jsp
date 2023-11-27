<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@  page import="java.sql.*"%>
<%@  page import="java.io.*"%>
<%@  page import="com.cat.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DropDown</title>
</head>

<body>
	<SELECT name="cat"><option>Select A Option</option>
		<%
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			String jdbc = "jdbc:mysql://localhost:3306/employee?useSSL=false&serverTimezone=UTC";
			 String user = "root";
			 String pass = "Rk@918244";
			Connection con = DriverManager.getConnection(jdbc,user,pass);
			
			Statement stmt=con.createStatement();
			ResultSet re = stmt.executeQuery("select  *from login");
			while (re.next()) {
				out.println("<option>" + re.getString("role") + "</option>");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		%>
	</SELECT>
</body>
</html>