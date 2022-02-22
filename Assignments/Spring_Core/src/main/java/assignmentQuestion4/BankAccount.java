package assignmentQuestion4;

public class BankAccount {

	private int accountId;
	private String accountHolderName;
	private String accountType;
	private double accountBalance;

	public double getAccountBalance() {
		return accountBalance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	/*
	 * public BankAccount(int accountId, String accountHolderName, String
	 * accountType, double accountBalance) { super(); this.accountId = accountId;
	 * this.accountHolderName = accountHolderName; this.accountType = accountType;
	 * this.accountBalance = accountBalance; }
	 */
	public int getAccountId() {
		return accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return this.getAccountId() + " " + this.getAccountHolderName() + " " + this.getAccountType() + " "
				+ this.getAccountBalance();
	}

}
