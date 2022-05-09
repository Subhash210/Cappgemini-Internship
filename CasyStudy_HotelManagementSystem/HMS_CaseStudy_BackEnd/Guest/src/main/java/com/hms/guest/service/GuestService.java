package com.hms.guest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hms.guest.exception.ResourceNotFoundException;
import com.hms.guest.models.Guest;
import com.hms.guest.models.Reservation;
import com.hms.guest.repository.GuestRepository;

@Service
public class GuestService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	Guest guest;

	@Autowired
	private GuestRepository guestrepo;

	//Adding the new guest to guest repository
	public Guest addguest(Guest guest) {
		guest.setGuestStatus_("Checked In");
		restTemplate.postForObject("http://Rooms/Rooms/makestatusactive?roomNumber=" + guest.getRoomNumber(), guest,
				Guest.class);
		guest.setGuestCode_("G" + (guestrepo.count() + 1));
		return guestrepo.insert(guest);
	}

	//Getting all the guests from guest repository
	public List<Guest> getallguests() {
		return guestrepo.findAll();
	}

	//Finding guest by given guest Id from guest repository
	public Guest getGuestById(String guestCode) {
		return guestrepo.findById(guestCode)
				.orElseThrow(() -> new ResourceNotFoundException("Guest code " + guestCode + " is not found"));//Throws not found exception when given guest code is not found in database
	}

	//Delete guest from repository given guest code
	public void deleteguest(String guestCode) {
		guestrepo.deleteById(guestCode);
	}

	//Adding the reserved guest to guest repository
	public Guest addifGuest(String reservationcode, Guest guest, String roomNo) {

		ResponseEntity<List<Reservation>> responseEntity = restTemplate.exchange(
				"http://Reservation/reservation/getallreservation", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Reservation>>() {
				});
		List<Reservation> listOfReservation = responseEntity.getBody();

		//Checks the given reservation code with all the reservations in the reservation repository and adds guest if reservation code matches 
		if (listOfReservation.stream().anyMatch(p -> reservationcode.equals(p.getReservationCode_()))) {

			restTemplate.postForObject("http://Rooms/Rooms/makestatusactive?roomNumber=" + roomNo, guest, Guest.class);

			Reservation resobj = listOfReservation.stream().filter(p -> reservationcode.equals(p.getReservationCode_()))
					.findAny().orElse(null);
			guest.setGuestCode_("G" + (guestrepo.count() + 1));
			guest.setReservationCode(reservationcode);
			guest.setRoomNumber(roomNo);

			guest.setNumberOfAdult(resobj.getNumberOfAdult());
			guest.setNumberOfChildren(resobj.getNumberOfChildren());
			guest.setCheckIn(resobj.getCheckIn());
			guest.setCheckOut(resobj.getCheckOut());
			guest.setNumberOfNights(resobj.getNumberOfNights());
			guest.setName_(resobj.getName());
			guest.setEmailId_(resobj.getEmailId());
			guest.setPhoneNumber_(resobj.getPhoneNumber());
			guest.setGender_(resobj.getGender());
			guest.setAddress_(resobj.getAddress());
			guest.setCompany_(resobj.getCompany());
			guest.setGuestStatus_("Checked In");

			return guestrepo.insert(guest);

		} else {
			return null;

		}

	}

	//Updates the guest details in the guest repository
	public Guest updateGuest(Guest guest) {
		return guestrepo.save(guest);
	}

	//Checkout the guest using guest code 
	public void checkoutGuest(String guestCode) {

		String roomNo = guestrepo.findById(guestCode).get().getRoomNumber();

		restTemplate.postForObject("http://Rooms/Rooms/makestatusnotactive?roomNumber=" + roomNo, guest, Guest.class);

		Guest guestinfo = guestrepo.findById(guestCode).get();
		guestinfo.setGuestStatus_("Checked Out");
		guestrepo.save(guestinfo);

	}

}