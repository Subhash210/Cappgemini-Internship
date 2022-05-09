package com.hms.bill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.hms.bill.exception.ResourceNotFoundException;
import com.hms.bill.models.Bill;
import com.hms.bill.models.Guest;
import com.hms.bill.models.Rates;
import com.hms.bill.repository.BillRepository;

@Service
public class BillService {

	@Autowired
	private BillRepository billRepository;

	@Autowired
	private RestTemplate restTemplate;

	// Logic to retrieve the specific bill with bill number
	public Bill getBillById(String billNumber) {
		return billRepository.findById(billNumber)
				.orElseThrow(() -> new ResourceNotFoundException("Bill Number " + billNumber + " is not found"));
	}

	// Logic to generate the bill using guest ID and rateID, by retriving the data
	// from guest repository
	public Bill setBillByGuestId(String guestCode, Bill bill, @RequestParam String rateId) {

		ResponseEntity<List<Guest>> responseEntity = restTemplate.exchange("http://Guest/Guest/getallguests",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Guest>>() {
				});
		List<Guest> listOfGuest = responseEntity.getBody();

		bill.setBillNumber("B" + (billRepository.count() + 1));

		if (listOfGuest.stream().anyMatch(p -> p.getGuestCode_().equals(guestCode))) {
			bill.setGuestCode(guestCode);

			Rates rate = restTemplate.getForObject("http://Rates/rates/getratesbyid?id=" + rateId, Rates.class);

			double oneNight = rate.getFirstNightPrice();
			double dayprice = rate.getDayPrice();
			double nightprice = rate.getNightPrice();
			int numberOfNights = listOfGuest.stream().filter(p -> p.getGuestCode_().equals(guestCode)).findAny().get()
					.getNumberOfNights();
			if (numberOfNights == 1) {
				Double foodService = bill.getUnit() * bill.getQuantity();
				Double price = oneNight + bill.getServices() + foodService;
				Double tax = (price / 10);
				bill.setTaxes(tax);
				bill.setTotalPrice_(price + tax);
				return billRepository.insert(bill);
			} else if (numberOfNights > 1) {
				Double foodService = bill.getUnit() * bill.getQuantity();
				Double price = (numberOfNights * nightprice) + ((numberOfNights - 1) * dayprice) + bill.getServices()
						+ foodService;
				Double tax = (price / 10);
				bill.setTaxes(tax);
				bill.setTotalPrice_(price + tax);
				return billRepository.insert(bill);

			} else {
				return billRepository.insert(bill);
			}
		}
		return null;
	}

	// Logic to retrieve all the bills from bill repository
	public List<Bill> getAllBills() {
		return billRepository.findAll();
	}

}