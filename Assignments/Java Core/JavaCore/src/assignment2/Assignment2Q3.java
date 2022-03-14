package assignment2;

import java.util.ArrayList;

/*Write a program to claculate the total cash available in the bank. 
In this bank,bank will provide two types of accounts one is savings 
accounts and another is current account where current account has 
cash credits and savings account has fixed deposit options.*/
class CurrentAccount extends Assignment2Q3 {
    int creditLimit = 2000;
    @Override
    public int getCash(int totalDeposits) {
    	int totalCash=0;
    	totalCash=totalDeposits+creditLimit;
    	return totalCash;
    }
}
class SavingsAccount extends Assignment2Q3 {
    
    int fixedDepositAmount = 5000;
    @Override
    public int getCash(int totalDeposits) {
    	int totalCash=0;
    	totalCash=totalDeposits+fixedDepositAmount;
    	return totalCash;
    }
}
public class Assignment2Q3 {
	int totalDeposits=10000;
    public int totalCashInBank(ArrayList<Integer> cash){
    	int total=0;
    	for(int i:cash) {
    		total+=i;
    	}
    	return total;
    }

	public int getCash(int totalDeposits) {
		this.totalDeposits=totalDeposits;
		return totalDeposits;
	}

    public static void main(String[] args) {
    	Assignment2Q3 AQ3=new Assignment2Q3();
    	CurrentAccount CA=new CurrentAccount();
    	SavingsAccount SA=new SavingsAccount();
    	int totalCashOfCurrentAccount=CA.getCash(AQ3.totalDeposits);
    	int totalCashOfSavingsAccount=SA.getCash(AQ3.totalDeposits);
    	ArrayList<Integer>totalCashList=new ArrayList<>();
        totalCashList.add(totalCashOfCurrentAccount);
        totalCashList.add(totalCashOfSavingsAccount);
        int totalCashInBank=AQ3.totalCashInBank(totalCashList);
        System.out.println("Total Cash in Bank: "+totalCashInBank);
        
    }
}

