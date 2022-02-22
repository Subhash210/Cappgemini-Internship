package assignment1;


import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BankAccountTest {
	
	BankAccount bankaccount;
	
	@BeforeEach
	void init() {
		bankaccount = new BankAccount();
	}
	
	@Test
	void testBalanceInsufficient() {
		 
		assertThrows(InsufficientFundsExpcetion.class, ()->bankaccount.withdraw(15000), "Exception not occured");
	}

}
