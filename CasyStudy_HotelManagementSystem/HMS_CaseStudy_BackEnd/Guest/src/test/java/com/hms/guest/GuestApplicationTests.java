package com.hms.guest;

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

import com.hms.guest.models.Guest;
import com.hms.guest.repository.GuestRepository;
import com.hms.guest.service.GuestService;

@SpringBootTest
class GuestApplicationTests {

	@Autowired
	private GuestService guestService;

	@MockBean
	private GuestRepository guestRepository;

	@Test
	public void getGuestTest() throws ParseException {

		SimpleDateFormat simpleformat = new SimpleDateFormat("yyyy/MM/dd");

		Date date = new Date();
		Date checkIn = simpleformat.parse("2022/05/22");
		Date checkOut = simpleformat.parse("2022/05/22");

		when(guestRepository.findAll()).thenReturn(Stream.of(
				new Guest("G1", "RS1", "RM1", date, 4, 2, checkIn, checkOut, 5, "Rajesh", "chagantipati.jddj@gmail.com",
						"+91 9874561235", "M", "Rajendra nagar", "Capgemini", "Checked in"),
				new Guest("G2", "RS2", "RM2", date, 2, 6, checkIn, checkOut, 4, "Rajesh", "chagantipati.jddj@gmail.com",
						"+91 98728561235", "M", "Santi nagar", "company", "Checked in"))
				.collect(Collectors.toList()));
		assertEquals(2, guestService.getallguests().size());
	}

	@Test
	public void addGuestTest() throws ParseException {

		SimpleDateFormat simpleformat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		Date checkIn = simpleformat.parse("2022/05/22");
		Date checkOut = simpleformat.parse("2022/05/22");

		Guest guest = new Guest("G1", "RS1", "RM1", date, 4, 2, checkIn, checkOut, 5, "ABC", "ABC@gmail.com",
				"+91 9874561235", "M", "Rajendra nagar", "XYZCompany", "Checked In");
		when(guestRepository.insert(guest)).thenReturn(guest);
		assertEquals(guest, guestService.addguest(guest));
	}

	@Test
	public void updateGuestTest() throws ParseException {

		SimpleDateFormat simpleformat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		Date checkIn = simpleformat.parse("2022/05/22");
		Date checkOut = simpleformat.parse("2022/05/22");

		Guest guest = new Guest("G1", "RS1", "RM1", date, 4, 2, checkIn, checkOut, 5, "ABC", "ABC@gmail.com",
				"+91 9874561235", "M", "Rajendra nagar", "XYZCompany", "Checked In");
		when(guestRepository.save(guest)).thenReturn(guest);
		assertEquals(guest, guestService.updateGuest(guest));
	}

}
