package com.hms.notification.models;

import org.springframework.stereotype.Component;

@Component
public class GuestNotification {

	private String GuestCode;
	private String name;
	private String phoneNumber;
	private String emailId;

	public GuestNotification(String guestCode, String name, String phoneNumber, String emailId) {
		super();
		GuestCode = guestCode;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}

	public GuestNotification() {
		super();
	}

	public String getGuestCode() {
		return GuestCode;
	}

	public void setGuestCode(String guestCode) {
		GuestCode = guestCode;
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

}
