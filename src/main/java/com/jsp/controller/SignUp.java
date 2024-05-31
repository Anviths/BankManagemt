package com.jsp.controller;

import java.io.IOException;
import java.time.LocalDate;

import com.jsp.entity.Gender;
import com.jsp.entity.Role;
import com.jsp.entity.User;
import com.jsp.service.UserService;
import com.jsp.service.implementation.UserServiceImplementation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignUp extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		long phone = Long.parseLong(req.getParameter("phone"));
		int age = Integer.parseInt(req.getParameter("age"));
		String password = req.getParameter("password");
		LocalDate date = LocalDate.parse(req.getParameter("date"));
		String address = req.getParameter("address");
		Gender gender = Gender.valueOf(req.getParameter("gender"));
		Role role = Role.valueOf(req.getParameter("role"));

		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPhone(phone);
		user.setAge(age);
		user.setDob(date);
		user.setAddress(address);
		user.setGender(gender);
		user.setRole(role);
		user.setPassword(password);

		UserService service = new UserServiceImplementation();
		service.saveUser(user);

		req.getRequestDispatcher("signin.jsp").forward(req, resp);
	}

}
