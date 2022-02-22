package assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


//Supplier, Consumer, Predicate & Function
public class Assignment8Q3 {

  
	static int modifyValue(int n,Function fun) {

	      return (int)fun.apply(n);
	    }

    static class Product {
    	Supplier<Double> sup =()-> Math.random();
  
    }
   static void display(List<Person> people,Predicate<Person> predicate,Consumer<Person> consumer) { 
    	for(Person p:people) {
    		if(predicate.test(p)) {
    			consumer.accept(p);
    		}
    	}
    	
    }
    public static void main(String[] args) {
    	List<Person> A31=Arrays.asList(
    			new Person("Charl", "James", 25),
    			new Person("Guvvani", "Subhash", 21),
    			new Person("Guvvani", "Laxmi", 45)
    			);

    	  display(A31, p-> p.getFirstname().startsWith("G"), p-> System.out.println(p));
    	  int r =modifyValue(5,val->(Integer)val+ 5);
    	  System.out.println(r);
    	  Product p =new Product();
    	  System.out.println(p.sup.get());	    
    	}
  
}





class Person{
	String firstname;
	String lastname;
	int age;
	public Person(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Pearson [firstname--"+firstname+"\tlastname--"+lastname+"\t\tage--"+age+"]";
		
	}
}

