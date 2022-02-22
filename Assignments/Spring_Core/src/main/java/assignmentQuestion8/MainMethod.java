package assignmentQuestion8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("question8.xml");
		Sorting sort = (Sorting) context.getBean("sort");

		int result = sort.sorting(new int[] { 1, 2, 3, 4, 5, 6 });
		System.out.println(result);
		context.close();
	}

}
