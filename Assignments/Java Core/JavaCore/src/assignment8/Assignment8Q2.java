package assignment8;

import java.util.ArrayList;

public class Assignment8Q2 {

    
    public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Assignment8Q2(int totalPrice, String status) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
	}
	
    private int totalPrice;
    private String status;
    
	public String toString() {
		return "\n"+this.getStatus()+"\t"+this.getTotalPrice()+"\n";
		
	}
	
	
	

    public static ArrayList<Assignment8Q2> listOfOrders(ArrayList<Assignment8Q2> orders) {
    	
    	ArrayList<Assignment8Q2> A2 = new ArrayList<Assignment8Q2>();
    	for(Assignment8Q2 o:orders) {
    		if((o.getStatus().equalsIgnoreCase("Accepted")||o.getStatus().equalsIgnoreCase("Completed"))&& o.getTotalPrice()>10000) {
    			A2.add(o);
    		}
    	}
    	return A2;
    	
    	
    }
    public static void main(String[] args) {
    	ArrayList<Assignment8Q2> A21 = new ArrayList<>();
    	
    	Assignment8Q2 A1=new Assignment8Q2(20200, "Accepted");
    	Assignment8Q2 A2=new Assignment8Q2(20100, "Accepted");
    	Assignment8Q2 A3=new Assignment8Q2(10200, "Completed");
    	Assignment8Q2 A4=new Assignment8Q2(10300, "Accepted");
    	Assignment8Q2 A5=new Assignment8Q2(1000, "Declined");
    	
    	A21.add(A1);
    	A21.add(A2);
    	A21.add(A3);
    	A21.add(A4);
    	A21.add(A5);
    	
    	System.out.println(listOfOrders(A21));
    
    	
    }
}