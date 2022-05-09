package com.hms.staff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.staff.exception.ResourceNotFoundException;
import com.hms.staff.models.Staff;
import com.hms.staff.repository.StaffRepository;

@Service
public class StaffService {

	@Autowired
	private StaffRepository staffrep;

	// Logic to retrieve all the staff details form the staff database
	public List<Staff> getAllStaff() {
		return (List<Staff>) staffrep.findAll();
	}

	// Logic to add the employee to the staff database
	public Staff addStaff(Staff staff) {
		staff.setStaffCode("SF" + (staffrep.count() + 1));
		return staffrep.insert(staff);
	}

	// Logic to delete the specific employee using the staff code
	public void deleteStaffById(String staffCode) {
		staffrep.deleteById(staffCode);
	}

	// Logic to update the staff in the staff repository
	public Staff updateStaff(Staff staff) {
		return staffrep.save(staff);
	}

	// Logic to retrieve specific employee using the staff code
	public Staff getStaffById(String staffCode) {
		return staffrep.findById(staffCode)
				.orElseThrow(() -> new ResourceNotFoundException("staff code " + staffCode + " is not found"));
	}

}