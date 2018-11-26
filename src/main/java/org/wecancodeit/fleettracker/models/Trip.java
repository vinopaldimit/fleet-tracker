package org.wecancodeit.fleettracker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Trip {

	@Id
	@GeneratedValue

	private Long id;

	private Long tripNumber;

	private String date;

	private Long origin;

	private Long destination;

	private Long zipCode;

	private Float milesQuantity;

	private Float vMr;

	private Float mileagePlus;

	private Float premiums;

	private Float fuel;

	private Float totalRate;

	private Float aMt;

	private int packages;

	private Float dropAndHook;

	private Float tolls;

	private Float flatRate;

	private Float dailyGrossAmount;

	private Long driverOne;

	private Long driverTwo;

	// employee

	// truck

	public Trip() {

	}

	public Trip(Long tripNumber, String date, Long origin, Long destination, Long zipCode, Float milesQuantity,
			Float vMr, Float mileagePlus, Float premiums, Float fuel, Float totalRate, Float aMt, int packages,
			Float dropAndHook, Float tolls, Float flatRate, Float dailyGrossAmount, Long driverOne, Long driverTwo) {

		this.tripNumber = tripNumber;
		this.date = date;
		this.origin = origin;
		this.destination = destination;
		this.zipCode = zipCode;
		this.milesQuantity = milesQuantity;
		this.vMr = vMr;
		this.mileagePlus = mileagePlus;
		this.premiums = premiums;
		this.fuel = fuel;
		this.totalRate = totalRate;
		this.aMt = aMt;
		this.packages = packages;
		this.dropAndHook = dropAndHook;
		this.tolls = tolls;
		this.flatRate = flatRate;
		this.dailyGrossAmount = dailyGrossAmount;
		this.driverOne = driverOne;
		this.driverTwo = driverTwo;
	}

	public Long getId() {
		return id;
	}

	public Long getTripNumber() {
		return tripNumber;
	}

	public String getDate() {
		return date;
	}

	public Long getOrigin() {
		return origin;
	}

	public Long getDestination() {
		return destination;
	}

	public Long getZipCode() {
		return zipCode;
	}

	public Float getMilesQuantity() {
		return milesQuantity;
	}

	public Float getvMr() {
		return vMr;
	}

	public Float getMileagePlus() {
		return mileagePlus;
	}

	public Float getPremiums() {
		return premiums;
	}

	public Float getFuel() {
		return fuel;
	}

	public Float getTotalRate() {
		return totalRate;
	}

	public Float getaMt() {
		return aMt;
	}

	public int getPackages() {
		return packages;
	}

	public Float getDropAndHook() {
		return dropAndHook;
	}

	public Float getTolls() {
		return tolls;
	}

	public Float getFlatRate() {
		return flatRate;
	}

	public Float getDailyGrossAmount() {
		return dailyGrossAmount;
	}

	public Long getDriverOne() {
		return driverOne;
	}

	public Long getDriverTwo() {
		return driverTwo;
	}

}
