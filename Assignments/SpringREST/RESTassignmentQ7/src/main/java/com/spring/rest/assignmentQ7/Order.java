package com.spring.rest.assignmentQ7;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order")
public class Order {

	@Id
	private String id;
	private String item;
	private Double amountPaid;

	public Order() {
	}

	public Order(String id, String item, Double amountPaid) {
		super();
		this.id = id;
		this.item = item;
		this.amountPaid = amountPaid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(Double amountPaid) {
		this.amountPaid = amountPaid;
	}

	@Override
	public String toString() {
		return "Order{" + "id='" + id + '\'' + ", item='" + item + '\'' + ", amountPaid=" + amountPaid + '}';
	}
}