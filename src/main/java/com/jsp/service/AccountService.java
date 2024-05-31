package com.jsp.service;

import java.util.List;

import com.jsp.entity.Account;

public interface AccountService {

	Account saveAccount(Account account);
	 Account updateAccount(Account account);
	 void deleteAccount(Account account);
	 Account findAccount(Account account);
	 List<Account> findAllAccount(Account account);
}
