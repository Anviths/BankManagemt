package com.jsp.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;

import com.jsp.entity.Account;
import com.jsp.entity.AccountType;
import com.jsp.entity.Branch;
import com.jsp.entity.Gender;
import com.jsp.entity.Role;
import com.jsp.entity.User;
import com.jsp.service.BranchService;
import com.jsp.service.UserService;
import com.jsp.service.implementation.BranchServiceImplentation;
import com.jsp.service.implementation.UserServiceImplementation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/createaccount")
public class CreateAccount extends HttpServlet{

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
     //
		
		String account_number=req.getParameter("account_number");
		Double balance=  Double.parseDouble(req.getParameter("balance")) ;
		AccountType accountType= AccountType.valueOf(req.getParameter("account_type")) ;
		
		Account account=new Account();
		account.setAccount_number(account_number);
		account.setBalance(balance);
		account.setType(accountType);
		
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPhone(phone);
		user.setAge(age);
		user.setDob(date);
		user.setAddress(address);
		user.setGender(gender);
		user.setRole(Role.CUSTOMER);
		user.setPassword(password);
		
		BranchService branchService=new BranchServiceImplentation();
		Branch branch=	branchService.findBranch(Integer.parseInt(req.getParameter("branchid")) );
		account.setBranch(branch);
		UserService service=new UserServiceImplementation();
		User userFind=	service.findUserByEmail(email);
		if(userFind==null) {
			user.setAccounts(Arrays.asList(account));
		service.saveUser(user);
		}
		else {
			userFind.getAccounts().add(account);
			service.updateUser(userFind);
		}
		req.getRequestDispatcher("siginin.jsp").forward(req, resp);
	}
}
