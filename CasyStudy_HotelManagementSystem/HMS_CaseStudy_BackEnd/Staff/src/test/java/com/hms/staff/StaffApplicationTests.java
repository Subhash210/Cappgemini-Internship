package com.hms.staff;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.hms.staff.models.Staff;
import com.hms.staff.repository.StaffRepository;
import com.hms.staff.service.StaffService;

@SpringBootTest
class StaffApplicationTests {

	@Autowired
	private StaffService staffService;

	@MockBean
	private StaffRepository staffRepository;

	@Test
	public void getAllReservationTest() throws ParseException {

		when(staffRepository.findAll()).thenReturn(Stream.of(
				new Staff("S1", "D1", "Iron Man", "+148963458796", "ironman@gmail.com", 40, "4/k, New York", 50000.45),
				new Staff("S2", "D2", "Captain America", "+149876521432", "captainAmerica@gmail.com", 98,
						"United States Of America", 65000.36))
				.collect(Collectors.toList()));
		assertEquals(2, staffService.getAllStaff().size());
	}

	@Test
	public void addDepartmentTest() throws ParseException {
		Staff staff = new Staff("S1", "D1", "Iron Man", "+148963458796", "ironman@gmail.com", 40, "4/k, New York",
				50000.45);
		when(staffRepository.insert(staff)).thenReturn(staff);
		assertEquals(staff, staffService.addStaff(staff));
	}

	@Test
	public void updateDepartmentTest() throws ParseException {

		Staff staff1 = new Staff("S1", "D1", "Iron Man", "+148963458796", "ironman@gmail.com", 40, "4/k, New York",
				50000.45);
		Staff staff2 = new Staff("S1", "D2", "Captain America", "+149876521432", "captainAmerica@gmail.com", 98,
				"United States Of America", 65000.36);

		when(staffRepository.save(staff1)).thenReturn(staff2);
		assertEquals(staff2, staffService.updateStaff(staff1));
	}

}