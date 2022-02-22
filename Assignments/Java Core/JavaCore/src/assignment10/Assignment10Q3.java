package assignment10;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment10Q3 {    //“A quick brown fox jumps over the lazy dog”
	public static void main(String[] args) {
		
		ArrayList<String> AL1 = new ArrayList<>();
		AL1.add("A ");
		AL1.add("quick ");
		AL1.add("brown ");
		AL1.add("fox ");
		AL1.add("jumps ");
		AL1.add("over ");
		AL1.add("the ");
		AL1.add("lazy ");
		AL1.add("dog");
		
		System.out.println("ArrayList: "+AL1);
		System.out.println("Array: "+Arrays.toString(AL1.toArray()));
		
		System.out.println("-----------------------------");
		
		ArrayList<String> AL2 = new ArrayList<>();
		AL2.add("A quick brown fox jumps over the lazy dog");
		
		System.out.println("ArrayList: "+AL2);
		System.out.println("Array: "+Arrays.toString(AL2.toArray()));
	}
}
