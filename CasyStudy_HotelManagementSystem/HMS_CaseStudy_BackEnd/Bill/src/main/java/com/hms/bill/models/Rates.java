package com.hms.bill.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Rates")
public class Rates {

	@Id
	private String rateId;
	private Double firstNightPrice;
	private Double nightPrice;
	private Double dayPrice;

	public Rates() {
	}

	public Rates(String rateId, Double firstNightPrice, Double nightPrice, Double dayPrice) {
		super();
		this.rateId = rateId;
		this.firstNightPrice = firstNightPrice;
		this.nightPrice = nightPrice;
		this.dayPrice = dayPrice;
	}

	public String getRateId() {
		return rateId;
	}

	public void setRateId(String rateId) {
		this.rateId = rateId;
	}

	public Double getFirstNightPrice() {
		return firstNightPrice;
	}

	public void setFirstNightPrice(Double firstNightPrice) {
		this.firstNightPrice = firstNightPrice;
	}

	public Double getNightPrice() {
		return nightPrice;
	}

	public void setNightPrice(Double nightPrice) {
		this.nightPrice = nightPrice;
	}

	public Double getDayPrice() {
		return dayPrice;
	}

	public void setDayPrice(Double dayPrice) {
		this.dayPrice = dayPrice;
	}

}