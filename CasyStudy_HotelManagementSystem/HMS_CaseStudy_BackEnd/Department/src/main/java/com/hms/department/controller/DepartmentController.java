package com.hms.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hms.department.models.Department;
import com.hms.department.service.DepartmentService;

@RestController
@RequestMapping("/department")
@CrossOrigin("*")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	// Retrieves all the departments form department repository
	@GetMapping("/getalldepartments")
	public List<Department> findAllDepartment() {
		return departmentService.findAllDepartments();
	}

	// Retrieves specific department details with department ID
	@GetMapping("/getdepartmentbyid")
	public Department findById(@RequestParam String departmentId) {
		return departmentService.findById(departmentId);
	}

	// Adds the department details to the repository
	@PostMapping("/addepartment")
	public void addDepartment(@RequestBody Department deaprtment) {
		departmentService.addDepartment(deaprtment);
	}
}
