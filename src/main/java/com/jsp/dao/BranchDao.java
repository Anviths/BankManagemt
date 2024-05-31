package com.jsp.dao;

import java.util.List;

import com.jsp.entity.Branch;

public interface BranchDao {

	Branch saveBranch(Branch branch);
	 Branch updateBranch(Branch branch);
	 void deleteBranch(Branch branch);
	 Branch findBranch(int id);
	 List<Branch> findAllBranch();
}
