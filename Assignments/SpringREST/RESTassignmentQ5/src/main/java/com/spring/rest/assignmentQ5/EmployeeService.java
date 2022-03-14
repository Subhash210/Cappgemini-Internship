package com.spring.rest.assignmentQ5;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	EmployeeRepository customerRepo;

	public List<Employee> getAllemployees() {
		final List<Employee> employeeList = new ArrayList<>();

		customerRepo.findAll().forEach(employeeList::add);
		return employeeList;
	}

	public Employee getEmployeeById(int id) {
		return customerRepo.findById(id).get();
	}

	public Employee addEmployee(Employee emp) {
		return customerRepo.save(emp);
	}

	public boolean deleteEmployee(int id) {
		customerRepo.deleteById(id);
		return true;
	}

	public Employee updateEmployee(Employee emp) {
		return customerRepo.save(emp);
	}

}