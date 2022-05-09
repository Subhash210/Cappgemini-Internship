package com.hms.owner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hms.owner.models.Reservation;

@RestController
@RequestMapping("/owner/reservation")
@CrossOrigin("*")
public class OwnerReservationcontroller {

	@Autowired
	private RestTemplate restTemplate;

	// Retrieves the specific reservation form the reservation database using the
	// given reservation code
	@GetMapping("/getreservationbyid")
	public Reservation reservationById(@RequestParam String id) {
		return restTemplate.getForObject("http://Reservation/reservation/getreservationbyid?id=" + id,
				Reservation.class);
	}

	// Retrieves all the reservation available in the reservation database
	@GetMapping("/getallreservation")
	public List<Reservation> allReservations() {
		ResponseEntity<List<Reservation>> responseEntity = restTemplate.exchange(
				"http://Reservation/reservation/getallreservation", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Reservation>>() {
				});
		List<Reservation> listOfReservation = responseEntity.getBody();
		return listOfReservation;
	}

	// Adds the new reservation to the reservation database
	@PostMapping("/addreservation")
	public void postReservation(@RequestBody Reservation reservation) {
		restTemplate.postForObject("http://Reservation/reservation/addreservation", reservation, Reservation.class);
	}

	// updates the reservation in the reservation database
	@PutMapping("/updatereservation")
	public void updateReservation(@RequestBody Reservation reservation) {
		restTemplate.put("http://Reservation/reservation/updatereservation", reservation, Reservation.class);
	}

}
