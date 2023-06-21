package com.asher.finances;

public class SavingsAccountYear {

	private int startingBalance = 0;
	private int capitalGainsAmount = 0;
	private int interestRate = 0;
	private int totalWithdrawn = 0;
	
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
	
	public int getStartingPrincipal() {	
		return startingBalance-capitalGainsAmount;
	}


	public int getEndingBalance() {
		int modifiedStart = startingBalance - totalWithdrawn;
		return modifiedStart + (modifiedStart * interestRate / 100);
	}
	
	public int getEndingPrincipal() {
		int result = getStartingPrincipal() - totalWithdrawn;
		return result > 0 ? result : 0;
	}
	
	public int getInterestRate() {
		return interestRate;
	}
	
	public SavingsAccountYear nextYear() {
		return new SavingsAccountYear(getEndingBalance(), interestRate);
	}
	
	public void withdraw(int amount) {
		totalWithdrawn += amount;
	}



	

}
