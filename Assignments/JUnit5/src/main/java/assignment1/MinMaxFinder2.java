package assignment1;

import java.util.Arrays;

public class MinMaxFinder2 {
	
	String findMinMax(int[] array ){
		Arrays.sort(array);
		int min = array[0];
		int max = array[array.length-1];
		return "max"+max+"min"+min;
	} 
	
}
