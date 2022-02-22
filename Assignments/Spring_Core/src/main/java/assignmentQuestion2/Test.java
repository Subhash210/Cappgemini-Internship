package assignmentQuestion2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("question2.xml");

		QuestionA q = (QuestionA) context.getBean("questionA");
		q.QuestionAndAnswers();
		System.out.println("---------------------------------");

		QuestionB qB = (QuestionB) context.getBean("questionB");
		qB.QuestionAndAnswers();

		System.out.println("---------------------------------");
		QuestionC qC = (QuestionC) context.getBean("questionC");
		qC.QuestionAndAnswers();

	}
}
