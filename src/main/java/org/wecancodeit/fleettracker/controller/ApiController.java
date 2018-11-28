package org.wecancodeit.fleettracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.fleettracker.models.Trip;
import org.wecancodeit.fleettracker.models.Truck;
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

	@GetMapping("/trucks")
	public Iterable<Truck> getTruck() {
		return truckRepo.findAll();
	}

	@GetMapping("/trucks/{id}")
	public Truck getTrucks(@PathVariable(value = "id") Long id) {
		return truckRepo.findById(id).get();
	}

	@GetMapping("/trips")
	public Iterable<Trip> getTrip() {
		return tripRepo.findAll();
	}

	@GetMapping("/trips/{id}")
	public Trip getTrips(@PathVariable(value = "id") Long id) {
		return tripRepo.findById(id).get();

	}

}
