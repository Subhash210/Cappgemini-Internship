package com.hms.receptionist.model;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
public class Reservation {

	private String reservationCode_;
	private int numberOfAdult;
	private int numberOfChildren;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date checkIn;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date checkOut;
	private int numberOfNights;
	private String name;
	private String emailId;
	private String phoneNumber;
	private String gender;
	private String address;
	private String company;
	private String status_;

	public Reservation() {
	}

	public Reservation(String reservationCode_, int numberOfAdult, int numberOfChildren, Date checkIn, Date checkOut,
			int numberOfNights, String name, String emailId, String phoneNumber, String gender, String address,
			String company, String status_) {
		super();
		this.reservationCode_ = reservationCode_;
		this.numberOfAdult = numberOfAdult;
		this.numberOfChildren = numberOfChildren;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.numberOfNights = numberOfNights;
		this.name = name;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.address = address;
		this.company = company;
		this.status_ = status_;
	}

	public String getReservationCode_() {
		return reservationCode_;
	}

	public void setReservationCode_(String reservationCode_) {
		this.reservationCode_ = reservationCode_;
	}

	public int getNumberOfAdult() {
		return numberOfAdult;
	}

	public void setNumberOfAdult(int numberOfAdult) {
		this.numberOfAdult = numberOfAdult;
	}

	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public int getNumberOfNights() {
		return numberOfNights;
	}

	public void setNumberOfNights(int numberOfNights) {
		this.numberOfNights = numberOfNights;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getStatus_() {
		return status_;
	}

	public void setStatus_(String status_) {
		this.status_ = status_;
	}

}