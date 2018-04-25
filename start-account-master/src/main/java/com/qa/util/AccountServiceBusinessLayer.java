package com.qa.util;



import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.repo.RepositoryLayer;

public class AccountServiceBusinessLayer implements DBImplementation {
	
	

		private static final Logger LOGGER = Logger.getLogger(DBImplementation.class);

		@Inject
		private RepositoryLayer rp;

	

	public String getAllAccounts() {
		LOGGER.info("?");
		return rp.getAllAccount();
	}

	@Override
	public String addAccount(String ac) {
		
		return rp.createAccount(ac);
	}
	@Override
	public String updateAccount() {
		return rp.updateAccount(null, null);
	}
	@Override
	public String deleteAccout() {
		return rp.deleteanAccount(null);
	}
	
	public void setRepoLayer(RepositoryLayer rp) {
		this.rp = rp;
	}}
