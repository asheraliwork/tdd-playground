package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class SavingsAccountTest {

	@Test
	public void depositAndrWithDrawal() {
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.deposit(100);
		assertEquals(100, savingsAccount.getBalance());
		savingsAccount.withdraw(50);
		assertEquals(50, savingsAccount.getBalance());	
	}
	
	@Test
	public void negativeBalanceTest() {
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.withdraw(25);
		assertEquals(-25, savingsAccount.getBalance());
	}

}
