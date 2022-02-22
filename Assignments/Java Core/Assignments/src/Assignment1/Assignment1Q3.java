package Assignment;
import java.lang.Math;
import java.util.Scanner;
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        double t=time;
        double simpleInterest=(principalAmount*t*interestRate)/100;
        return simpleInterest;
    }

    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double t=time;
    	double compoundInterest=(Math.pow((principalAmount*(1+interestRate)), t));
    	return compoundInterest;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Principal Amount:");
    	double PA=sc.nextDouble();
    	System.out.println("Enter the Rate of Interest:");
    	double RT=sc.nextDouble();
    	System.out.println("Enter the Time Period in years:");
    	int T=sc.nextInt();
    	
    	SiCi SICI=new SiCi();
    	double SI=SICI.simpleInterest(PA, T, RT);
    	System.out.println("Simple interest is: "+SI);
    	double CI=SICI.compoundInterest(PA, T, RT);
    	System.out.println("Compound interest is: "+CI);
    	
    	
    	
    }
}

