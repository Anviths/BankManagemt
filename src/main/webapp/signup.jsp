<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   
   <form action="signup" method="post">
    
    name : <input type="text" name="name"> <br> <br>
    email : <input type="email" name="email"> <br> <br>
    phone : <input type="tel" name="phone"> <br> <br>
    age : <input type="number" name="age"> <br> <br>
    password : <input type="password" name="password"> <br> <br>
    DOB : <input type="date" name="date"> <br> <br>
    Address :<textarea rows="5" cols="20" name="address"></textarea>  <br> <br>
    
    Gender :<input type="radio" value="MALE" name="gender">Male 
    <input type="radio" value="FEMAlE"  name="gender">Female 
    <input type="radio" value="OTHERS"  name="gender">Others <br><br>
    
    Role :<input type="radio" value="CUSTOMER" name="role">Customer
    <input type="radio" value="EMPLOYEE"  name="role">Employee 
    <input type="radio" value="MANAGER"  name="role">Manager <br><br>
    
    
    <input type="submit" value="submit" >
    <input type="reset" value="Reset" >
   
   </form>
</body>
</html>