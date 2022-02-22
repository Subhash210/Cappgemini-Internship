package Assignment;
import java.util.Scanner;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	double totalMarks=subject1Marks+subject2Marks+subject3Marks;
    	String P="passed";
    	String F="failed";
    	String PR="promoted";
    	if(totalMarks>=180) {
    		return P;
    	}else if((subject1Marks>=60 && subject2Marks>=60)||( subject2Marks>=60 && subject3Marks>=60)||(subject3Marks>=60 && subject1Marks>=60)) {
    		return PR;
    	}else {
    		return F;
    	}
    }
}
public class Assignment1Q4 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	ResultDeclaration objRD=new ResultDeclaration();
    	System.out.println("Enter subject1 marks: ");
    	double S1=sc.nextDouble();
    	System.out.println("Enter subject2 marks: ");
    	double S2=sc.nextDouble();
    	System.out.println("Enter subject3 marks: ");
    	double S3=sc.nextDouble();
    	String Result= objRD.declareResults(S1, S2, S3);
    	System.out.println(Result);
    	
    	
    }
}