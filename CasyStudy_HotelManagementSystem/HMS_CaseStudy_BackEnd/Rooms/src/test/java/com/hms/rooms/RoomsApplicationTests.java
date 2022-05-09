package com.hms.rooms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.hms.rooms.models.Rooms;
import com.hms.rooms.repository.RoomsRepository;
import com.hms.rooms.service.RoomsService;

@SpringBootTest
class RoomsApplicationTests {

	@Autowired
	private RoomsService roomsService;

	@MockBean
	private RoomsRepository roomsrepository;

	@Test
	public void getRoomsTest() {

		when(roomsrepository.findAll()).thenReturn(Stream
				.of(new Rooms("RM01", "Active", 5L), new Rooms("RM01", "Active", 10L)).collect(Collectors.toList()));
		assertEquals(2, roomsService.getAllRooms().size());
	}

}
