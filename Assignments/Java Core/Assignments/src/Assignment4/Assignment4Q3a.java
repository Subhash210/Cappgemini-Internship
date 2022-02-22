package Assignment4;

import java.util.Scanner;
import java.lang.RuntimeException;

public class Assignment4Q3a {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double id=123;
	try {
		System.out.println("Please enter your id number: ");
		double id1=sc.nextDouble();
		if (id1==id) {
			System.out.println("Enter Amount:");
			double withdraw=sc.nextDouble();	
			SavingsAccount(withdraw);
		}else{
			System.out.println("Invalid id number");
		}
		
	} catch (InsufficientBalanceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (IllegalBankTransactionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();}
	finally {
		if(sc!=null) {
			sc.close();
		}
	}
	}

static void SavingsAccount(double withdraw) throws InsufficientBalanceException, IllegalBankTransactionException {
		double balance=4589;
		double diposit;
		if((withdraw>balance)||(balance==0)) {
			System.out.println("Available Balance:"+balance);
			throw new InsufficientBalanceException();
		}else if(withdraw<0){
			System.out.println("Amount can't be negative");
			throw new IllegalBankTransactionException();
		}else {
			System.out.println("Transaction Succesfull");
			System.out.println("Balance Amount: "+(balance-withdraw));
		}
		
	}
	
}