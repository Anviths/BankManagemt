package com.jsp.dao;

import java.util.List;

import com.jsp.entity.User;

public interface UserDao {

	 User saveUser(User user);
	 User updateUser(User user);
	 void deleteUser(User user);
	 User findUser(User user);
	 List<User> findAllUser(User user);
	 
	 
}
