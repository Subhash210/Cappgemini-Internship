package com.spring.rest.assignmentQ9;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerService {

	@Autowired
	CustomerRepo customerRepo;

	public List<customer> getAllCustomer() {
		final List<customer> customerList = new ArrayList<>();

		customerRepo.findAll().forEach(customerList::add);
		return customerList;
	}

	public customer getCustomerById(int id) {
		return customerRepo.findById(id).get();
	}

	public customer addCustomer(customer cust) {
		return customerRepo.save(cust);
	}

	public boolean deleteCustomer(int id) {
		customerRepo.deleteById(id);
		return true;
	}

	public customer updateEmployee(customer cust) {
		return customerRepo.save(cust);
	}

}