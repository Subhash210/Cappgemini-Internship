package assignment2;

abstract class Question4{
	abstract public String anything();
}
class Firt{
	//can not create abstract method in normal class, can only create in abstract class.
	//abstract void String() {};
}
public class Assignment2Q4 {
	public static void main(String[] args) {
		//Abstract class can not instantiated.
		//Question4 q4=new Question4();
	}
}
class third extends Question4{
	public void String() {}

	@Override
	public java.lang.String anything() {
		// TODO Auto-generated method stub
		return null;
	};
}
abstract class Test{
	//Writing methods is not compulsory.
}
// abstract classes can not be private
/*private abstract class Question4{
	abstract public String anything();
}*/
//abstract classes can not be final.
/*final abstract class Question4{
	abstract public String anything();
}*/