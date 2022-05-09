package com.hms.owner.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hms.owner.generator.BillPDFGenerator;
import com.hms.owner.models.Bill;
import com.lowagie.text.DocumentException;

@RestController
@RequestMapping("/owner/bill")
@CrossOrigin("*")
public class OwnerBillController {

	@Autowired
	private RestTemplate restTemplate;

	// generates bill using guest code and rate ID
	@PostMapping("/generatebill")
	public void generateBill(@RequestParam String guestCode, @RequestParam String rateId, @RequestBody Bill bill) {
		restTemplate.postForObject("http://Bill/bill/generatebill?guestCode=" + guestCode + "&rateId=" + rateId, bill,
				Bill.class);
	}

	// Retrieves all the bills from the bills database
	@GetMapping("/getallbills")
	public List<Bill> getBillList() {
		ResponseEntity<List<Bill>> responseEntity = restTemplate.exchange("http://Bill/bill/getallbills",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Bill>>() {
				});
		List<Bill> listOfBills = responseEntity.getBody();
		return listOfBills;
	}

	// Retrieves specific bill using bill code form bill database
	@GetMapping("/getbillbyid")
	public Bill getBillById(@RequestParam String billCode) {
		return restTemplate.getForObject("http://Bill/bill/getbillbyid?billNumber=" + billCode, Bill.class);
	}

	// prints the bill of the given bill number
	@GetMapping("/printbill")
	public void generatePdf(HttpServletResponse response, @RequestParam String BillCode)
			throws DocumentException, IOException {

		response.setContentType("application/pdf");
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
		String currentDateTime = dateFormat.format(new Date());
		String headerkey = "Content-Disposition";
		String headervalue = "attachment; filename=pdf_" + currentDateTime + BillCode + ".pdf";

		Bill bill = restTemplate.getForObject("http://Bill/bill/getbillbyid?billNumber=" + BillCode, Bill.class);
		response.setHeader(headerkey, headervalue);

		BillPDFGenerator generator = new BillPDFGenerator();
		generator.generate(response, bill);

	}

}
