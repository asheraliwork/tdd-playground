package com.asher.finances;

public class SavingsAccountYear {

	private int startingBalance = 0;
	private int capitalGainsAmount = 0;
	private int interestRate = 0;
	
	public SavingsAccountYear() {
	}

	public SavingsAccountYear(int startingBalance, int interestRate) {
		this.startingBalance = startingBalance;
		this.interestRate = interestRate;
	}
	
	public SavingsAccountYear(int startingBalance, int capitalGainsAmount, int interestRate) {
		super();
		this.startingBalance = startingBalance;
		this.capitalGainsAmount = capitalGainsAmount;
		this.interestRate = interestRate;
	}

	public int getStartingBalance() {
		return startingBalance;
	}


	public int getInterestRate() {
		return interestRate;
	}
	
	public int getEndingBalance() {
		return startingBalance + (startingBalance * interestRate / 100);
	}
	
	
	public SavingsAccountYear nextYear() {
		return new SavingsAccountYear(getEndingBalance(), interestRate);
	}
	
	public void withdraw(int amount) {
		startingBalance -= amount;
	}

}
