package com.jsp.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.jsp.dao.DatabaseConfig;
import com.jsp.dao.UserDao;
import com.jsp.entity.User;

public class UserDaoImplementation implements UserDao {
 
	EntityManager entityManager=DatabaseConfig.getEntityManager();
	
	@Override
	public User saveUser(User user) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	@Override
	public User updateUser(User user) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
		return user;
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
