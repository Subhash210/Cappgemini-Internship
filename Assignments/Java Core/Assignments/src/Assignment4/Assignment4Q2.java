package Assignment4;

import java.util.Scanner;

public class Assignment4Q2 {
	
	public static void main(String[] args) {
		
	try {
		division();
	}catch( UnsupportedOperationException e){
		System.out.println("Dividing by zero");
		e.printStackTrace();
	}
	}
	
	static void division() throws UnsupportedOperationException {
		Scanner sc=new Scanner(System.in);
		int division;
		System.out.println("Enter the first number: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter the Second number: ");
		int num2=sc.nextInt();
		if(num2!=0) {
		division= num1/num2;
		System.out.println("Result for dividing first number with the second number is: "+division);}
		else {
			throw new UnsupportedOperationException();
		}
		
	}
	
	}

