package assignment2;

import java.util.Scanner;

public class Assignment2Q7 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Assignment2Q7 last = new Assignment2Q7();
		last.selectRoles();
	}
	private void selectRoles(){
		System.out.println("Enter the role :");
		String role = sc.nextLine();
		
		roles(role);
	}
    private void roles(String role){
    	if(role.equalsIgnoreCase("CUSTOMER")) {
    		placeOrder();
    	}
    	else if (role.equalsIgnoreCase("OWNER")) {
    		addItems();
    	}
    	else {
    		System.out.println("Please Enter Valid Input!");
    	}
    }
    private void addItems() {
    	System.out.println("Choose Item to purchase");
    	System.out.println("1. Candy\n2. Cookie\n3. Ice Cream");
    	System.out.println("Enter No.of items to buy :");
    	
    	int it = sc.nextInt();
    	addItemsOperation(it);
    }
    private void addItemsOperation(int choice) {
    	switch(choice) {
    	case 1:
    		Candy objCandy = new Candy();
    		System.out.println("Enter the amount of candies required :");
    		int need = sc.nextInt();
    		int total = objCandy.addCandies(need);
    		System.out.println(total);
    		break;
    	case 2:
    		Cookie objCookie = new Cookie();
    		System.out.println("Enter the amount of cookies required :");
    		int need1 = sc.nextInt();
    		int total1 = objCookie.addCookies(need1);
    		System.out.println(total1);
    		break;
    	case 3:
    		IceCream objIce = new IceCream();
    		System.out.println("Enter the amount of IceCreames required :");
    		int need2 = sc.nextInt();
    		int total2 = objIce.addIceCreams(need2);
    		System.out.println(total2);
    		break;
		default :
			System.out.println("enter valid things");
			break;
    	}
    		
    }
    private void placeOrder() {
    	System.out.println("Choose Item to buy");
    	System.out.println("1. Candy\n2. Cookie\n3. Ice Cream");
    	System.out.println("select the items to buy :");
    	
    	int it = sc.nextInt();
    	placeOrderOperation(it);
    }
    private void placeOrderOperation(int choice) {
    	switch(choice){
    	case 1:
    		Candy candy = new Candy();
    		System.out.println("Enter the amount of candies required :");
    		int need1 = sc.nextInt();
    		candy.addCandies(need1);
    		System.out.println("Total amount to buy Candies");
    		int total= candy.getCost();
    		System.out.println(total);
    		break;
    	case 2:
    		Cookie cookie = new Cookie();
    		System.out.println("Enter the amount of candies required :");
    		int need2= sc.nextInt();
    		cookie.addCookies(need2);
    		System.out.println("Enter the amount of Cookies to be buy :");
    		total= cookie.getCost();
    		System.out.println(total);
    		break;
    	case 3:
    		IceCream iceCream = new IceCream();
    		System.out.println("Enter the amount of candies required :");
    		int need3= sc.nextInt();
    		iceCream.addIceCreams(need3);
    		System.out.println("Enter the amount of IceCreams to be buy :");
    		total= iceCream.getCost();
    		System.out.println(total);
    		break;
    	}
    }

}
abstract class DesertItem {

    abstract public int getCost();
}
class Candy extends DesertItem {
	int noOfCandies = 1 ;
	int Dollarconvertedrupee=60;
    public int addCandies(int candies){
    	this.noOfCandies += candies;
    	return candies;
    }
    public int getCost() {
    	int CandiesTotal = noOfCandies*Dollarconvertedrupee;
    	return CandiesTotal;
    }
}
class Cookie extends DesertItem {
	int noofCookies=1;
	int Euroconvertedrupee=70;
    public int addCookies(int candies){
    	this.noofCookies+=noofCookies;
    	return noofCookies;
    }
    public int getCost() {
    	int CookiesTotal = noofCookies*Euroconvertedrupee;
    	return CookiesTotal;
    }
}
class IceCream extends DesertItem {
	int noOfIceCreames=1;
	int Rupees ;
    public int addIceCreams(int candies){
    	this.noOfIceCreames+=noOfIceCreames;
    	return noOfIceCreames;
    }
    public int getCost() {
    	return noOfIceCreames;
    }
}