package com.hms.inventory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.hms.inventory.models.Inventory;
import com.hms.inventory.repository.InventoryRepository;
import com.hms.inventory.service.InventoryService;

@SpringBootTest
class InventoryApplicationTests {

	@Autowired
	private InventoryService inventoryService;

	@MockBean
	private InventoryRepository rep;

	@Test
	public void getAllInventoryTest() {
		when(rep.findAll()).thenReturn(
				Stream.of(new Inventory("I1", "Kitchen", "meat", 5), new Inventory("I2", "maintaince", "lizol", 4))
						.collect(Collectors.toList()));
		assertEquals(2, inventoryService.getAllInventory().size());
	}

	@Test
	public void addInventoryTest() {
		Inventory inventory = new Inventory("I1", "Kitchen", "meat", 5);
		when(rep.insert(inventory)).thenReturn(inventory);
		assertEquals(inventory, inventoryService.addInventory(inventory));
	}

	@Test
	public void updateInventoryTest() {
		Inventory inventory = new Inventory("I1", "Kitchen", "meat", 5);
		when(rep.save(inventory)).thenReturn(inventory);
		assertEquals(inventory, inventoryService.updateInventory(inventory));
	}

}
