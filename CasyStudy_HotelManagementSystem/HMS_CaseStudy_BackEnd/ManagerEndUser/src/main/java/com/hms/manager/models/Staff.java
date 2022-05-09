package com.hms.manager.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Staff")
public class Staff {

	@Id
	private String staffCode;
	private String departmentId;
	private String employeeName;
	private String phoneNo;
	private String email;
	private int age;
	private String employeeAddress;
	private Double salary;

	public Staff() {
	}

	public Staff(String staffCode, String departmentId, String employeeName, String phoneNo, String email, int age,
			String employeeAddress, Double salary) {
		super();
		this.staffCode = staffCode;
		this.departmentId = departmentId;
		this.employeeName = employeeName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.age = age;
		this.employeeAddress = employeeAddress;
		this.salary = salary;
	}

	public String getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}