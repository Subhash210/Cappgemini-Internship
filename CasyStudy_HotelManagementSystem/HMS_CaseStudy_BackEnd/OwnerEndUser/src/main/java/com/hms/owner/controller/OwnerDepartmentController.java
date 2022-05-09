package com.hms.owner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hms.owner.models.Department;

@RestController
@RequestMapping("/owner/department")
@CrossOrigin("*")
public class OwnerDepartmentController {

	@Autowired
	private RestTemplate restTemplate;

	// Retrieves all the department details from the department database
	@GetMapping("/getalldepartments")
	public List<Department> findAllDepartment() {
		ResponseEntity<List<Department>> responseEntity = restTemplate.exchange(
				"http://Department/department/getalldepartments", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Department>>() {
				});
		List<Department> listOfDepartment = responseEntity.getBody();
		return listOfDepartment;
	}

	// Retrieves the specific department using the department id from the department
	// database
	@GetMapping("/getdepartmentbyid")
	public Department findById(@RequestParam String departmentId) {
		return restTemplate.getForObject("http://Department/department/getdepartmentbyid?departmentId=" + departmentId,
				Department.class);
	}

	// Adds the new department to the department database
	@PostMapping("/adddepartment")
	public void addDepartment(@RequestBody Department deaprtment) {
		restTemplate.postForObject("http://Department/department/addepartment", deaprtment, Department.class);
	}

}
