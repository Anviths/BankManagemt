package com.jsp.service.implementation;

import java.util.List;

import com.jsp.dao.BranchDao;
import com.jsp.dao.implementation.BranchDaoImplentation;
import com.jsp.entity.Branch;
import com.jsp.service.BranchService;

public class BranchServiceImplentation implements BranchService {

	BranchDao branchDao=new BranchDaoImplentation();
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
		return branchDao.findBranch(id);
	}

	@Override
	public List<Branch> findAllBranch() {
		// TODO Auto-generated method stub
		return branchDao.findAllBranch();
	}

}
