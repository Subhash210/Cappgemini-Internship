package assignment7;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Assignment7Q2 {
	public static void main(String[] args) {
		
		main obj= new main();
		Class c=obj.getClass();
		Annotation an= (Annotation) c.getAnnotation(Info.class);
		Info i = (Info) an;
		System.out.println(i.Author()+"\n"+i.AuthorID()+"\n"+i.SuperVisor()+"\n"+i.Date()+"\n"+i.Time()+"\n"+i.Version()+"\n"+i.Description());

		
		
	}}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	int AuthorID();
	String Author();
	String SuperVisor();
	String Date();
	String Time();
	double Version();
	String Description();	
	}
	
@Info(Author = "Subhash", AuthorID = 1, Date = "06/02/2022", Description = "It is a Class", SuperVisor = "Onkar", Time = "9:00Am", Version = 1.25)
class main{
	
	
	}





