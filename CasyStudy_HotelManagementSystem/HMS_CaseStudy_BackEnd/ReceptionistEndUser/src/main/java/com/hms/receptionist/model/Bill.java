package com.hms.receptionist.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Bill")
public class Bill {

	@Id
	private String billNumber;
	private String guestCode;
	private Double quantity;
	private Double totalPrice_;
	private Double taxes;
	private Date date;
	private Double services;
	private Double unit;

	public Bill() {
	}

	public Bill(String billNumber, String guestCode, Double quantity, Double totalPrice_, Double taxes, Date date,
			Double services, Double unit) {
		super();
		this.billNumber = billNumber;
		this.guestCode = guestCode;
		this.quantity = quantity;
		this.totalPrice_ = totalPrice_;
		this.taxes = taxes;
		this.date = date;
		this.services = services;
		this.unit = unit;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public String getGuestCode() {
		return guestCode;
	}

	public void setGuestCode(String guestCode) {
		this.guestCode = guestCode;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getTotalPrice_() {
		return totalPrice_;
	}

	public void setTotalPrice_(Double totalPrice_) {
		this.totalPrice_ = totalPrice_;
	}

	public Double getTaxes() {
		return taxes;
	}

	public void setTaxes(Double taxes) {
		this.taxes = taxes;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getServices() {
		return services;
	}

	public void setServices(Double services) {
		this.services = services;
	}

	public Double getUnit() {
		return unit;
	}

	public void setUnit(Double unit) {
		this.unit = unit;
	}

}