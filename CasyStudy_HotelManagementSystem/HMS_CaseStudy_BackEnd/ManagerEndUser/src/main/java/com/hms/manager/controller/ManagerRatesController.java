package com.hms.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hms.manager.models.Rates;

@RestController
@RequestMapping("/manager/rates")
@CrossOrigin("*")
public class ManagerRatesController {

	@Autowired
	private RestTemplate restTemplate;

	//Adding new rates to the database
	@PostMapping("/addrate")
	public void setRates(@RequestBody Rates rate) {
		restTemplate.postForObject("http://Rates/rates/addrate", rate, Rates.class);

	}

	//Retrieving all set of rates from database
	@GetMapping("/getallrates")
	public List<Rates> getRates() {
		ResponseEntity<List<Rates>> responseEntity = restTemplate.exchange("http://Rates/rates/getallrates",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Rates>>() {
				});
		List<Rates> listOfRates = responseEntity.getBody();
		return listOfRates;
	}

	//Updating rates to the database
	@PutMapping("/updaterates")
	public void updateRates(@RequestBody Rates rates) {
		restTemplate.put("http://Rates/rates/updaterates", rates, Rates.class);
	}

}
