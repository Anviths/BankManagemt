<%@page import="com.jsp.entity.User"%>
<%@page import="jakarta.servlet.http.HttpSession"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% HttpSession s= request.getSession();
  User user=(User) s.getAttribute("loginuser"); 
%>
 <form action="createbranch" method="post">
 
    name:<input type="text" name="name"><br><br>
    IFSC:<input type="text" name="ifsc"><br><br>
    email:<input type="email" name="email"><br><br>
    phone:<input type="tel" name="phone"><br><br>
    address : <textarea rows="5" cols="10" name="address"></textarea><br><br>
    <input type="submit" value="create">
    <br><br>
 </form>
</body>
</html>