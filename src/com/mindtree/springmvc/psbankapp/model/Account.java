package com.mindtree.springmvc.psbankapp.model;

public class Account {

	private Integer accountNo;
	private String accountHolderName;
	private Integer balance;

	public Account() {

		this.accountNo = 0;
		this.accountHolderName = "";
		this.balance = 0;
	}

	public Account(Integer accountNo, String accountHolderName, Integer balance) {

		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

}
