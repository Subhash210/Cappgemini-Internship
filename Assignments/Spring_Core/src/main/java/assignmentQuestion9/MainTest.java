package assignmentQuestion9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("question9.xml");
		context.registerShutdownHook();

		BeanLifeCycle beanLifeCycle = (BeanLifeCycle) context.getBean("LifeCycle1");
		beanLifeCycle.display();
	}
}