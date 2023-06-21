package com.asher.finances;

import static org.junit.Assert.*;

import org.junit.Test;

public class _SavingsAccountYearTest {
	
	private SavingsAccountYear newAccount() {
		SavingsAccountYear account = new SavingsAccountYear(10000, 10);
		return account;
	}

	@Test
	public void startingBalanceMatchesConstructorTest() {
		assertEquals(10000, newAccount().getStartingBalance());
	}
	
	@Test
	public void interestRateMatchesConstructorTest() {
		assertEquals(10, newAccount().getInterestRate());
	}


	@Test
	public void endingBalanceAppliesInterestRateTest() {
		assertEquals(11000, newAccount().getEndingBalance());
	}
	
	
	@Test
	public void nextYearsStartingBalanceEqualsThisYearsEndingBalanceTest() {
		SavingsAccountYear thisYear = newAccount();
		assertEquals(thisYear.getEndingBalance(), thisYear.nextYear().getStartingBalance());
	}
	
	@Test
	public void nextYearsInterestRateEqualTshisYearsInterestRateTest() {
		SavingsAccountYear thisYear = newAccount();
		assertEquals(thisYear.getInterestRate(), thisYear.nextYear().getInterestRate());
	}
	
	@Test
	public void withdrawingFundsOccursAtTheBeginningOfTheYearTest() {
		SavingsAccountYear year = newAccount();
		year.withdraw(1000);
		assertEquals(9900, year.getEndingBalance());
	}
	
	@Test
	public void startingPrincipalTest() {
		SavingsAccountYear account = new SavingsAccountYear(10000,7000, 10);
		assertEquals(3000, account.getStartingPrincipal());
	}
	
	@Test
	public void endingPrincipalTest() {
		SavingsAccountYear account = new SavingsAccountYear(10000,7000, 10);
		assertEquals("Starting principal amount",3000, account.getStartingPrincipal());
		account.withdraw(2000);
		assertEquals("Ending principal amount",1000, account.getEndingPrincipal());
	}
	
	@Test
	public void endingPrincipalNeverGoesBelowZero() {
		SavingsAccountYear account = new SavingsAccountYear(10000,7000, 10);
		assertEquals("Starting principal amount",3000, account.getStartingPrincipal());
		account.withdraw(4000);
		assertEquals("Ending principal amount",0, account.getEndingPrincipal());
	}
	
	@Test
	public void multipleWithdrawlsInYear() {
		SavingsAccountYear account = new SavingsAccountYear(10000, 10);
		account.withdraw(1000);
		account.withdraw(2000);
		assertEquals(7700, account.getEndingBalance());
	}
	
//	@Test
//	public void withdrawingMoreThanPrincipalIncursCapitalGainsTaxTest() {
//		SavingsAccountYear year = new SavingsAccountYear(10000, 7000, 10);
//		year.withdraw(3000);
//		assertEquals(7700, year.getEndingBalance());
//		year.withdraw(5000);
//		assertEquals(2000 + 200 - (5000 * .25), year.getEndingBalance());
//	}
}
