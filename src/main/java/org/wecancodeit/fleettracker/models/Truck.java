package org.wecancodeit.fleettracker.models;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Truck {

	@Id
	@GeneratedValue

	private Long id;
	// Mileage is the total number of miles each truck has. The odometer reported
	// miles.
	private BigDecimal mileage;
	// The manufacterer of the vehicle. For example, Freightliner, International,
	// Peterbuilt.
	private String make;
	// Model of truck. For example, Cascadia. Make/Model would be
	// Freightliner/Cascadia
	private String model;
	// Year the truck was made.
	private String year;
	// Serial number of the truck.
	private String vIn;
	// license plate number of truck.
	private String plateNumber;
	// what the truck is supposed to phyiscally run daily. The "X" run, where "X" is
	// string the user inputs..
	private String actualRun;
	// truck number
	private String truckNumber;
	// FedEx Assignment
	@OneToOne
	private FedExAssignment fedExAssignment;
	// trips truck has been on
	@OneToMany(mappedBy = "truck")
	private Collection<Trip> trips = new HashSet<Trip>();
	// company
	@ManyToOne
	private Company company;
	@ManyToMany
	private Collection<FedExAssignment> fedExPastAssignments = new HashSet<>();
	// Trucks get a service every X number of miles. This number should be the
	// difference between the mileage at service and milesTillService
	private Float milesAtService;
	// This value is the same for the life of a truck. For example, a 2012
	// Freightliner Cascadia should have a service ever 50,000 miles
	private Float milesBetweenService;
	// Every truck needs a DOT inspection annually. This should be the date of last
	// DOT inspection.
	private String dotInspectionDate;

	@ManyToMany
	private Collection<FuelPurchase> fuelPurchase = new HashSet<>();

	public Truck() {

	}

	public Truck(String mileage, String make, String model, String year, String vIn, String plateNumber,
			String actualRun, Float milesAtService, Float milesBetweenService, String dotInspectionDate) {
		this.mileage = new BigDecimal(mileage);
		this.make = make;
		this.model = model;
		this.year = year;
		this.vIn = vIn;
		this.plateNumber = plateNumber;
		this.actualRun = actualRun;
		this.milesAtService = milesAtService;
		this.milesBetweenService = milesBetweenService;
		this.dotInspectionDate = dotInspectionDate;
	}
	/////// This is how the calculations for miles until service will work.
	// miles until service = milesBetweenService - (mileage - mileage at service)

	public Long getId() {
		return id;
	}

	public BigDecimal getMileage() {
		return mileage;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getYear() {
		return year;
	}

	public String getvIn() {
		return vIn;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public String getActualRun() {
		return actualRun;
	}

	public Collection<Trip> getTrips() {
		return trips;
	}

	public Float getMilesTillService() {
		return milesAtService;
	}

	public Float getMilesBetweenService() {
		return milesBetweenService;
	}

	public String getDotInspectionDate() {
		return dotInspectionDate;
	}

}
