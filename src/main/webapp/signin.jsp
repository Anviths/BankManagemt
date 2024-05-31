<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>


	<form action="signin">

		user :<input type="text" placeholder="enter your number or email"
			name="username"> <br> password :<input type="password"
			placeholder="enter your password" name="password"> <br>
		<input type="submit" value="submit">

		<%
		if (request.getAttribute("flag") != null) {
			Boolean result = (Boolean) request.getAttribute("flag");
			if (result) {
		%>
		<p style="color: red;">invalid credentials</p>
		<%
		}
		}
		%>


	</form>

     <a href="signup.jsp">Log-in</a>

</body>
</html>