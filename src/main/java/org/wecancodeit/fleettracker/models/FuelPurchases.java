package org.wecancodeit.fleettracker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FuelPurchases {

	@Id
	@GeneratedValue
	private Long id;
	private String date;
	private String ticketCheckNumber;
	private String truckNumber;
	private String truckStop;
	private String city;
	private String state;
	private Float gallonsQty;
	// gallonsCost = PUR $AMT on settlement
	private Float gallonsCost;
	private Float authChgbkArrears;
	private Float authChgbkRefund;
	private Float authChgbkNetAmt;

	public FuelPurchases() {

	}

	public FuelPurchases(String date, String ticketCheckNumber, String truckNumber, String truckStop, String city,
			String state, Float gallonsQty, Float gallonsCost, Float authChgbkArrears, Float authChgbkRefund,
			Float authChgbkNetAmt, Float repairMiscAmount) {
		super();
		this.date = date;
		this.ticketCheckNumber = ticketCheckNumber;
		this.truckNumber = truckNumber;
		this.truckStop = truckStop;
		this.city = city;
		this.state = state;
		this.gallonsQty = gallonsQty;
		this.gallonsCost = gallonsCost;
		this.authChgbkArrears = authChgbkArrears;
		this.authChgbkRefund = authChgbkRefund;
		this.authChgbkNetAmt = authChgbkNetAmt;
		this.repairMiscAmount = repairMiscAmount;
	}

	public Long getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public String getTicketCheckNumber() {
		return ticketCheckNumber;
	}

	public String getTruckNumber() {
		return truckNumber;
	}

	public String getTruckStop() {
		return truckStop;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public Float getGallonsQty() {
		return gallonsQty;
	}

	public Float getGallonsCost() {
		return gallonsCost;
	}

	public Float getAuthChgbkArrears() {
		return authChgbkArrears;
	}

	public Float getAuthChgbkRefund() {
		return authChgbkRefund;
	}

	public Float getAuthChgbkNetAmt() {
		return authChgbkNetAmt;
	}

	public Float getRepairMiscAmount() {
		return repairMiscAmount;
	}

	private Float repairMiscAmount;

}
