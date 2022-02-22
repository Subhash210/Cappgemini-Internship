package assignmentQuestion4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

@Controller("bankcontroller")
public class BankAccountController implements ApplicationContextAware {

	private ApplicationContext context;

	public double deposit(long accountId, double balance) {
		double updatedbalance = 0;
		BankAccountepositoryImpl bankrepoImpl = (BankAccountepositoryImpl) context.getBean("repocontroller");
		updatedbalance = bankrepoImpl.getBalance(accountId) + balance;
		System.out.print(balance + " amount has been credited into your account" + "\nCurrent Balance: ");
		return updatedbalance;

	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		BankAccountepositoryImpl bankrepoImpl = (BankAccountepositoryImpl) context.getBean("repocontroller");
		if (fromAccount == bankrepoImpl.getBankaccount1().getAccountId()) {
			bankrepoImpl.updateBalance(toAccount, amount);
			System.out.println(amount + " amount has been transfered to your account by "
					+ bankrepoImpl.getBankaccount1().getAccountHolderName() + "\n"
					+ "Available balance in your account: "
					+ (bankrepoImpl.getBankaccount2().getAccountBalance() + amount));
			return true;
		}
		if (fromAccount == bankrepoImpl.getBankaccount2().getAccountId()) {
			bankrepoImpl.updateBalance(toAccount, amount);
			return true;
		}
		return false;
	}

	public double getBalance(long accountId) {

		BankAccountepositoryImpl bankrepoImpl = (BankAccountepositoryImpl) context.getBean("repocontroller");
		System.out.print("Available balance in your account: ");
		return bankrepoImpl.getBalance(accountId);

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;

	}

	public double withdraw(long accountId, double balance) {
		double updatedbalance = 0;
		BankAccountepositoryImpl bankrepoImpl = (BankAccountepositoryImpl) context.getBean("repocontroller");
		if (bankrepoImpl.getBalance(accountId) >= balance) {
			updatedbalance = bankrepoImpl.getBalance(accountId) - balance;
			return updatedbalance;
		}
		System.out.println("Insufficient funds");
		System.out.print("Available Balance: ");
		return bankrepoImpl.getBalance(accountId);

	}

}
