package org.wecancodeit.fleettracker.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Company {

	@Id
	@GeneratedValue
	private Long id;

	private Collection<Employee> employees;

	private Collection<Truck> trucks;

	private String entityId;

	private String stationNumber;

	private String stationName;

	private String contractId;

	private String contractName;

	private String authOfficerId;

	private String authOfficerName;

	private String auaId;

	private String address;

	public Company() {

	}

	public Company(Collection<Employee> employees, Collection<Truck> trucks, String entityId, String stationNumber,
			String stationName, String contractId, String contractName, String authOfficerId, String authOfficerName,
			String auaId, String address) {

		this.employees = employees;
		this.trucks = trucks;
		this.entityId = entityId;
		this.stationNumber = stationNumber;
		this.stationName = stationName;
		this.contractId = contractId;
		this.contractName = contractName;
		this.authOfficerId = authOfficerId;
		this.authOfficerName = authOfficerName;
		this.auaId = auaId;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public Collection<Employee> getEmployees() {
		return employees;
	}

	public Collection<Truck> getTrucks() {
		return trucks;
	}

	public String getEntityId() {
		return entityId;
	}

	public String getStationNumber() {
		return stationNumber;
	}

	public String getStationName() {
		return stationName;
	}

	public String getContractId() {
		return contractId;
	}

	public String getContractName() {
		return contractName;
	}

	public String getAuthOfficerId() {
		return authOfficerId;
	}

	public String getAuthOfficerName() {
		return authOfficerName;
	}

	public String getAuaId() {
		return auaId;
	}

	public String getAddress() {
		return address;
	}

}
