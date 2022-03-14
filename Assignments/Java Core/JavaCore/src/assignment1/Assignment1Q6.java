package assignment1;
import java.util.Scanner;

class Login{
    String userId = "subhash",password = "king";
    int attempts=3;
    public String loginUser(String user, String pass) {
    	String output;
    	if((user.equals(userId)) && (pass.equals(password))) {
    	    output="yes";	
    	}else {
    		output="no";
    	}
    	return output;
    	
    	
    	}
    		
  
}
public class Assignment1Q6 {
    public static void main(String[] args) {
    	Login objLogin=new Login();
    	int login_attempts=0;
    	Scanner sc=new Scanner(System.in);
    	while(true){
    		
    		System.out.println("Enter your UserID: ");
    		String user=sc.nextLine();
    		System.out.println("Enter your Password: ");
    		String pass=sc.nextLine();
    		String Login=objLogin.loginUser(user, pass);
    		if(Login.equals("yes")) {
    			System.out.println("Welcome "+user);
    			break;
    		}else {
    			login_attempts++;
    			if (login_attempts==3) {
    				System.out.println("You have entered wrong credentials 3 times");
    				System.out.println("Contact Admin");
    				break;
    			}else{
    				System.out.println("You have entered wrong credentials ,please enter the right credentials.");
    			}}
    		}
    	}
    	
    }
