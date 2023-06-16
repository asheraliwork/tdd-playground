package com.asher.finances;

public class SavingsAccountYear {

	private int startingBalance = 0;
	private int interestRate = 0;
	
	public SavingsAccountYear() {
	}

	public SavingsAccountYear(int startingBalance, int interestRate) {
		this.startingBalance = startingBalance;
		this.interestRate = interestRate;
	}

	
	public int getStartingBalance() {
		return startingBalance;
	}


	public int getInterestRate() {
		return interestRate;
	}


	public int getBalance() {
		return startingBalance;
	}
	
	public void deposit(int amount) {
		startingBalance += amount;	
	}

	public void withdraw(int amount) {
		startingBalance -= amount;
	}
	
	public SavingsAccountYear nextYear() {
		return new SavingsAccountYear(getEndingBalance(), interestRate);
	}
	
	public int getEndingBalance() {
		return getBalance() + (getBalance() * interestRate / 100);
	}
	
}
