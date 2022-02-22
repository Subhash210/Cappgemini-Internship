package assignment6;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;

class Employee {
	
	int id;
	String name;
	String department;
	long salary;
	public Employee(int id, String name, String department, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
}
public class Assignment6Q3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		choice();
		String choice=sc.nextLine();
		if(choice.equalsIgnoreCase("a")) {
		TreeSet<Employee> idC=new TreeSet<>(new Assignment6Q3_idComparator());
		Employee E1 = new Employee(1, "Sanjana", "Ece", 10000);
		Employee E2 = new Employee(2, "Manasa", "Mec", 25000);
		Employee E3 = new Employee(3, "Rakesh", "Web", 30200);
		Employee E4 = new Employee(4, "Subhash", "Cap", 27300);
		Employee E5 = new Employee(5, "Sanketh", "Ca", 27100);
		Employee E6 = new Employee(6, "Rohith", "Am", 320000);
		Employee E7 = new Employee(7, "Captain America", "MarvelC", 2000000);
		Employee E8 = new Employee(8, "Iron Man", "MarvelI", 2000100);
		Employee E9 = new Employee(9, "Black Panthar", "MarvelB", 210000);
		Employee E10 = new Employee(10,"Steve Rogers", "MarvelS", 300000);
		
		idC.add(E1);
		idC.add(E2);
		idC.add(E3);
		idC.add(E4);
		idC.add(E5);
		idC.add(E6);
		
		idC.add(E7);
		idC.add(E8);
		idC.add(E9);
		idC.add(E10);

		for(Employee e:idC) {
			System.out.println("id:"+e.id+"\t"+"Name:"+e.name+"\t"+"Department:"+e.department+"\t"+"Salary:"+e.salary);
		}}else if(choice.equalsIgnoreCase("b")) {
			
			TreeSet<Employee> idC=new TreeSet<>(new Assignment6Q3_nameComparator());
			Employee E1 = new Employee(1, "Sanjana", "Ece", 10000);
			Employee E2 = new Employee(2, "Manasa", "Mec", 25000);
			Employee E3 = new Employee(3, "Rakesh", "Web", 30200);
			Employee E4 = new Employee(4, "Subhash", "Cap", 27300);
			Employee E5 = new Employee(5, "Sanketh", "Ca", 27100);
			Employee E6 = new Employee(6, "Rohith", "Am", 320000);
			Employee E7 = new Employee(7, "Captain America", "MarvelC", 2000000);
			Employee E8 = new Employee(8, "Iron Man", "MarvelI", 2000100);
			Employee E9 = new Employee(9, "Black Panthar", "MarvelB", 210000);
			Employee E10 = new Employee(10,"Steve Rogers", "MarvelS", 300000);
			
			idC.add(E1);
			idC.add(E2);
			idC.add(E3);
			idC.add(E4);
			idC.add(E5);
			idC.add(E6);
			
			idC.add(E7);
			idC.add(E8);
			idC.add(E9);
			idC.add(E10);

			for(Employee e:idC) {
				System.out.println("id:"+e.id+"\t"+"Name:"+e.name+"\t"+"Department:"+e.department+"\t"+"Salary:"+e.salary);
			}}else if(choice.equalsIgnoreCase("c")) {
				TreeSet<Employee> idC=new TreeSet<>(new Assignment6Q3_DepartmentComparator());
				Employee E1 = new Employee(1, "Sanjana", "Ece", 10000);
				Employee E2 = new Employee(2, "Manasa", "Mec", 25000);
				Employee E3 = new Employee(3, "Rakesh", "Web", 30200);
				Employee E4 = new Employee(4, "Subhash", "Cap", 27300);
				Employee E5 = new Employee(5, "Sanketh", "Ca", 27100);
				Employee E6 = new Employee(6, "Rohith", "Am", 320000);
				Employee E7 = new Employee(7, "Captain America", "MarvelC", 2000000);
				Employee E8 = new Employee(8, "Iron Man", "MarvelI", 2000100);
				Employee E9 = new Employee(9, "Black Panthar", "MarvelB", 210000);
				Employee E10 = new Employee(10,"Steve Rogers", "MarvelS", 300000);
				
				idC.add(E1);
				idC.add(E2);
				idC.add(E3);
				idC.add(E4);
				idC.add(E5);
				idC.add(E6);
				
				idC.add(E7);
				idC.add(E8);
				idC.add(E9);
				idC.add(E10);

				for(Employee e:idC) {
					System.out.println("id:"+e.id+"\t"+"Name:"+e.name+"\t"+"Department:"+e.department+"\t"+"Salary:"+e.salary);
				}}else if(choice.equalsIgnoreCase("d")) {
					TreeSet<Employee> idC=new TreeSet<>(new Assignment6Q3_SalaryComparator());
					Employee E1 = new Employee(1, "Sanjana", "Ece", 10000);
					Employee E2 = new Employee(2, "Manasa", "Mec", 25000);
					Employee E3 = new Employee(3, "Rakesh", "Web", 30200);
					Employee E4 = new Employee(4, "Subhash", "Cap", 27300);
					Employee E5 = new Employee(5, "Sanketh", "Ca", 27100);
					Employee E6 = new Employee(6, "Rohith", "Am", 320000);
					Employee E7 = new Employee(7, "Captain America", "MarvelC", 2000000);
					Employee E8 = new Employee(8, "Iron Man", "MarvelI", 2000100);
					Employee E9 = new Employee(9, "Black Panthar", "MarvelB", 210000);
					Employee E10 = new Employee(10,"Steve Rogers", "MarvelS", 300000);
					
					idC.add(E1);
					idC.add(E2);
					idC.add(E3);
					idC.add(E4);
					idC.add(E5);
					idC.add(E6);
					
					idC.add(E7);
					idC.add(E8);
					idC.add(E9);
					idC.add(E10);

					for(Employee e:idC) {
						System.out.println("id:"+e.id+"\t"+"Name:"+e.name+"\t"+"Department:"+e.department+"\t"+"Salary:"+e.salary);
					}}else {
						System.out.println("Invalid Input");
					}
		
		
		
		
		

		
	}
	
	static void choice() {
		System.out.println("Select one sorting option from below");
		System.out.println("a) ID\nb) Name\nc) Department\nd) Salary");
	}
	
}


class Assignment6Q3_idComparator implements Comparator<Employee> {


	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	
	
}

class Assignment6Q3_nameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareToIgnoreCase(o2.getName());
	}
	
}
class Assignment6Q3_DepartmentComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getDepartment().compareToIgnoreCase(o2.getDepartment());
	}

}
class Assignment6Q3_SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getSalary()-o2.getSalary());
	}
	
	
}

