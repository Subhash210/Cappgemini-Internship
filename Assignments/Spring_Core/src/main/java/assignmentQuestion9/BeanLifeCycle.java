package assignmentQuestion9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean {
	private int id;
	private String name;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initization bean");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying the bean");
	}

	public void display() {
		System.out.println("id: " + getId() + "\n" + "Name: " + getName());
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
