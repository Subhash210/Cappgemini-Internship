package com.hms.manager.controller;

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

import com.hms.manager.models.Rooms;

@RestController
@RequestMapping("/manager/rooms")
@CrossOrigin("*")
public class ManagerRoomsController {

	@Autowired
	private RestTemplate restTemplate;

	//Retrieving all rooms details from rooms database 
	@GetMapping("/getallrooms")
	public List<Rooms> getAllRoomsData() {
		ResponseEntity<List<Rooms>> responseEntity = restTemplate.exchange("http://Rooms/Rooms/getallrooms",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Rooms>>() {
				});
		List<Rooms> listOfAllRooms = responseEntity.getBody();
		return listOfAllRooms;
	}

	//Adding room details to the room database
	@PostMapping("/addrooms")
	public void addRooms(@RequestBody Rooms rooms) {
		restTemplate.postForObject("http://Rooms/Rooms/addrooms", rooms, Rooms.class);
	}

	//Deleting room using room number in the database
	@DeleteMapping("/deleteRooms")
	public void deleteRooms(@RequestParam String roomCode) {
		restTemplate.delete("http://Rooms/Rooms/deleteRooms?roomCode=" + roomCode);
	}

}
