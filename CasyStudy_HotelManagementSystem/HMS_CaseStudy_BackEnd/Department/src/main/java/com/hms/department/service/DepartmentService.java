package com.hms.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.department.exception.ResourceNotFoundException;
import com.hms.department.models.Department;
import com.hms.department.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	// Logic to add the department details to the department repository
	public Department addDepartment(Department department) {
		return departmentRepository.insert(department);
	}

	// Logic to update the department details in the department repository
	public Department updateDepartment(Department department) {
		return departmentRepository.save(department);
	}

	// Logic to retrieve all the department details from the department repository
	public List<Department> findAllDepartments() {
		return departmentRepository.findAll();
	}

	// Logic to retrieve a specific department details from department repository
	// using department ID
	public Department findById(String departmentId) {
		return departmentRepository.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException("Department Id " + departmentId + " is not found"));
	}

}
