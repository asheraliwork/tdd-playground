package com.asher.finances;

import static org.junit.Assert.*;

import org.junit.Test;

public class _SavingsAccountYearTest {

	@Test
	public void startingBalanceTest() {
		SavingsAccountYear account = new SavingsAccountYear(10000, 10);
		assertEquals(10000, account.getStartingBalance());
	}
	
	@Test
	public void endingBalanceTest() {
		SavingsAccountYear account = new SavingsAccountYear(10000, 10);
		assertEquals(11000, account.getEndingBalance());
	}
	
	
	@Test
	public void nextYearsStartingBalanceShouldEqualThisYearsEndingBalance() {
		SavingsAccountYear thisYear = new SavingsAccountYear(10000, 10);
		assertEquals(thisYear.getEndingBalance(), thisYear.nextYear().getStartingBalance());
	}
	
	@Test
	public void nextYearsInterestRateShouldEqualThisYearsInterestRate() {
		SavingsAccountYear thisYear = new SavingsAccountYear(10000, 10);
		assertEquals(thisYear.getInterestRate(), thisYear.nextYear().getInterestRate());
	}

}
