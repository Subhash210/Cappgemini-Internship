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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hms.owner.models.Rooms;

@RestController
@RequestMapping("/owner/rooms")
@CrossOrigin("*")
public class OwnerRoomsController {

	@Autowired
	private RestTemplate restTemplate;

	// Retrieves all the rooms form the rooms database
	@GetMapping("/getallrooms")
	public List<Rooms> getAllRoomsData() {
		ResponseEntity<List<Rooms>> responseEntity = restTemplate.exchange("http://Rooms/Rooms/getallrooms",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Rooms>>() {
				});
		List<Rooms> listOfAllRooms = responseEntity.getBody();
		return listOfAllRooms;
	}

	// Adds the room to the rooms database
	@PostMapping("/addrooms")
	public void addRooms(@RequestBody Rooms rooms) {
		restTemplate.postForObject("http://Rooms/Rooms/addrooms", rooms, Rooms.class);
	}

	// Deletes the room form the rooms database using the given room code
	@DeleteMapping("/deleteRooms")
	public void deleteRooms(@RequestParam String roomCode) {
		restTemplate.delete("http://Rooms/Rooms/deleteRooms?roomCode=" + roomCode);
	}

}
