package assignmentQuestion6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("question6.xml");

		Properties properties1 = context.getBean(Properties.class);

		properties1.properties();

	}
}