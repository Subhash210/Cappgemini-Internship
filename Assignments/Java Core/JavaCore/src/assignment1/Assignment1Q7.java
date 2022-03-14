package assignment1;

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
    	boolean result=false;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i] == toCheckValue) {
    			result=true;
    	}
    }return result;
}}
public class Assignment1Q7 {
    public static void main(String[] args) {
        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
        SearchArray objArray = new SearchArray();
        if(objArray.searchArray(arr,valueToCheck)) {
        	System.out.println("The given number "+valueToCheck+" found in arraylist");
        }
        else {
        	System.out.println("The given number "+valueToCheck+" not found in arraylist");
        }

	}

}
