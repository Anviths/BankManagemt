<%@page import="com.jsp.entity.Branch"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.implementation.BranchServiceImplentation"%>
<%@page import="com.jsp.service.BranchService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account page</title>
</head>
<body>
<form action="createaccount" method="post">
    
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
    
    Account number<input type="text" name="account_number"><br><br>
    Balance<input type="number" name="balance"><br><br>
    
    Account Type :<input type="radio" value="SAVINGS" name="account_type">Savings 
    <input type="radio" value="CURRENT"  name="account_type">Current 
    <input type="radio" value="LOAN"  name="account_type">Loan <br><br>
    
   
    <%BranchService branchService= new BranchServiceImplentation();
     List<Branch> branches= branchService.findAllBranch();
     
    %>
 Branch <select name="branchID"  style="" >
 <% for(Branch branch : branches) { %>
        <option value="<%= branch.getId() %>"><%= branch.getName() %></option>
    <% } %>
 </select> <br><br>
    <input type="submit" value="submit" >
    <input type="reset" value="Reset" >
   
   </form>
</body>
</html>