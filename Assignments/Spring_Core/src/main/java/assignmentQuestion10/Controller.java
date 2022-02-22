package assignmentQuestion10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Controller implements ApplicationContextAware {

	ApplicationContext context;

	public long presentContact(int id) {
		Repo rep = (Repo) context.getBean("repo");
		if (rep.getname(id) == rep.getPerson1().getName()) {
			return rep.getPerson1().getContactNumber();
		}
		return rep.getPerson2().getContactNumber();
	}

	@Override
	public void setApplicationContext(ApplicationContext appplicationcontext) throws BeansException {
		this.context = appplicationcontext;

	}

	public long UpdateContact(int id, long number) {

		Repo rep = (Repo) context.getBean("repo");
		if (rep.getname(id) == rep.getPerson1().getName()) {
			rep.getPerson1().setContactNumber(number);
			return rep.getPerson1().getContactNumber();
		}
		if (rep.getname(id) == rep.getPerson2().getName()) {
			rep.getPerson2().setContactNumber(number);
			return rep.getPerson2().getContactNumber();
		} else {
			System.out.println("Invalid Details" + "/nError code:");
			return 0001;
		}

	}

}
