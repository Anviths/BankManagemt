package com.jsp.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.jsp.dao.BranchDao;
import com.jsp.dao.DatabaseConfig;
import com.jsp.entity.Branch;

public class BranchDaoImplentation implements BranchDao {

	EntityManager entityManager = DatabaseConfig.getEntityManager();

	@Override
	public Branch saveBranch(Branch branch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Branch updateBranch(Branch branch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBranch(Branch branch) {
		// TODO Auto-generated method stub

	}

	@Override
	public Branch findBranch(int id) {

		return entityManager.find(Branch.class, id);
	}

	@Override
	public List<Branch> findAllBranch() {
		return entityManager.createQuery("select b from Branch b").getResultList();
	}

}
