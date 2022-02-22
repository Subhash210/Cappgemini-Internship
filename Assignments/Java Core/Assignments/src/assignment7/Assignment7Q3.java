package assignment7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Assignment7Q3 {
	
	public static void main(String[] args) {
		f o=new f();
		o.method1();
	}
	

}


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
	
	int Sequence(); 
	
}


class f{
	@Execute(Sequence=1)
	void method1() {
		method3();
		//System.out.println("m1");
	}
	
	@Execute(Sequence=2)
	void method3() {
		method2();
		//System.out.println("m1");
	}
	
	@Execute(Sequence=3)
	void method2() {
		System.out.println("fsdghjkbfhdjvhjkfsd");
	}
	
	
}


