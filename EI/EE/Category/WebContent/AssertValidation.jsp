<%@  page import="java.sql.*"%>
<%@  page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<title>Assert Input</title>

</head>
<body>
	<h1>Welcome To Assert Table</h1>
	<form name="f1" action="AssertInsertion.jsp" method="get"  >
	<table>
		<tr>
			<td>Assert Name :</td>
			<td><input type="text" name="Aname" required></td>
		</tr>
		<tr>
			<td>Assert Description :</td>
			<td><textarea name="desc" required></textarea></td>
		</tr>
		<tr>
			<td>Category :</td>
			<td><select name="catid" required >
					<option value=" ">--Select Category--</option>

					<%
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");

						String jdbc = "jdbc:mysql://localhost:3306/category?useSSL=false&serverTimezone=UTC";
						String user = "root";
						String pass = "Rk@918244";
						Connection con = DriverManager.getConnection(jdbc, user, pass);

						Statement stmt = con.createStatement();
						ResultSet re = stmt.executeQuery("select  *from category");
					
						while (re.next()) {
							out.println("<option value='" + re.getString(1) + "'>" + re.getString(2) + "</option>");
						}
					%>
			</select></td>
		</tr>
		<tr>
			<td>Sub-Category :</td>
			<td><select name="subcatid">
					<option value=" ">--Select Sub-Category--</option>
					<%
					re = stmt.executeQuery("select  *from sub_category");
					while (re.next()) {
						out.println("<option value='" + re.getString(1) + "'>" + re.getString(2) + "</option>");
					}
					
					%>
			</select></td>
		</tr>

	</table>
	<input type="submit" >
	</form>
	<%}
	catch (Exception e) {
	e.printStackTrace();
	}
	%>
	</body>
	</html>