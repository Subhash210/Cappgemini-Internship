package com.hms.bill;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.hms.bill.models.Bill;
import com.hms.bill.repository.BillRepository;
import com.hms.bill.service.BillService;

@SpringBootTest
class BillApplicationTests {

	@Autowired
	private BillService billService;

	@MockBean
	private BillRepository rep;

	@Test
	public void getAllBillsTest() {
		Date date = new Date();

		when(rep.findAll()).thenReturn(Stream.of(new Bill("B1", "G2", 20.0, 20.0, 30.0, date, 30.0, 3.0),
				new Bill("B2", "G3", 3.0, 4.0, 5.0, date, 50.0, 60.0)).collect(Collectors.toList()));
		assertEquals(2, billService.getAllBills().size());
	}
}
