package assignmentQuestion4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("question4.xml");
		BankAccountController control = (BankAccountController) context.getBean("bankcontroller");

		System.out.println(control.getBalance(1));
		System.out.println(control.deposit(1, 10000));
		System.out.println("-------------------------------------------");
		System.out.println(control.withdraw(1, 50000));
		System.out.println(control.getBalance(1));
		System.out.println("-------------------------------------------");
		System.out.println(control.fundTransfer(1, 2, 15000));

	}

}
