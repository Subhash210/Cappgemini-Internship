package com.hms.rates;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.hms.rates.models.Rates;
import com.hms.rates.repository.RateRepository;
import com.hms.rates.service.RateService;

@SpringBootTest
class RatesApplicationTests {

	@Autowired
	private RateService rateService;

	@MockBean
	private RateRepository rep;

	@Test
	public void getAllRatesTest() {

		when(rep.findAll())
				.thenReturn(Stream.of(new Rates("R1", 2300.0, 2300.0, 5000.0), new Rates("R1", 2300.0, 2300.0, 5000.0))
						.collect(Collectors.toList()));
		assertEquals(2, rateService.getRates().size());
	}

	@Test
	public void addRatesTest() {

		Rates rates = new Rates("R1", 2300.0, 2300.0, 5000.0);
		when(rep.insert(rates)).thenReturn(rates);
		assertEquals(rates, rateService.setrates(rates));
	}

	@Test
	public void updateRatesTest() {
		Rates rates = new Rates("R1", 2300.0, 2300.0, 5000.0);
		when(rep.save(rates)).thenReturn(rates);
		assertEquals(rates, rateService.updateRates(rates));
	}
}
