package assignment1;

import java.util.Arrays;

public class MinMaxFinder {
	
	int[] findMinMax(int[] array ){
		Arrays.sort(array);
		int min = array[0];
		int max = array[array.length-1];
		int[] intArray = {min,max};
		return intArray;
	} 
	
}
