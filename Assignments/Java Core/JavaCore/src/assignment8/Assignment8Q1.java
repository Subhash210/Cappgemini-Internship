package assignment8;

import java.util.Arrays;

public class Assignment8Q1   {
	
	
	
	    public double addition(int num1,int num2){
	    	ArthimaticOperation add = (int i,int j)->i+j;
	    	return add.operation(num1, num2);
	    }
	    public double subtraction(int num1,int num2){
	    	ArthimaticOperation sub = (int i,int j)->i-j;
	    	return sub.operation(num1, num2);
	    }
	    public double multiplication(int num1,int num2){
	    	ArthimaticOperation mul = (int i,int j)->i*j;
	    	return mul.operation(num1, num2);
	    }
	    public double division(int num1,int num2){
	    	ArthimaticOperation div = (int i, int j)->i/j;
	    	return div.operation(num1, num2);
	    }
	    public static void main(String[] args) {
	    	Assignment8Q1 A1 = new Assignment8Q1();
	    	System.out.println(A1.addition(12, 15));
	    	System.out.println(A1.subtraction(15, 12));
	    	System.out.println(A1.multiplication(5, 3));
	    	System.out.println(A1.division(15, 5));
	    	
	    	
	    	
	    	
	    }
	}

interface ArthimaticOperation{

	double operation(int n1,int n2);

}