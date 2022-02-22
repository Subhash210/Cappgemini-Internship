package assignment6;
import java.time.LocalDate;    
import java.util.LinkedList;
import java.util.List;
class Dates{
	boolean leap ;
	LocalDate d;
	public Dates(LocalDate d,boolean leap ) {
		super();
		this.leap = leap;
		this.d = d;
	}
	
}

public class Assignment6Q4 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2017, 1, 13);    
	    boolean a1= date1.isLeapYear(); 
	    
	    LocalDate date2 = LocalDate.of(2016, 9, 23);    
	    boolean a2 = date2.isLeapYear();
	    
		List<Dates> L1 = new LinkedList<>();
		Dates d1 = new Dates(date1, a1);
		Dates d2 = new Dates(date1, a2);
		L1.add(d1);
		L1.add(d2);
	   for (Dates dates : L1) {
		   System.out.println("Your Birth date is "+ dates.d + "\n"+" if it is true then it is leap year else not : "+" "+dates.leap );
		
	}
	  }    
      

	}
