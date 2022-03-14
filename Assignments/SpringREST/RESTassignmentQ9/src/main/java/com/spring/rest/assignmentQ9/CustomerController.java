package com.spring.rest.assignmentQ9;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public List<customer> getAllDetails() {
		List<customer> customerList = customerService.getAllCustomer();
		return customerList;
	}

	@RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
	public customer getCustomerById(@PathVariable("id") int id) {
		return customerService.getCustomerById(id);
	}

	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public customer addCustomer(@RequestBody customer customer) {
		return customerService.addCustomer(customer);

	}

	@RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
	public boolean deleteCustomer(@PathVariable("id") int id) {
		return customerService.deleteCustomer(id);

	}

	@RequestMapping(value = "/customer", method = RequestMethod.PUT)
	public customer updateEmployee(@RequestBody customer cust) {
		return customerService.updateEmployee(cust);
	}
}