<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@  page import="java.sql.*"%>
<%@  page import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
h1{
    text-align: center;
    color: gold;
}
 body{
        box-sizing: border-box;
    }

table{
table-layout: auto;
  width: 100%; 
text-align:center;
}
th{
text-decoration: solid;
color:red;
font-family: sans-serif;
}
tr{
    color: rgb(119, 119, 252);
    font-family:cursive, 'Lucida Sans', Arial, sans-serif;
}
legend{
    background-color: black;
   
  color: greenyellow;
  text-orientation: sideways;
}
</style>
<title>Table View</title>
</head>
<body>
<h1>kindly Select the record you want to delete</h1>
<fieldset>
<legend >Employee Details :</legend>
	<form action="DeleteRecord.jsp">
		<table  >
			<tr>
			 <th>CheckBox</th>
			 <th>SerialNo?</th>
			 <th>Employee Name</th>
			<th>Gender</th>		
			<th>DOJ</th>
			<th>Employee Id</th>	 
			</tr>
			<%
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String jdbc = "jdbc:mysql://localhost:3306/employee?useSSL=false&serverTimezone=UTC";
			 String user = "root";
			 String pass = "Rk@918244";
			Connection con = DriverManager.getConnection(jdbc,user,pass);
			Statement stmt=con.createStatement();
			ResultSet rs = stmt.executeQuery("select  *from employee");
			while (rs.next()) {
				out.println("<tr><td><input name='eid' type='checkbox' value='" + rs.getString(1) + "'></td>");
				out.println("<td>"+ rs.getString(1)+ "</td>");
				out.println("<td>"+ rs.getString(2)+ "</td>");
				out.println("<td>"+ rs.getString(3)+ "</td>");
				out.println("<td>"+ rs.getString(4)+ "</td>");
				out.println("<td>"+ rs.getString(5)+ "</td></tr>");
			}%>
			

			<% 	} catch (Exception e) {
			e.printStackTrace();
		}
		%>
		<tr><td colspan="6" align="center" class="h1"><input  type="submit" style="height:100%;width:100%;color:White;background:green" ></td></tr>
		</table>
	</form>
	</fieldset>
</body>
</html>