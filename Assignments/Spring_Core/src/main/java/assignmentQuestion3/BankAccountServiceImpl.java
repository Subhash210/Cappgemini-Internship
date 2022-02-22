package assignmentQuestion3;


public class BankAccountServiceImpl implements BankAccountService {
	
	private BankAccount bankaccount;

	public double withdraw(long accountId, double balance) {
		
		/*
		 * if(bankaccount.getAccountBalance()>balance) {
		 * bankaccount.setAccountBalance(bankaccount.getAccountBalance()-balance);
		 * return bankaccount.getAccountBalance()-balance; }else
		 * if(bankaccount.getAccountBalance()<balance) {
		 * System.out.println("Insufficient Funds"); return 0; }else { return 0; }
		 */
		return 0;
	}

	public double deposit(long accountId, double balance) {
		/*
		 * if(bankaccount.getAccountId()==accountId) {
		 * bankaccount.setAccountBalance(bankaccount.getAccountBalance()+balance);
		 * return bankaccount.getAccountBalance()+balance; }else {
		 * System.out.println("Invalid account number"); return 0; }
		 */
		return 0;
	}

	public double getBalance(long accountId) {
		/*
		 * if(bankaccount.getAccountId()==accountId) { return
		 * bankaccount.getAccountBalance(); }else {
		 * System.out.println("Invalid account number"); return 0; }
		 */
		return 0;
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		/*
		 * if(bankaccount.getAccountBalance()>=amont) {
		 * bankaccount.setAccountBalance(bankaccount.getAccountBalance()-amont); return
		 * true; }
		 */
		return false;
	}

}
