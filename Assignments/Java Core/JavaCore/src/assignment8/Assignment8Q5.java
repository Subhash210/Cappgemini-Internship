package assignment8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment8Q5 {
    List<String> list = Arrays.asList("klpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) { 
    	
    	Assignment8Q5 A5=new Assignment8Q5();
    	List<String> lis=A5.list;
    	processWords(lis, o->{
    		StringBuilder r = new StringBuilder();
    		r.append(o.charAt(0));
    		System.out.print(r);
    	});
 
    }

    public static void processWords(List<String> list, Consumer<String> consumer) {
		for(String i: list) {
			consumer.accept(i);	
		}
		
   
    }
}
