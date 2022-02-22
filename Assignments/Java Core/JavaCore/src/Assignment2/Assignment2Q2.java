package Assignment2;

import java.util.ArrayList;

class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        int totalSalary=salary+incentive;
        return totalSalary;
        
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        int totalSalary=salary+overtime;
        return totalSalary;
    }
}

public class Assignment2Q2 {
    int salary = 20000;
    public int getSalary(int salary){
    	this.salary=salary;
    	return salary;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    	int totalSalary=0;
    	for(int i:employeeSalaries) {
    		totalSalary+=i;
    	}
    	return totalSalary;
    	
    }
    public static void main(String[] args) {
    	Assignment2Q2 AQ2=new Assignment2Q2();
    	 Manager MS=new Manager();
    	 int managerSalary=MS.getSalary(AQ2.salary);
    	 Labour LS=new Labour();
    	 int labourSalary=LS.getSalary(AQ2.salary);
    	 ArrayList<Integer>employeeSalaryList=new ArrayList<>();
    	 employeeSalaryList.add(managerSalary);
    	 employeeSalaryList.add(labourSalary);
    	 int total=AQ2.totalEmployeesSalary(employeeSalaryList);
    	 System.out.println("Total Employees Salary is: "+total);
    	
    }
}

