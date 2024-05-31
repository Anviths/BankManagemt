package com.jsp.service;

import java.util.List;

import com.jsp.entity.User;

public interface UserService {

	User saveUser(User user);

	User updateUser(User user);

	void deleteUser(User user);

	User findUser(User user);

	List<User> findAllUser(User user);
	
	User login(String email,String password);

	User findUserByEmail(String email);
	
	
	
	
	
	
}
