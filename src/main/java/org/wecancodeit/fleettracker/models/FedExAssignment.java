package org.wecancodeit.fleettracker.models;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class FedExAssignment {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private Company company;
	@OneToOne
	private Truck truck;
	@ManyToMany
	private Collection<Truck> pastTrucks = new HashSet<>();
	private Float servicePercentage;
	private Float availabilityPercentage;
	private Long points;

	// declines remaining is calculated and not statically given.
	// private Long declinesRemaining;

	// \/\/\/\/\/\/\/\/\/\
	// Getters
	// \/\/\/\/\/\/\/\/\/\

	public Long getId() {
		return id;
	}

	public Company getCompany() {
		return company;
	}

	public Truck getTruck() {
		return truck;
	}

	public Collection<Truck> getPastTrucks() {
		return pastTrucks;
	}

	public Float getServicePercentage() {
		return servicePercentage;
	}

	public Float getAvailabilityPercentage() {
		return availabilityPercentage;
	}

	public Long getPoints() {
		return points;
	}

	// \/\/\/\/\/\/\/\/\/\
	// Constructors
	// \/\/\/\/\/\/\/\/\/\

	public FedExAssignment() {

	}

	public FedExAssignment(Company company, Truck truck, Float servicePercentage, Float availabilityPercentage,
			Long points) {
		this.company = company;
		this.truck = truck;
		this.servicePercentage = servicePercentage;
		this.availabilityPercentage = availabilityPercentage;
		this.points = points;
	}

}
