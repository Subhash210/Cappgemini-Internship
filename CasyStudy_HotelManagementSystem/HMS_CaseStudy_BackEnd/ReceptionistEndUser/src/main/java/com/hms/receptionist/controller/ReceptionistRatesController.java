package com.hms.receptionist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hms.receptionist.model.Rates;

@RestController
@RequestMapping("/receptionist/rates")
@CrossOrigin("*")
public class ReceptionistRatesController {
	@Autowired
	private RestTemplate restTemplate;

	// Retrieving all the rates from the rates repository
	@GetMapping("/getallrates")
	public List<Rates> getRates() {
		ResponseEntity<List<Rates>> responseEntity = restTemplate.exchange("http://Rates/rates/getallrates"
				+ "",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Rates>>() {
				});
		List<Rates> listOfrates = responseEntity.getBody();
		return listOfrates;
	}

}
