package assignmentQuestion3;



public class BankAccountepositoryImpl implements BankAccountRepository {
	

	private BankAccount bankaccount1;
	private BankAccount bankaccount2;
	

	public BankAccount getBankaccount1() {
		return bankaccount1;
	}

	public void setBankaccount1(BankAccount bankaccount1) {
		this.bankaccount1 = bankaccount1;
	}

	public BankAccount getBankaccount2() {
		return bankaccount2;
	}

	public void setBankaccount2(BankAccount bankaccount2) {
		this.bankaccount2 = bankaccount2;
	}

	public double getBalance(long accountId) {
		
		if(bankaccount1.getAccountId()==accountId) {
		
				return bankaccount1.getAccountBalance();
		}
		else if(bankaccount2.getAccountId()==accountId){
			
				return bankaccount1.getAccountBalance();
		}
		else {
				System.out.println("Invalid Account Number");
				return 0;
		}	
	}

	public double updateBalance(long accountId, double newBalance) {
		if(bankaccount1.getAccountId()==accountId) {
			
				bankaccount1.setAccountBalance(newBalance);
				return bankaccount1.getAccountBalance();
		}
		else if(bankaccount2.getAccountId()==accountId) {
			
				bankaccount1.setAccountBalance(newBalance);
				return bankaccount1.getAccountBalance();	
				
		}
		else {
			
				System.out.println("Invalid Account Number");
				return 0;
		}		
	}

}
