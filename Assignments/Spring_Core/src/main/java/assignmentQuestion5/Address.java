package assignmentQuestion5;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;

	/*
	 * public Address(String street, String city, String state, int zip, String
	 * country) { super(); this.street = street; this.city = city; this.state =
	 * state; this.zip = zip; this.country = country; }
	 */

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getState() {
		return state;
	}

	public String getStreet() {
		return street;
	}

	public int getZip() {
		return zip;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return this.street + " " + this.city + " " + this.state + " " + this.zip + " " + this.country;
	}

}
