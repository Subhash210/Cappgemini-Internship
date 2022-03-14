package assignment5;

import java.util.Arrays;

public class Assignment5Q3 {

	
	static <T>void swapGenericMethod( T[] array,int p1,int p2 ){
		T temp = array[p1];
		array[p1]=array[p2];
		array[p2]=temp;			
	}
	public static void main(String[] args) {
		
		Integer [] A1= {1,2,3,4,5,6,7,8,9};
		swapGenericMethod(A1,0,8);
		System.out.println(Arrays.toString(A1));
		
		String [] A2= {"A","B","C","D","E","F","G","H","I"};
		swapGenericMethod(A2,4,5);
		System.out.println(Arrays.toString(A2));
		
	}
}
