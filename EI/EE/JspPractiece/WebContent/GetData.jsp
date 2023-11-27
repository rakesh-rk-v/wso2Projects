<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<% 
out.println(request.getHeader("Details.html"));
String name = request.getParameter("Name");
String age=  request.getParameter("Age");
String mail=  request.getParameter("Mail");
String dob=  request.getParameter("dob");
String addr=  request.getParameter("addr");
String gender=  request.getParameter("Gen");
String country=  request.getParameter("country");
String skills=  request.getParameter("skills");
String file=  request.getParameter("file");
out.println("<tr><td>Employee Name = "+name+"</td></tr>");
out.println("<tr><td>Employee Age = "+age+"</td></tr>");
out.println("<tr><td>Employee Email = "+mail+"</td></tr>");
out.println("<tr><td>Employee DOB = "+dob+"</td></tr>");
out.println("<tr><td>Employee Adress = "+addr+"</td></tr>");
out.println("<tr><td>Employee Gender = "+gender+"</td></tr>");
out.println("<tr><td>Employee Country = "+country+"</td></tr>");
out.println("<tr><td>Employee Skills = "+skills+"</td></tr>");
out.println("<tr><td>Employee File = "+file+"</td></tr>");
%>


</table>
</body>
</html>