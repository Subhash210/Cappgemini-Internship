package Assignment;

import java.util.Arrays;

class BubbleSort{
    public int[] bubbleSort(int arr[]) {
    	 int size = arr.length;
         for (int i = 0; i < size-1; i++)
             for (int j = 0; j < size-i-1; j++)
                 if (arr[j] > arr[j+1])
                 {
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                 }
    		
    	return arr;
    	}
    }

public class Assignment1Q8 {
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        BubbleSort BS=new BubbleSort();
        int[] BS1=BS.bubbleSort(arr);
        System.out.println(Arrays.toString(BS1));
        
    }
}

