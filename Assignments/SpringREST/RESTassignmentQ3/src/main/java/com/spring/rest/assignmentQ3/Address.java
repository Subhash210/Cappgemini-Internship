package com.spring.rest.assignmentQ3;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Address {
	
	@JsonIgnore
	private int pinCode;
	private String state;
	private String city;
	private String country;
	
	public Address(int pinCode, String state, String city, String country) {
		super();
		this.pinCode = pinCode;
		this.state = state;
		this.city = city;
		this.country = country;
	}

	public Address(Address address) {
		// TODO Auto-generated constructor stub
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
