<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	table{
		align-self: center;
	}
*{
	background-color: cyan;
	
	box-sizing: border-box;
	text-align: center;
	text-decoration: solid;
	color: rgb(235, 89, 21);
}
</style>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body >

<form >
<div align="center">
	<table >
		<tr>
			<td>First Name</td>
			<td><input type="text" name ="fname"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name ="lname"></td>
		</tr>
		<tr>
			<td>Student id</td>
			<td><input type="text" name ="sid"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name ="pass"></td>
		</tr>
		<tr>
			<td>Age</td>
			<td><input type="date" name ="dob"></td>
		</tr>
		<tr>
			<td>Address :</td>
			<td><textarea name ="addr"></textarea></td>
		</tr>
		<tr>
			
			<td><input type="submit" value ="Register"></td>
		</tr>
	</table>
	</div>
</form>

</body>
</html>