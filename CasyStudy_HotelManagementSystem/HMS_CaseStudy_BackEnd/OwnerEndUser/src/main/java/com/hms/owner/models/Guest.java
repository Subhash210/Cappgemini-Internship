package com.hms.owner.models;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
public class Guest {

	private String guestCode_;
	private String reservationCode;
	private String roomNumber;
	private Date todayDate_;
	private int numberOfAdult;
	private int numberOfChildren;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date checkIn;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date checkOut;
	private int numberOfNights;
	private String name_;
	private String emailId_;
	private String phoneNumber_;
	private String gender_;
	private String address_;
	private String company_;
	private String guestStatus_;

	public Guest() {
	}

	public Guest(String guestCode_, String reservationCode, String roomNumber, Date todayDate_, int numberOfAdult,
			int numberOfChildren, Date checkIn, Date checkOut, int numberOfNights, String name_, String emailId_,
			String phoneNumber_, String gender_, String address_, String company_, String guestStatus_) {
		super();
		this.guestCode_ = guestCode_;
		this.reservationCode = reservationCode;
		this.roomNumber = roomNumber;
		this.todayDate_ = todayDate_;
		this.numberOfAdult = numberOfAdult;
		this.numberOfChildren = numberOfChildren;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.numberOfNights = numberOfNights;
		this.name_ = name_;
		this.emailId_ = emailId_;
		this.phoneNumber_ = phoneNumber_;
		this.gender_ = gender_;
		this.address_ = address_;
		this.company_ = company_;
		this.guestStatus_ = guestStatus_;
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

	public String getGuestCode_() {
		return guestCode_;
	}

	public void setGuestCode_(String guestCode_) {
		this.guestCode_ = guestCode_;
	}

	public String getReservationCode() {
		return reservationCode;
	}

	public void setReservationCode(String reservationCode) {
		this.reservationCode = reservationCode;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getTodayDate_() {
		return todayDate_;
	}

	public void setTodayDate_(Date todayDate_) {
		this.todayDate_ = todayDate_;
	}

	public String getName_() {
		return name_;
	}

	public void setName_(String name_) {
		this.name_ = name_;
	}

	public String getEmailId_() {
		return emailId_;
	}

	public void setEmailId_(String emailId_) {
		this.emailId_ = emailId_;
	}

	public String getPhoneNumber_() {
		return phoneNumber_;
	}

	public void setPhoneNumber_(String phoneNumber_) {
		this.phoneNumber_ = phoneNumber_;
	}

	public String getGender_() {
		return gender_;
	}

	public void setGender_(String gender_) {
		this.gender_ = gender_;
	}

	public String getAddress_() {
		return address_;
	}

	public void setAddress_(String address_) {
		this.address_ = address_;
	}

	public String getCompany_() {
		return company_;
	}

	public void setCompany_(String company_) {
		this.company_ = company_;
	}

	public String getGuestStatus_() {
		return guestStatus_;
	}

	public void setGuestStatus_(String guestStatus_) {
		this.guestStatus_ = guestStatus_;
	}

}