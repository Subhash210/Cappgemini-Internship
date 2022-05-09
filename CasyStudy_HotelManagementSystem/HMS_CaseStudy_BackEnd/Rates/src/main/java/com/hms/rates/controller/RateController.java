package com.hms.rates.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hms.rates.models.Rates;
import com.hms.rates.service.RateService;

@RestController
@RequestMapping("/rates")
@CrossOrigin("*")
public class RateController {
	@Autowired
	RateService rateService;

	// Adding the new rates to the rates repository
	@PostMapping("/addrate")
	public void setRates(@RequestBody Rates rate) {
		rateService.setrates(rate);
	}

	// Retrieving all the rates from the rates repository
	@GetMapping("/getallrates")
	public List<Rates> getRates() {
		return rateService.getRates();
	}

	// updates the rates in the rates repository
	@PutMapping("/updaterates")
	public void updateRates(@RequestBody Rates rates) {
		rateService.updateRates(rates);
	}

	// Retrieves specific rate details form rates repository using rate ID
	@GetMapping("/getratesbyid")
	public Rates getRatesById(@RequestParam String id) {
		return rateService.getRateById(id);
	}

}