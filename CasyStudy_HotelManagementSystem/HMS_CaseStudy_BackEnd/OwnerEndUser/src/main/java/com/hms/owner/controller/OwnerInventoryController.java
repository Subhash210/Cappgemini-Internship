package com.hms.owner.controller;

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

import com.hms.owner.models.Inventory;

@RestController
@RequestMapping("/owner/inventory")
@CrossOrigin("*")
public class OwnerInventoryController {

	@Autowired
	private RestTemplate restTemplate;

	// Adds the inventory details the inventory database, when new stock is arrived
	@PostMapping("/addinventory")
	public void addInventory(@RequestBody Inventory inventory) {
		restTemplate.postForObject("http://Inventory/inventory/addinventory", inventory, Inventory.class);

	}

	// Updates the inventory details when the items are added in the inventory
	@PutMapping("/updateinventory")
	public void updateInventory(@RequestBody Inventory inventory) {
		restTemplate.put("http://Inventory/inventory/updateinventory", inventory);
	}

	// Retrieves all the inventory available in the inventory database
	@GetMapping("/getallinventory")
	public List<Inventory> getGuestList() {
		ResponseEntity<List<Inventory>> responseEntity = restTemplate.exchange(
				"http://Inventory/inventory/getallinventory", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Inventory>>() {
				});
		List<Inventory> listOfInventory = responseEntity.getBody();
		return listOfInventory;
	}

	// Retrieves the specific inventory details using the given inventory code
	@GetMapping("/getinventorybyid")
	public Inventory getInventoryById(@RequestParam String inventoryCode) {
		return restTemplate.getForObject("http://Inventory/inventory/getinventorybyid?inventoryCodse=" + inventoryCode,
				Inventory.class);

	}
}
