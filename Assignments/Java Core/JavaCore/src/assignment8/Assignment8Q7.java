package assignment8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment8Q7 {
	    public static void main(String[] args) {
	        HashMap<String,Integer> map = new HashMap<>();
	        map.put("Ram",42);
	        map.put("Bro",21);
	        map.put("cat",45);

	        Assignment8Q7 assignment8Q7 = new Assignment8Q7();
	        assignment8Q7.convertKeyValueToString(map);

	    }
	    public String convertKeyValueToString(HashMap<String, Integer> map) {

	        StringBuilder str = new StringBuilder();
	        Consumer<Map.Entry> consumer=(p)->str.append(p.getKey()).append(p.getValue());
	       Set set  = map.entrySet();
	       set.stream().forEach(consumer);



	        System.out.println(str);
	        return str.toString();


	    }
	}