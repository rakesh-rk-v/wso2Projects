<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test</title>
</head>
<body>
<%
String cat =request.getParameter("catid");
String subcat =request.getParameter("subcatid");

	out.println("The Category Name = "+cat);
	out.println("<br>The Sub-Category Name = "+subcat);
	

%>
</body>
</html>