package com.hms.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.inventory.exception.ResourceNotFoundException;
import com.hms.inventory.models.Inventory;
import com.hms.inventory.repository.InventoryRepository;

@Service
public class InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;

	//Logic for Adding inventory details to the database
	public Inventory addInventory(Inventory inventory) {
		return inventoryRepository.insert(inventory);
	}

	//Logic for Updating the inventory details in the database
	public Inventory updateInventory(Inventory inventory) {
		return inventoryRepository.save(inventory);
	}

	//Logic for Retrieving all the inventory details form the database
	public List<Inventory> getAllInventory() {
		return inventoryRepository.findAll();
	}

	//Logic for Retrieving inventory details using Id from database
	public Inventory getInventoryById(String inventoryCode) {
		return inventoryRepository.findById(inventoryCode)
				.orElseThrow(() -> new ResourceNotFoundException("Inventory code " + inventoryCode + " is not found"));
	}

}
