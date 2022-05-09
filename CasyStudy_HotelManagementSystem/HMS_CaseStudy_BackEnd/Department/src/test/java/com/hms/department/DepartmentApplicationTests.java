package com.hms.department;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.hms.department.models.Department;
import com.hms.department.repository.DepartmentRepository;
import com.hms.department.service.DepartmentService;

@SpringBootTest
class DepartmentApplicationTests {

	@Autowired
	private DepartmentService departmentService;

	@MockBean
	private DepartmentRepository departmentRepository;

	@Test
	public void findAllDepartmentTest() throws ParseException {

		when(departmentRepository.findAll()).thenReturn(Stream
				.of(new Department("D1", "Staff", 12), new Department("D2", "Food", 32)).collect(Collectors.toList()));
		assertEquals(2, departmentService.findAllDepartments().size());
	}

	@Test
	public void addDepartmentTest() throws ParseException {
		Department department = new Department("D1", "Staff", 12);
		when(departmentRepository.insert(department)).thenReturn(department);
		assertEquals(department, departmentService.addDepartment(department));
	}

	@Test
	public void updateDepartmentTest() throws ParseException {

		Department department1 = new Department("D1", "Staff", 12);
		Department department2 = new Department("D1", "Food", 2);

		when(departmentRepository.save(department1)).thenReturn(department2);
		assertEquals(department2, departmentService.updateDepartment(department1));
	}

}