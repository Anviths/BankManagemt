package com.jsp.service;

import java.util.List;

import com.jsp.entity.Branch;

public interface BranchService {

	Branch saveBranch(Branch branch);
	 Branch updateBranch(Branch branch);
	 void deleteBranch(Branch branch);
	 Branch findBranch(int id);
	 List<Branch> findAllBranch();
}
