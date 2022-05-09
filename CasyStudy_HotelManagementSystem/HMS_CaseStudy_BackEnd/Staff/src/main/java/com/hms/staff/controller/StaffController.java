package com.hms.staff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hms.staff.models.Staff;
import com.hms.staff.service.StaffService;

@RestController
@RequestMapping("/staff")
@CrossOrigin("*")
public class StaffController {
	@Autowired
	private StaffService staffservice;

	// Retrieves all the staff details form the staff database
	@GetMapping("/getallstaff")
	public List<Staff> getAllStaff() {
		return staffservice.getAllStaff();
	}

	// Adds the staff to the staff database
	@PostMapping("/addstaff")
	public void addStaff(@RequestBody Staff staff) {
		staffservice.addStaff(staff);
	}

	// Deletes the specific employee using the staff code form the database
	@DeleteMapping("/deletestaff")
	public void deleteById(@RequestParam String staffCode) {
		staffservice.deleteStaffById(staffCode);
	}

	// Updates the staff details in the staff database
	@PutMapping("/updatestaff")
	public Staff updateStaff(@RequestBody Staff staff) {
		return staffservice.updateStaff(staff);
	}

	// Retrieves the specific employee using the staff ID given form the staff
	// database
	@GetMapping("/getstaffbyid")
	public Staff getStaffById(@RequestParam String staffCode) {
		return staffservice.getStaffById(staffCode);
	}

}