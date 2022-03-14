package assignment2;

class SingletonInheritanceCheck{
	private static SingletonInheritanceCheck sIc=null;
	public String s;
	private SingletonInheritanceCheck() {
		s="I am singleton Class";
	}
	public static SingletonInheritanceCheck singleton() {
		if(sIc==null) {
			sIc= new SingletonInheritanceCheck();
		}
		return sIc;
	}
	
}
public class Assignment2Q1 {
	public static void main(String[] args) {
		SingletonInheritanceCheck sIc=SingletonInheritanceCheck.singleton();
		System.out.println(sIc);
		SingletonInheritanceCheck sIc1=SingletonInheritanceCheck.singleton();
		sIc.s="I am out of here";
		sIc1.s="Get lost";
		String i=sIc.s;
		String j=sIc1.s;
		System.out.println(i);
		System.out.println(j);
		
	}
}