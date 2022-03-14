package assignment4;

import java.util.Scanner;

public class Assignment4Q1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int division;
	try {
		
		System.out.println("Enter the first number: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter the Second number: ");
		int num2=sc.nextInt();
		
		division= num1/num2;
		System.out.println("Result for dividing first number with the second number is: "+division);
	} catch (ArithmeticException ex) {
		// TODO Auto-generated catch block
		System.out.println("Dividing with zero");
		division=0;
		System.out.println("Result is: "+division);
	    ex.printStackTrace();
	}finally {
		if(sc!=null) {
			sc.close();
		}
		}
	}
	
	
	
	}

