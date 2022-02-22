package Assignment2;
/*Write a java class named Shape which has abstract draw() and also classes 
Line, Rectangle, Cube etc. extends Shape to implement the draw method.*/
class Rectangle extends Shape {
    @Override
    public String draw() {
    	String rect="Draw Rectangle";
    	return rect;
    }
}

class Line extends Shape{
    @Override
    public String draw() {
    	String line="Draw Line";
    	return line;
    }
}

class Cube extends Shape {
    @Override
    public String draw() {
    	String cube="Draw Cube";
    	return cube;
    }
}
abstract class Shape {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) {
    	Shape re=new Rectangle();
    	Shape li=new Line();
    	Shape cu=new Cube();
    	String rectangle=re.draw();
    	String line=li.draw();
    	String cube=cu.draw();
    	System.out.print(rectangle+"\n"+line+"\n"+cube);
    }
}

