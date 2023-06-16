package com.asher.finances;

public class SavingsAccount {

	private int balance = 0;
	
	public void deposit(int amount) {
		balance += amount;	
	}

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		balance -= amount;
	}
	
	public SavingsAccount nextYear(int interestRate) {
		
		SavingsAccount  account = new SavingsAccount();
		account.deposit(balance + (balance * interestRate /100));
		return account;
	}
}
