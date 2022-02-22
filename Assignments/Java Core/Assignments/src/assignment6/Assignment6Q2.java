package assignment6;

import java.util.HashSet;

public class Assignment6Q2 {
	public static void main(String[] args) {
		HashSet<product> H1 = new HashSet<>();
		product p1=new product(1);
		product p2=new product(2);
		product p3=new product(3);
		product p4=new product(4);
		product p5=new product(5);
		product p6=new product(6);
		product p7=new product(7);
		product p8=new product(8);
		product p9=new product(9);
		product p10=new product(10);

		H1.add(p1);
		H1.add(p2);
		H1.add(p3);
		H1.add(p4);
		H1.add(p5);
		H1.add(p6);
		H1.add(p7);
		H1.add(p8);
		H1.add(p9);
		H1.add(p10);
		
		//Trying to add duplicate elements.
		H1.add(p10);
		H1.add(p9);
		
		for(product p:H1) {
			System.out.println(p.id);
		}
	}
}

class product {
	int id;
	public product(int id) {
		this.id=id;
	}
}