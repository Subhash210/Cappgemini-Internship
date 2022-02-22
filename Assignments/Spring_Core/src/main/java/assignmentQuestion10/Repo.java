package assignmentQuestion10;

public class Repo {

	private People person1;
	private People person2;

	public String getname(int id) {
		if (person1.getId() == id) {
			return person1.getName();
		}
		return person1.getName();
	}

	public People getPerson1() {
		return person1;
	}

	public People getPerson2() {
		return person2;
	}

	public void setPerson1(People person1) {
		this.person1 = person1;
	}

	public void setPerson2(People person2) {
		this.person2 = person2;
	}

}
