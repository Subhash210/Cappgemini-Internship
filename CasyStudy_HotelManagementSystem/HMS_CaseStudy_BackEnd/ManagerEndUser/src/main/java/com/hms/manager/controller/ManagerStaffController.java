package com.hms.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hms.manager.models.Rates;
import com.hms.manager.models.Staff;

@RestController
@Document("/manager/staff")
@CrossOrigin("*")
public class ManagerStaffController {

	@Autowired
	private RestTemplate restTemplate;

	//Getting all staff details from the database
	@GetMapping("/getallstaff")
	public List<Staff> getGuestList() {
		ResponseEntity<List<Staff>> responseEntity = restTemplate.exchange("http://Staff/staff/getallstaff",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Staff>>() {
				});
		List<Staff> listOfStaff = responseEntity.getBody();
		return listOfStaff;
	}

	//Adding staff to the staff database
	@PostMapping("/addstaff")
	public void addStaff(@RequestBody Staff staff) {
		restTemplate.postForObject("http://Staff/staff/addstaff", staff, Rates.class);

	}

	//Retrieving specific employee using staff code from staff database
	@GetMapping("/getstaffbyid")
	public Staff getStaffById(@RequestParam String staffCode) {
		return restTemplate.getForObject("http://Staff/staff/getstaffbyid?staffCode=" + staffCode, Staff.class);
	}

	//Updating staff details in the staff database
	@PutMapping("/updatestaff")
	public void updateStaff(@RequestBody Staff staff) {
		restTemplate.put("http://Staff/staff/updatestaff", staff, Staff.class);
	}

	//Deleting specific employee using staff code in the staff database
	@DeleteMapping("/deletestaff")
	public void deleteById(@RequestParam String staffCode) {
		restTemplate.delete("http://Staff/staff/deletestaff?staffCode=" + staffCode);
	}
}
