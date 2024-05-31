package com.jsp.service.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.jsp.dao.DatabaseConfig;
import com.jsp.dao.UserDao;
import com.jsp.dao.implementation.UserDaoImplementation;
import com.jsp.entity.User;
import com.jsp.service.UserService;

public class UserServiceImplementation implements UserService {
	UserDao dao = new UserDaoImplementation();

	EntityManager entityManager = DatabaseConfig.getEntityManager();

	@Override
	public User saveUser(User user) {

		return dao.saveUser(user);
	}

	@Override
	public User updateUser(User user) {

		return dao.updateUser(user);
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

	@Override
	public User login(String email, String password) {

		Query query = entityManager.createQuery("select u from User u where u.email=?1 and u.password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		try {
	    return(User) query.getSingleResult();
		}
		catch (Exception e) {
			return null;
		}
	}

	@Override
	public User findUserByEmail(String email) {
		  
		Query query= entityManager.createQuery("select u from User u where u.email=?1");
		query.setParameter(1, email);
	 try {
			return (User) query.getSingleResult();
	 }
	 catch (Exception e) {
		return null;
	}
	}

}
