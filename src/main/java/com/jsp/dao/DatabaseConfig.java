package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DatabaseConfig {

	public static EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("java").createEntityManager();
	}
}
