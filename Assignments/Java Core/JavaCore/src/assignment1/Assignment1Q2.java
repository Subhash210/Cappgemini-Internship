package assignment1;
import java.util.ArrayList;


class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max) {
    	ArrayList<Integer> arms_List = new ArrayList<>();
    	for(int i =min;i<=max;i++) {
    		if(armstrongCheck(i)) 
    			arms_List.add(i);
    	}
    	
    	int[] arrayofNumbers = new int[arms_List.size()];
    	int i=0;
    	
    	for(Integer j:arms_List) {
    		arrayofNumbers[i]=j;
    		i++;
    	}
    	return arrayofNumbers;
    }
    
    public boolean armstrongCheck(int num){
        int remanider=0,temp,sum=0,count=0;
        temp = num;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        temp =num;
        while(temp >0){
            remanider = temp%10;
            sum += (Math.pow(remanider,count));
            temp = temp/10;
        }

        if (num==sum){
            return true;
        }
        else{
            return false;
        }

    }
    	
}
public class Assignment1Q2 {
	public static void main(String[] args) {
		int min = 100;int max = 999;
		ArmstrongNumBetweenRange arr = new ArmstrongNumBetweenRange();
		int [] ar = arr.armstrongNumbersInRange(min,max);
		
		for(int i:ar) {
			System.out.print(i+" ");
		}
	}

}