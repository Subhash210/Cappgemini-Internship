package assignment9;

import java.util.ArrayList;
import java.util.List;

class Fruit {
    private String name;
    private int calories;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	private int price;
    private String color;
    
    
    public String toString() {
		return this.getName()+"  "+this.getPrice()+"  "+this.getCalories()+"  "+this.getColor();
    	
    }
}

public class Assignment9Q1  {
    public static List<String> reverseSort(ArrayList<Fruit> fruits) {
    	//ArrayList<Fruit> newFruit=(ArrayList<Fruit>)
    	List<String> Fn =  fruits.stream().sorted(((p1,p2)->p1.getCalories()-p2.getCalories()))
    			.filter(i->i.getCalories()<100)
    			.map(i->i.getName()).toList();
    	List<String> list = new ArrayList<String>();
    	for (int i = Fn.size() - 1; i >= 0; i--) {
    		String s = Fn.get(i);
    		list.add(s);
    	}		
    	return list;}
    public static List<String> sort(ArrayList<Fruit> fruits) {
    	List<String> list = fruits.stream().sorted((p1,p2)->p1.getColor().compareToIgnoreCase(p2.getColor())).map(p->p.getName()).toList();
    	return list;
    }

   public static List<Fruit>  filterRedSortPrice(ArrayList<Fruit> fruits){
	  List<Fruit> list =  fruits.stream().sorted((p1,p2)->p1.getPrice()-p2.getPrice()).filter(p->p.getColor().equalsIgnoreCase("red")).toList();
	  
	   return list;
   }

    public static void main(String[] args) {
    	ArrayList<Fruit> L1= new ArrayList<>();
    	Fruit F1 = new Fruit("Orange", 22, 40, "orange");
    	Fruit F2 = new Fruit("Apple", 66, 50, "Green");
    	Fruit F3 = new Fruit("Bal",122,102,"A");
    	Fruit F4 = new Fruit("Straw Berry",125,23,"Red");
    	Fruit F5 = new Fruit("Orange", 22, 40, "orange");
    	Fruit F6 = new Fruit("Apple", 66, 50, "Green");
    	Fruit F7 = new Fruit("Bal",122,102,"A");
    	Fruit F8 = new Fruit("Straw Berry",125,23,"Red");
    	Fruit F9 = new Fruit("Orange", 22, 40, "orange");
    	Fruit F10 = new Fruit("Apple", 66, 50, "Green");
    	Fruit F11 = new Fruit("Bal",122,102,"A");
    	Fruit F12 = new Fruit("Straw Berry",125,23,"Red");
    	
    	L1.add(F1);
    	L1.add(F2);
    	L1.add(F3);
    	L1.add(F4);
    	L1.add(F5);
    	L1.add(F6);
    	L1.add(F7);
    	L1.add(F12);
    	L1.add(F8);
    	L1.add(F9);
    	L1.add(F10);
    	L1.add(F11);
    	
    	System.out.println(Assignment9Q1.reverseSort(L1));
    	System.out.println(Assignment9Q1.sort(L1));
    	System.out.println(Assignment9Q1.filterRedSortPrice(L1));
    }

}
