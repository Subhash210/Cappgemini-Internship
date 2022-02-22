package assignment8;

import java.util.ArrayList;

public class Assignment8Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
    	employeeList.removeIf(n->(n.length()%2!=0));
    	return employeeList;
    	
    }
    public static void main(String[] args) { 
    	Assignment8Q4 A1 = new Assignment8Q4();
    	ArrayList<String> AL = new ArrayList<>();
    	AL.add("Subhash");
    	AL.add("Manasa");
    	AL.add("Srinivas");
    	AL.add("Rama");
    	AL.add("Laxmi");
    	
    	System.out.println(A1.removeOddLength(AL));
    	
    	
    	
    }
}