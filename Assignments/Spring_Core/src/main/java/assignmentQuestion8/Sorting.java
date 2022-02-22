package assignmentQuestion8;

import java.util.Arrays;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Sorting implements InitializingBean, DisposableBean {

	public void afterPropertiesSet() throws Exception {
		System.out.println("Initial method called");

	}

	public void destroy() throws Exception {
		System.out.println("Destroy Method called");

	}

	// @PostConstruct
	public void postconstruct() {
		System.out.println("Post Construct Method Called");
	}

	// @PreDestroy
	public void predestry() {
		System.out.println("Pre Destroy Method Called");
	}

	public int sorting(int[] numList) {
		Arrays.sort(numList);
		return numList[numList.length - 1];
	}

}
