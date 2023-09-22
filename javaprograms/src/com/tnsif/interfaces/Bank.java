package com.tnsif.interfaces;

public interface Bank {

	
	double MIN_BALANCE=1000;
	double DEPOSIT_LIMIT=25000;
	double INTEREST_RATE=7.8;
	
	
	public void deposit(Account account, double amount);
	public void withdraw(Account account, double amount);
}
