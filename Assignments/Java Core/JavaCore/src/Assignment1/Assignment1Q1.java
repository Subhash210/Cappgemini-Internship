package Assignment;
import java.util.Scanner;
import java.lang.Math;
public class Assignment1Q1 {
    static boolean armstrongCheck(int num) {
    	int temp, remainder=0, sum=0, count=0;
    	temp=num;
    	while(temp!=0) {
    		temp=temp/10;
    		count++;
    	}
    	temp=num;

    	while(temp>0) {
    		remainder=temp%10;
    		sum+=(Math.pow(remainder, count));
    		temp=temp/10;
    		
    	}
    	if(num==sum) {
    		return true;
    	}else {
    		return false;
    	}
    	
    	
    }


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n;
		n=sc.nextInt();
		if(armstrongCheck(n)) {
			System.out.println("Arm Strong Number");
		}else {
			System.out.println("Not Arm Strong");
			
		}
				
		
		
	}
	}

