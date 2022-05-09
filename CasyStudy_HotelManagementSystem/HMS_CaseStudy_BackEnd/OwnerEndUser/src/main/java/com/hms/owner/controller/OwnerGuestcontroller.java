package com.hms.owner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hms.owner.models.Guest;

@RestController
@RequestMapping("/owner/guest")
@CrossOrigin("*")
public class OwnerGuestcontroller {

	@Autowired
	private RestTemplate restTemplate;

	// Retrieves all the guests form the guest database
	@GetMapping("/getallguests")
	public List<Guest> getGuestList() {
		ResponseEntity<List<Guest>> responseEntity = restTemplate.exchange("http://Guest/Guest/getallguests",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Guest>>() {
				});
		List<Guest> listOfGuest = responseEntity.getBody();
		return listOfGuest;
	}

	// Retrieves specific guest details from the guest database using given guest
	// code
	@GetMapping("/getguestbyid")
	public Guest getGuestById(@RequestParam String guestCode) {
		return restTemplate.getForObject("http://Guest/Guest/getguestbyid?guestCode=" + guestCode, Guest.class);
	}

	// Adds new guest to the guest database
	@PostMapping("/addnewguest")
	public void addNewGuest(@RequestBody Guest guest) {
		restTemplate.postForObject("http://Guest/Guest/addnewguest", guest, Guest.class);
	}

	// Adds the reserved guest to the guest database
	@PostMapping("/addreservedguest")
	public void addGuest(@RequestParam String reservationcode, @RequestParam String roomNo, @RequestBody Guest guest) {
		restTemplate.postForObject(
				"http://Guest/Guest/addreservedguest?reservationcode=" + reservationcode + "&roomNo=" + roomNo, guest,
				Guest.class);

	}

	// Updates the guest details in the guest database
	@PutMapping("/updateGuest")
	public void updateGuest(@RequestBody Guest guest) {
		restTemplate.put("http://Guest/Guest/updateGuest", guest, Guest.class);
	}

	// Checkout the guest using given guest code, when guest is leaving the hotel
	@PutMapping("/checkoutguest")
	public void updatecheckoutGuest(@RequestParam String guestCode) {
		restTemplate.put("http://Guest/Guest/checkoutguest?guestCode=" + guestCode, Guest.class);
	}

	// Deletes the guest form the guest database
	@DeleteMapping("/deleteguest")
	public void deleteGuest(@RequestParam String guestCode) {
		restTemplate.delete("http://Guest/Guest/deleteguest?guestCode=" + guestCode);
	}

}
