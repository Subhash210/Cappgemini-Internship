package assignmentQuestion10;

public class People {

	int id;
	String name;

	long contactNumber;

	public long getContactNumber() {
		return contactNumber;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "People [name=" + this.getName() + ", contactNumber=" + this.getContactNumber() + "]";
	}

}
