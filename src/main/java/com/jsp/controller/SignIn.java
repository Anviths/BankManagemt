package com.jsp.controller;

import java.io.IOException;

import com.jsp.entity.Role;
import com.jsp.entity.User;
import com.jsp.service.UserService;
import com.jsp.service.implementation.UserServiceImplementation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/signin")
public class SignIn extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String username=	req.getParameter("username");
	String password=req.getParameter("password");
	UserService service=new UserServiceImplementation();
	User userLogin= service.login(username, password);
	if(userLogin!=null) {
		//let's create session
		HttpSession session= req.getSession();
		session.setAttribute("loginuser", userLogin);
		
	if(userLogin.getRole().equals(Role.CUSTOMER)) {
		req.getRequestDispatcher("customer.jsp").forward(req, resp);
	}
	else if(userLogin.getRole().equals(Role.MANAGER)) {
		req.getRequestDispatcher("manager.jsp").forward(req, resp);
	}
	else if(userLogin.getRole().equals(Role.EMPLOYEE)) {
		req.getRequestDispatcher("employee.jsp").forward(req, resp);
	}
	}
	else {
		req.setAttribute("flag", true);
		
		req.getRequestDispatcher("signin.jsp").include(req, resp);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	} 
}
