package assignment10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Assignment10Q5 {
	
	public void choice() {
		System.out.println("1: Insert New Price");
		System.out.println("2: View Purchase Total");
		System.out.println("3: Exit");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Assignment10Q5 A5 = new Assignment10Q5();
		var path1 = "C:\\Users\\Subhash\\OneDrive\\Desktop\\PricesFile.txt";
		var path2 = "C:\\Users\\Subhash\\OneDrive\\Desktop\\TotalPrice.txt";
		double TotalPrice=0;
		int count=1;
		while(true) {
			System.out.println("Select your choice:");
			A5.choice();
			int c = sc.nextInt();
			if(c==1) {
				do {	
				System.out.println("Insert "+count+" Price");
				int price = sc.nextInt();
				try {
					Files.writeString(Path.of(path1), price+"\n", StandardOpenOption.APPEND);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Price has been saved to the file");
				count++;
				TotalPrice=TotalPrice+price;
				System.out.println("Do you want to add price for more items??");
				String choice = sc.nextLine();
				}
				
				while(sc.nextLine().equalsIgnoreCase("Yes"));

			}else if(c==2) {
				try {
					Files.writeString(Path.of(path2), TotalPrice+"\n", StandardOpenOption.APPEND);
					String s =	Files.readString(Path.of(path2));
					System.out.println("Total Price of all items is:"+s);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				break;
			}
			
		}
		
	}
	
	

}
