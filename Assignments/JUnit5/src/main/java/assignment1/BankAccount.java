package assignment1;

public class BankAccount {
	
	void withdraw(double amount) throws InsufficientFundsExpcetion  {
		double balance = 10000;
		if(amount>balance) {
			throw new InsufficientFundsExpcetion("Low Balance");
		}
	}
	
}
class InsufficientFundsExpcetion extends Exception {

	public InsufficientFundsExpcetion(String msg) {
		 super(msg);
	
		 
	 }
	
	
}