package com.hms.bill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hms.bill.models.Bill;
import com.hms.bill.service.BillService;

@RestController
@RequestMapping("/bill")
@CrossOrigin("*")
public class BillController {

	@Autowired
	private BillService billservice;

	// Retrieves bill by its ID
	@GetMapping("/getbillbyid")
	public Bill getBillById(@RequestParam String billNumber) {
		return billservice.getBillById(billNumber);

	}

	// Retrieves all the bills
	@GetMapping("/getallbills")
	public List<Bill> getAllBills() {
		return billservice.getAllBills();

	}

	// Generates the bill for the given guest ID
	@PostMapping("/generatebill")
	public Bill setBillByGuestId(@RequestBody Bill bill, @RequestParam String rateId, @RequestParam String guestCode) {
		return billservice.setBillByGuestId(guestCode, bill, rateId);

	}

}