package com.jsp.controller;

import java.io.IOException;

import com.jsp.entity.Branch;
import com.jsp.entity.User;
import com.jsp.service.UserService;
import com.jsp.service.implementation.UserServiceImplementation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/createbranch")
public class CreateBranch extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name= req.getParameter("name");
		String email= req.getParameter("email");
		String address= req.getParameter("address");
		String ifsc= req.getParameter("ifsc");
		String phone= req.getParameter("phone");

		 HttpSession session= req.getSession();
		  User user= (User) session.getAttribute("loginuser"); 
		
		Branch branch=new Branch();
		branch.setName(name);
		branch.setEmail(email);
		if(phone!=null) {
			Long pho=Long.parseLong(phone);
			branch.setPhone(pho);
		}
		branch.setIFSC(ifsc);
		branch.setAddress(address);
		user.setBranch(branch);
		UserService service=new UserServiceImplementation();
		service.updateUser(user);
		
		
		
		
		
		
		
		
		
	}
}
