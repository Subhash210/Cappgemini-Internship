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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hms.manager.models.Inventory;

@RestController
@RequestMapping("/manager")
@CrossOrigin("*")
public class ManagerInventoryController {

	@Autowired
	private RestTemplate restTemplate;

	//Adding inventory details to the database
	@PostMapping("/addinventory")
	public void addInventory(@RequestBody Inventory inventory) {
		restTemplate.postForObject("http://Inventory/inventory/addinventory", inventory, Inventory.class);

	}

	//Updating inventory details in the inventory database
	@PutMapping("/updateinventory")
	public void updateInventory(@RequestBody Inventory inventory) {
		restTemplate.put("http://Inventory/inventory/updateinventory", inventory);
	}

	//Retrieving all the inventory details from database
	@GetMapping("/getallinventory")
	public List<Inventory> getGuestList() {
		ResponseEntity<List<Inventory>> responseEntity = restTemplate.exchange(
				"http://Inventory/inventory/getallinventory", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Inventory>>() {
				});
		List<Inventory> listOfInventory = responseEntity.getBody();
		return listOfInventory;
	}

	//Retrieving specific inventory details using inventory code from database  
	@GetMapping("/getinventorybyid")
	public Inventory getInventoryById(@RequestParam String inventoryCodse) {
		return restTemplate.getForObject("http://Inventory/inventory/getinventorybyid?inventoryCodse=" + inventoryCodse,
				Inventory.class);

	}
}
