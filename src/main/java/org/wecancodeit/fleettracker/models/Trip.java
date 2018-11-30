package org.wecancodeit.fleettracker.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Trip {

	@Id
	@GeneratedValue

	private Long id;
	// Number assigned by FedEx for trip from one hub to the next.
	private Long tripNumber;
	// Date truck arrives at final destination of trip.
	private String date;
	// FedEx number code for hub that truck leaves from. Sometimes but not always
	// correlates to zip. For example, Grove City hub is 0432.
	private Long origin;
	// Same as above but it's the hub that truck is going to.
	private Long destination;
	// Zip code of hub.
	private Long zipCode;
	// Total miles from Origin to Destination.
	private Float milesQuantity;
	// Variable Mileage Rate. BASE $ rate paid per mile. Same from hub to hub.
	private Float vMr;
	// Mileage Plus- additional cents paid per mile. Varies from Hub to Hub.
	private Float mileagePlus;
	// $ amount. I've never seen it used, but since they might use it, we should at
	// least have a field to accept it.
	private Float premiums;
	// Fuel Subsidy. FedEx pays X number of cents per mile to help with the cost of
	// fuel.
	private Float fuel;
	// They do math on this, it's just the sum of the previous items. Total Rate =
	// VMR + Mileage Plus + Premiums + Fuel.
	private Float totalRate;
	// AMT = $ amount paid for miles driven. AMT = Miles Quantity * Total Rate.
	private Float aMt;
	// I've never seen this used, but supposedly you can do an emergency run and
	// they pay X dollars per package.
	private Long packages;
	// packages $amount
	private Long packageAmt;
	// Drop and Hook (D&H) is a flat rate paid to hook trailers up to a truck. It's
	// paid every time they have to connect or disconnect trailers.
	private Float dropAndHook;
	// Some highways require paid tolls. This is a $ amount.
	private Float tolls;
	// This isn't often used, but on some runs they'll set a flat amount and pay
	// that instead of calculating anything per mile.
	private Float flatRate;
	// Gross amount is $AMT + Drop and Hook.
	private Float dailyGrossAmount;
	// FedEx ID for first driver.
	private String driverOne;
	// FedEx ID for second driver.
	private String driverTwo;

	// employee
	@ManyToMany
	private Collection<Employee> employees;

	// truck
	@ManyToOne
	private Truck truck;

	public Trip() {

	}

	public Trip(String date, Long tripNumber, Long origin, Long destination, Long zipCode, Float milesQuantity,
			Float vMr, Float mileagePlus, Float premiums, Float fuel, Float totalRate, Float aMt, Long packages,
			Long packageAmt, Float dropAndHook, Float tolls, Float flatRate, Float dailyGrossAmount, String driverOne,
			String driverTwo, Truck truck) {

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
		this.packageAmt = packageAmt;
		this.dropAndHook = dropAndHook;
		this.tolls = tolls;
		this.flatRate = flatRate;
		this.dailyGrossAmount = dailyGrossAmount;
		this.driverOne = driverOne;
		this.driverTwo = driverTwo;
		this.truck = truck;
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

	public Long getPackages() {
		return packages;
	}

	public Long getPackageAmt() {
		return packageAmt;
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

	public String getDriverOne() {
		return driverOne;
	}

	public String getDriverTwo() {
		return driverTwo;
	}

}
