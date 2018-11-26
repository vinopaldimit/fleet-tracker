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

	private Float mileage;

	private String make;

	private String model;

	private String year;

	private String vIn;

	private String plateNumber;

	private String actualRun;

//	private String fedExAssignment;

	// private Collection<Trip> trips;

//	private String company;

//	private Collection <pastFedExAssignments> fexExPastAss;

	private Long milesTillService;

	private Long milesBetweenService;

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
