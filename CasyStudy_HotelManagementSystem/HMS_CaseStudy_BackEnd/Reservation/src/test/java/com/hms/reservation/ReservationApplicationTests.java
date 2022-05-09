package com.hms.reservation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.hms.reservation.models.Reservation;
import com.hms.reservation.repository.ReservationRepository;
import com.hms.reservation.service.ReservationService;

@SpringBootTest
class ReservationApplicationTests {

	@Autowired
	private ReservationService reservationService;

	@MockBean
	private ReservationRepository rep;

	@Test
	public void getReservationTest() throws ParseException {

		SimpleDateFormat simpleformat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = simpleformat.parse("2022/05/22");
		Date date2 = simpleformat.parse("2022/05/25");

		when(rep.findAll()).thenReturn(Stream
				.of(new Reservation("RS1", 2, 2, date, date2, 3, "Rajesh", "chagantipati.jddj@gmail.com",
						"+91 9874561235", "M", "Rajendra nagar", "Capgemini", "Checked in"),
						new Reservation("RS2", 2, 2, date, date2, 3, "Rajesh", "chagantipati.jddj@gmail.com",
								"+91 98728561235", "M", "Santi nagar", "company", "Checked in"))
				.collect(Collectors.toList()));
		assertEquals(2, reservationService.getAllReservation().size());
	}

	@Test
	public void addReservationTest() throws ParseException {

		SimpleDateFormat simpleformat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = simpleformat.parse("2022/05/22");
		Date date2 = simpleformat.parse("2022/05/25");

		Reservation reservation = new Reservation("RS1", 2, 2, date, date2, 3, "Rajesh", "chagantipati.jddj@gmail.com",
				"+91 9874561235", "M", "Rajendra nagar", "Capgemini", "Checked in");
		when(rep.insert(reservation)).thenReturn(reservation);
		assertEquals(reservation, reservationService.addReservation(reservation));
	}

	@Test
	public void updateReservationTest() throws ParseException {

		SimpleDateFormat simpleformat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = simpleformat.parse("2022/05/22");
		Date date2 = simpleformat.parse("2022/05/25");

		Reservation reservation = new Reservation("RS1", 2, 2, date, date2, 3, "Ramesh", "suresh.jddj@gmail.com",
				"+91 8774561235", "M", "Rajendra nagar", "Capgemini", "Checked in");
		when(rep.save(reservation)).thenReturn(reservation);
		assertEquals(reservation, reservationService.updateReservation(reservation));
	}

}
