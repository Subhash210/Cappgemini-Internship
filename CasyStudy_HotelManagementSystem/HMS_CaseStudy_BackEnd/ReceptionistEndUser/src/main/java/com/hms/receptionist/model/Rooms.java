package com.hms.receptionist.model;

import org.springframework.stereotype.Component;

@Component
public class Rooms {

	private String roomNumber;
	private String roomStatus_;
	private Long totalRooms_;

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomStatus_() {
		return roomStatus_;
	}

	public void setRoomStatus_(String roomStatus_) {
		this.roomStatus_ = roomStatus_;
	}

	public Long getTotalRooms_() {
		return totalRooms_;
	}

	public void setTotalRooms_(Long totalRooms_) {
		this.totalRooms_ = totalRooms_;
	}

}
