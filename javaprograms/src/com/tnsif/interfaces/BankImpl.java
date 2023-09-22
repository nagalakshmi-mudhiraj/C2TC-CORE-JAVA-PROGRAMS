package com.tnsif.interfaces;
//Implementation class for interface Bank
public class BankImpl implements Bank  {

	@Override
	public void deposit(Account account, double amount) {
		// TODO Auto-generated method stub
		
		if (amount > DEPOSIT_LIMIT)
			System.out.println("Deposit not possible.. exceeds Deposit Limit");
		else
			account.setBalance(account.getBalance()+amount);
		System.out.println("Deposited"+amount +" into account:"+ account.getAccNo());
		
	}

	@Override
	public void withdraw(Account account, double amount) {
		// TODO Auto-generated method stub
		
		if (account.getBalance() - amount >- MIN_BALANCE)
		{
			account.setBalance(account.getBalance()-amount);
			System.out.println("Withdrawn"+ amount +" from accont:"+account.getAccNo());
			
		}
		else
			System.out.println("Insufficient balance in account:"+account.getAccNo());
	}

}