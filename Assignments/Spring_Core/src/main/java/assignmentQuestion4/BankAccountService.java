package assignmentQuestion4;

public interface BankAccountService {

	public double deposit(long accountId, double balance);

	public boolean fundTransfer(long fromAccount, long toAccount, double amont);

	public double getBalance(long accountId);

	public double withdraw(long accountId, double balance);

}
