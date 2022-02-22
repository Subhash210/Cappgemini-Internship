package assignmentQuestion6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dbConfig.properties")
public class Properties {

	@Value("${dburl}")
	private String driver_class_name;

	@Value("${dburl}")
	private String dburl;

	@Value("${password}")
	private String username;

	@Value("${username}")
	private String password;

	public String getDburl() {
		return dburl;
	}

	public String getDriver_class_name() {
		return driver_class_name;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public void properties() {
		System.out.println(getDburl());

	}

}
