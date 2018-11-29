package org.wecancodeit.fleettracker.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FedExAssignment {
	@Id
	@GeneratedValue
	private Long id;
	private Collection<FedExAssignment> companies;
	private Long truckNumber;
	private Collection<FedExAssignment> pastTruckNumbers;
	private Float servicePercentage;
	private Float availabilityPercentage;
	private Long points;

	// declines remaining is calculated and not statically given.
	// private Long declinesRemaining;

	// \/\/\/\/\/\/\/\/\/\
	// Getters
	// \/\/\/\/\/\/\/\/\/\

	public Collection<FedExAssignment> getCompanies() {
		return companies;
	}

	public Long getTruckNumber() {
		return truckNumber;
	}

	public Collection<FedExAssignment> getPastTruckNumbers() {
		return pastTruckNumbers;
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

	public FedExAssignment(Collection<FedExAssignment> companies, Long truckNumber,
			Collection<FedExAssignment> pastTruckNumbers, Float servicePercentage, Float availabilityPercentage,
			Long points) {
		super();
		this.companies = companies;
		this.truckNumber = truckNumber;
		this.pastTruckNumbers = pastTruckNumbers;
		this.servicePercentage = servicePercentage;
		this.availabilityPercentage = availabilityPercentage;
		this.points = points;
	}

}
