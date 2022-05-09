package com.hms.rooms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.rooms.models.Rooms;
import com.hms.rooms.repository.RoomsRepository;

@Service
public class RoomsService {

	@Autowired
	private RoomsRepository roomrepo;

	// Logic to add the room to the rooms database
	public List<Rooms> addRoom(Rooms rooms) {
		rooms.setRoomStatus_("Not Active");
		roomrepo.insert(rooms);
		List<Rooms> list = roomrepo.findAll();
		list.forEach(p -> p.setTotalRooms_(roomrepo.count()));
		return roomrepo.saveAll(list);
	}

	// Logic to retrieve all the rooms from the rooms database
	public List<Rooms> getAllRooms() {
		return roomrepo.findAll();
	}

	// Logic to retrieve all the available rooms form the rooms database to send the
	// guest
	public List<Rooms> availableRoooms() {
		List<Rooms> list = new ArrayList<>();
		roomrepo.findAll().stream().filter(p -> p.getRoomStatus_().equals("Not Active")).forEach(list::add);
		return list;
	}

	// Logic to make rooms status active
	public Rooms makeStatusActive(String roomNumber) {
		Rooms roomobj = roomrepo.findById(roomNumber).get();
		roomobj.setRoomStatus_("Active");
		return roomrepo.save(roomobj);
	}

	// Logic to make status not active
	public Rooms makeStatusNotActive(String roomNumber) {
		Rooms roomobj = roomrepo.findById(roomNumber).get();
		roomobj.setRoomStatus_("Not Active");
		return roomrepo.save(roomobj);
	}

	// Logic to delete the room form the database
	public void deleteRooms(String roomNo) {
		roomrepo.deleteById(roomNo);
		List<Rooms> list = roomrepo.findAll();
		list.forEach(p -> p.setTotalRooms_(roomrepo.count()));
		roomrepo.saveAll(list);
	}

}