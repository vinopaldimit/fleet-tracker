package org.wecancodeit.fleettracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.fleettracker.models.Company;
import org.wecancodeit.fleettracker.models.Employee;
import org.wecancodeit.fleettracker.models.FedExAssignment;
import org.wecancodeit.fleettracker.models.Trip;
import org.wecancodeit.fleettracker.models.Truck;
import org.wecancodeit.fleettracker.repositories.CompanyRepository;
import org.wecancodeit.fleettracker.repositories.EmployeeRepository;
import org.wecancodeit.fleettracker.repositories.FedExAssignmentRepository;
import org.wecancodeit.fleettracker.repositories.TripRepository;
import org.wecancodeit.fleettracker.repositories.TruckRepository;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private TruckRepository truckRepo;

	@Autowired
	private TripRepository tripRepo;

	@Autowired
	private EmployeeRepository employeeRepo;

	@Autowired
	private CompanyRepository companyRepo;

	@Autowired
	private FedExAssignmentRepository assignmentRepo;

	@GetMapping("/trucks")
	public Iterable<Truck> getTrucks() {
		return truckRepo.findAll();
	}

	@GetMapping("/trucks/{id}")
	public Truck getTruck(@PathVariable(value = "id") Long id) {
		return truckRepo.findById(id).get();
	}

	@GetMapping("/trips")
	public Iterable<Trip> getTrips() {
		return tripRepo.findAll();
	}

	@GetMapping("/trips/{id}")
	public Trip getTrip(@PathVariable(value = "id") Long id) {
		return tripRepo.findById(id).get();

	}

	@GetMapping("/employees")
	public Iterable<Employee> getEmployees() {
		return employeeRepo.findAll();
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable(value = "id") Long id) {
		return employeeRepo.findById(id).get();

	}

	@GetMapping("/companies")
	public Iterable<Company> getCompanies() {
		return companyRepo.findAll();
	}

	@GetMapping("/companies/{id}")
	public Company getCompany(@PathVariable(value = "id") Long id) {
		return companyRepo.findById(id).get();

	}

	@GetMapping("/companies")
	public Iterable<FedExAssignment> getCompanies() {
		return FedExAssignmentRepo.findAll();
	}

	@GetMapping("/companies/{id}")
	public FedExAssignment getFedExAssignment(@PathVariable(value = "id") Long id) {
		return FedExAssignmentRepo.findById(id).get();

	}

}
