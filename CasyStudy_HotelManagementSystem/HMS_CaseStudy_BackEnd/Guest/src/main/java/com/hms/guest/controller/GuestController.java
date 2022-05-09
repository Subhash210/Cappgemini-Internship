package com.hms.guest.controller;

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
import org.springframework.web.client.RestTemplate;

import com.hms.guest.models.Guest;
import com.hms.guest.models.GuestNotification;
import com.hms.guest.service.GuestService;

@RestController
@RequestMapping("/Guest")
@CrossOrigin("*")
public class GuestController {
	@Autowired
	private GuestService service;

	@Autowired
	private GuestNotification notificationDetails;

	@Autowired
	private RestTemplate restTemplate;

	// Retrieves all the guest details form guest repository
	@GetMapping("/getallguests")
	public List<Guest> getGuestList() {
		return service.getallguests();
	}

	// Retrieves the specific guest details using guest ID form the guest repository
	@GetMapping("/getguestbyid")
	public Guest getGuestById(@RequestParam String guestCode) {
		return service.getGuestById(guestCode);
	}

	// Adds the new guest details to the guest repository
	@PostMapping("/addnewguest")
	public void addNewGuest(@RequestBody Guest guest) {
		service.addguest(guest);

		notificationDetails.setPhoneNumber(guest.getPhoneNumber_());
		notificationDetails.setEmailId(guest.getEmailId_());
		notificationDetails.setName(guest.getName_());
		notificationDetails.setGuestCode(guest.getGuestCode_());
		restTemplate.postForObject("http://Notification/Notification/guestnotification", notificationDetails,
				GuestNotification.class);
	}

	// Adds the reserved guest details to the guest repository
	@PostMapping("/addreservedguest")
	public void addGuest(@RequestParam String reservationcode, @RequestParam String roomNo, @RequestBody Guest guest) {
		service.addifGuest(reservationcode, guest, roomNo);

		notificationDetails.setPhoneNumber(guest.getPhoneNumber_());
		notificationDetails.setEmailId(guest.getEmailId_());
		notificationDetails.setName(guest.getName_());
		notificationDetails.setGuestCode(guest.getGuestCode_());
		restTemplate.postForObject("http://Notification/Notification/guestnotification", notificationDetails,
				GuestNotification.class);
	}

	// Updates the guest details in the guest repository
	@PutMapping("/updateGuest")
	public void updateGuest(@RequestBody Guest guest) {
		service.updateGuest(guest);
	}

	// Updates the guest to checkout of the given guest ID
	@PutMapping("/checkoutguest")
	public void updatecheckoutGuest(@RequestParam String guestCode) {
		service.checkoutGuest(guestCode);
	}

	// Deletes the guest of given guest code in the repository
	@DeleteMapping("/deleteguest")
	public void deleteGuest(@RequestParam String guestCode) {
		service.deleteguest(guestCode);
	}

}