package assignmentQuestion10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("question10.xml");
		Controller control = (Controller) context.getBean("controller");

		System.out.println(
				"Updated contact from: " + control.presentContact(1) + " to " + control.UpdateContact(1, 6303150763L));

	}
}