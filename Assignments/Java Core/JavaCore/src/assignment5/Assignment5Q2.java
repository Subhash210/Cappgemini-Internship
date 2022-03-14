package assignment5;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Assignment5Q2 {

	public static void main(String[] args) {
		Random rand=new Random();
		HashMap<Integer,Double> HM1=new HashMap<>();

		HM1.put(rand.nextInt(100),rand.nextDouble(100));
		HM1.put(rand.nextInt(100),rand.nextDouble(100));
		HM1.put(rand.nextInt(100),rand.nextDouble(100));
		HM1.put(rand.nextInt(100),rand.nextDouble(100));
		HM1.put(rand.nextInt(100),rand.nextDouble(100));
		HM1.put(rand.nextInt(100),rand.nextDouble(100));
		HM1.put(rand.nextInt(100),rand.nextDouble(100));
		HM1.put(rand.nextInt(100),rand.nextDouble(100));
		HM1.put(rand.nextInt(100),rand.nextDouble(100));
		HM1.put(rand.nextInt(100),rand.nextDouble(100));
		
		
		for(Map.Entry m:HM1.entrySet()) {
			int key=(int) m.getKey();
			double value=(double) m.getValue();
			System.out.println(key+"\t"+value);
		}
		
	}



}

