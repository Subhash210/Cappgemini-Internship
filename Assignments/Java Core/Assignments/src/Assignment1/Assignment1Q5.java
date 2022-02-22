package Assignment;
import java.util.Scanner;
class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	double c=ctc;
    	double tax=0;
    	if((c<=0)||(c<=180000)) {
    		return tax;
    	}else if((ctc==180001)||(ctc<=300000)) {
    		tax=(c/100)*10;
    		return tax;
    	}else if((ctc==300001)||(ctc<=500000)) {
    		tax=(c*20)/100;
    		return tax;
    	}else {
    		tax=(c/100)*30;
    		return tax;
    	}
    }
}
public class Assignment1Q5 {
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	TaxAmount objTax=new TaxAmount();
    	System.out.println("Enter the Amount in CTC: ");
    	int ctc=sc.nextInt();
    	double tax=objTax.calculateTaxAmount(ctc);
    	System.out.println("Tax Amount Payable: "+tax);
    	
    }
}

