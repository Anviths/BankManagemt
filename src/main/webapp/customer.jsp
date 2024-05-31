<%@page import="com.jsp.entity.Account"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.entity.User"%>
<%@page import="jakarta.servlet.http.HttpSession"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Page</title>

</head>
<body>

  <%    HttpSession httpSession=request.getSession();
        User customer=(User) httpSession.getAttribute("loginuser"); %>
    
    <h1>Welcome to bank <%= customer.getName() %></h1>
    <%List<Account> accounts= customer.getAccounts(); %>
       <table>
    <tr>
    <th>
    account type
     </th>
     <th>
    balance:
     </th>
    </tr>
       <%for(Account account:accounts){ %>
    <tr>
    <td><%=account.getType() %></td>
    <td ><%=account.getBalance() %></td>
    </tr>
    <%} %>
    </table>
    
    <a href="deposit.jsp">deposit</a> <br><br>
    <a href="withdraw.jsp">withdraw</a>
</body>
</html>