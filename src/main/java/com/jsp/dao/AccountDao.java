package com.jsp.dao;

import java.util.List;

import com.jsp.entity.Account;

public interface AccountDao {

	Account saveAccount(Account account);
	 Account updateAccount(Account account);
	 void deleteAccount(Account account);
	 Account findAccount(Account account);
	 List<Account> findAllAccount(Account account);
}
