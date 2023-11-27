<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="login.css">
<title>Login Page</title>
</head>
<body>

	<div class="container">
		<form action="Validate.jsp" method="post">
			<h1 align="center">Administrator </h1>
			<input type="text" placeholder="Username" name="uid" required> <input
				type="password" placeholder="Password" name="pwd" required>
			<button type="submit">Login</button>
		</form>
		<div class="bottom">
			<a href="" class="forgot">Forgot Password</a> <br> <span>Don't
				have an account?</span> <a href="">Sign Up</a>
		</div>
	</div>
	<%
	String msg =(String) session.getAttribute("msg");
	out.println(msg);
	if(msg.equals("invalid")){
		out.println("<h3>Invalid User </h3> ");
	}
	else{
		
	}
	%>

</body>
</html>