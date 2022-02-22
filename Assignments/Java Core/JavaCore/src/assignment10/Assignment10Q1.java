package assignment10;

import java.util.Arrays;
import java.util.Optional;

public class Assignment10Q1{

	
	public static double simpleInterest(double A, int T, double I) {
		simple SI = (var a,var t,var i)-> (a*t*i)/100;
		return SI.operation(A, T, I);
	}
	
	public static void main(String[] args) {
		
		System.out.println(simpleInterest(2000,2,1.1));
		
		String s = "Subhash\t";
		System.out.println(s.repeat(25));
	}

	
}
interface simple{
	double operation(double principalAmount,int time,double interestRate);
}