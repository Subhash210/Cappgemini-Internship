package com.hms.reservation.models;

import org.springframework.stereotype.Component;

@Component
public class ReservationNotification {

	private String name;
	private String phoneNumber;
	private String emailId;
	private String reservationCode;

	public ReservationNotification(String name, String phoneNumber, String emailId, String reservationCode) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.reservationCode = reservationCode;
	}

	public ReservationNotification() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getReservationCode() {
		return reservationCode;
	}

	public void setReservationCode(String reservationCode) {
		this.reservationCode = reservationCode;
	}

}
