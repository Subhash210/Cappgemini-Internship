package com.hms.reservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.reservation.exception.ResourceNotFoundException;
import com.hms.reservation.models.Reservation;
import com.hms.reservation.repository.ReservationRepository;

@Service
public class ReservationService {

	@Autowired
	private ReservationRepository rep;

	// Logic to add the reservation to the reservation database
	public Reservation addReservation(Reservation reservation) {

		reservation.setStatus_("Confirmed");
		reservation.setReservationCode_("RS" + (rep.count() + 1));

		return rep.insert(reservation);

	}

	// Logic to retrieve all the reservations form the reservation database
	public List<Reservation> getAllReservation() {
		return rep.findAll();
	}

	// Logic to update the reservation in the reservation database
	public Reservation updateReservation(Reservation reservation) {
		return rep.save(reservation);
	}

	// Logic to retrieve the specific reservation using the reservation code form
	// the reservation database
	public Reservation getreservationById(String ReservationcCode) {
		return rep.findById(ReservationcCode).orElseThrow(
				() -> new ResourceNotFoundException("Reservation code " + ReservationcCode + " is not found"));
	}

}