package assignment5;


import java.util.HashSet;
class Employee {
	int id;
	String name;
	int salary;
	String department;
	public Employee(int id, String name, int salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}	
	
public String displayDetails() {
	return "id:"+id+"\t"+"name:"+name+"\t"+"salary:"+salary+"\t"+"department:"+department;
}
}

public class Assignment5Q1 {
	
	public static void main(String[] args) {	
		HashSet<Employee> H1 = new HashSet<>();
		Employee E1 = new Employee(1, "Akash", 100, "ECE");
		Employee E2 = new Employee(2, "Balu", 200, "CSE");
		Employee E3 = new Employee(3, "Chakri", 300, "MCE");
		Employee E4 = new Employee(4, "Dom", 400, "HCE");
		Employee E5 = new Employee(5, "Eshwar", 500, "MPC");
		H1.add(E1);
		H1.add(E2);
		H1.add(E3);
		H1.add(E4);
		H1.add(E5);
		
		for(Employee e:H1) {
			System.out.println(e.displayDetails());
		}
		
	}
	
}

