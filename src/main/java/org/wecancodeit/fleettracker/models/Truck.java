package org.wecancodeit.fleettracker.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Truck {

	@Id
	@GeneratedValue

	private Long id;
	//Mileage is the total number of miles each truck has. The odometer reported miles.
	private Float mileage;
	//The manufacterer of the vehicle. For example, Freightliner, International, Peterbuilt.
	private String make;
	//Model of truck. For example, Cascadia. Make/Model would be Freightliner/Cascadia
	private String model;
	//Year the truck was made.
	private String year;
	//Serial number of the truck.
	private String vIn;
	//license plate number of truck.
	private String plateNumber;
	//what the truck is supposed to phyiscally run daily. The "X" run, where "X" is string the user inputs..
	private String actualRun;

//	private String fedExAssignment;

	// private Collection<Trip> trips;

//	private String company;

//	private Collection <pastFedExAssignments> fexExPastAss;
	//Trucks get a service every X number of miles. This number should be the difference between the mileage at service and milesTillService
	private Long milesTillService;
	//This value is the same for the life of a truck. For example, a 2012 Freightliner Cascadia should have a service ever 50,000 miles
	private Long milesBetweenService;
	//Every truck needs a DOT inspection annually. This should be the date of last DOT inspection.
	private String dotInspectionDate;

	public Truck() {

	}

	public Truck(Float mileage, String make, String model, String year, String vIn, String plateNumber,
			String actualRun, Collection<Trip> trips, Long milesTillService, Long milesBetweenService,
			String dotInspectionDate) {
		super();
		this.mileage = mileage;
		this.make = make;
		this.model = model;
		this.year = year;
		this.vIn = vIn;
		this.plateNumber = plateNumber;
		this.actualRun = actualRun;
		// this.trips = trips;
		this.milesTillService = milesTillService;
		this.milesBetweenService = milesBetweenService;
		this.dotInspectionDate = dotInspectionDate;
	}

	public Long getId() {
		return id;
	}

	public Float getMileage() {
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

//	public Collection<Trip> getTrips() {
//		return trips;
//	}

	public Long getMilesTillService() {
		return milesTillService;
	}

	public Long getMilesBetweenService() {
		return milesBetweenService;
	}

	public String getDotInspectionDate() {
		return dotInspectionDate;
	}

}
