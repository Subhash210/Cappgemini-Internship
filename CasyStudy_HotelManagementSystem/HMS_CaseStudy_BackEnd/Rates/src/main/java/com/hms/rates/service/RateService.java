package com.hms.rates.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.rates.exception.ResourceNotFoundException;
import com.hms.rates.models.Rates;
import com.hms.rates.repository.RateRepository;

@Service
public class RateService {

	@Autowired
	private RateRepository raterepo;

	// Logic to upload the rates to rates database
	public Rates setrates(Rates rates) {
		return raterepo.insert(rates);
	}

	// Logic to update the rates in the rate database
	public Rates updateRates(Rates rates) {
		return raterepo.save(rates);
	}

	// Logic to retrieve all the rates form the rate database
	public List<Rates> getRates() {
		return raterepo.findAll();

	}

	// Logic to retrieve a specific rates using rate ID
	public Rates getRateById(String id) {
		return raterepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Rate id " + id + " is not found"));
	}

}