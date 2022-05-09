package com.hms.owner.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Inventory")
public class Inventory {

	@Id
	private String inventoryCode;
	private String inventoryType;
	private String inventoryName;
	private Integer inventoryQuantity;

	public Inventory() {

	}

	public Inventory(String inventoryCode, String inventoryType, String inventoryName, Integer inventoryQuantity) {
		super();
		this.inventoryCode = inventoryCode;
		this.inventoryType = inventoryType;
		this.inventoryName = inventoryName;
		this.inventoryQuantity = inventoryQuantity;
	}

	public String getInventoryCode() {
		return inventoryCode;
	}

	public void setInventoryCode(String inventoryCode) {
		this.inventoryCode = inventoryCode;
	}

	public String getInventoryType() {
		return inventoryType;
	}

	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	public String getInventoryName() {
		return inventoryName;
	}

	public void setInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}

	public Integer getInventoryQuantity() {
		return inventoryQuantity;
	}

	public void setInventoryQuantity(Integer inventoryQuantity) {
		this.inventoryQuantity = inventoryQuantity;
	}

}
