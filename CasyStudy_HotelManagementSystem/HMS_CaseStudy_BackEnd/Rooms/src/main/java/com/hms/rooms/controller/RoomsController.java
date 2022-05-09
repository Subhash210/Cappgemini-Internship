package com.hms.rooms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hms.rooms.models.Rooms;
import com.hms.rooms.service.RoomsService;

@RestController
@RequestMapping("/Rooms")
@CrossOrigin("*")
public class RoomsController {

	@Autowired
	private RoomsService roomservice;

	// Retrieves all the rooms form the rooms database
	@GetMapping("/getallrooms")
	public List<Rooms> getAllRoomsData() {
		return roomservice.getAllRooms();
	}

	// Retrieves all the available rooms to send the guest
	@GetMapping("/availablerooms")
	public List<Rooms> getAvailableRooms() {
		return roomservice.availableRoooms();
	}

	// Adds rooms to the rooms database
	@PostMapping("/addrooms")
	public void addRooms(@RequestBody Rooms rooms) {
		roomservice.addRoom(rooms);
	}

	// Makes the room status active when the guest enters to the room
	@PostMapping("/makestatusactive")
	public void makeStatusActive(@RequestParam String roomNumber) {
		roomservice.makeStatusActive(roomNumber);
	}

	// Makes the room status not active when the guest leaves to the room
	@PostMapping("/makestatusnotactive")
	public void makeStatusNotActive(@RequestParam String roomNumber) {
		roomservice.makeStatusNotActive(roomNumber);
	}

	// Deletes the specific room using the room number provided in the rooms
	// database
	@DeleteMapping("/deleteRooms")
	public void deleteRooms(@RequestParam String roomCode) {
		roomservice.deleteRooms(roomCode);
	}

}