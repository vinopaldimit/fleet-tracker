package org.wecancodeit.fleettracker;

import java.util.ArrayList;
import java.util.Arrays;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.fleettracker.models.Trip;
import org.wecancodeit.fleettracker.models.Truck;
import org.wecancodeit.fleettracker.repositories.TripRepository;
import org.wecancodeit.fleettracker.repositories.TruckRepository;

@Service
public class FleetTrackerPopulator implements CommandLineRunner {

	@Resource
	TripRepository tripRepo;

	@Resource
	TruckRepository truckRepo;

	@Override
	public void run(String... args) throws Exception {

//		Trip(String, Long , Long , Long , Long , Float ,Float , Float , Float , Float , Float , Float , Long , Long, Float , Float , Float , Float , String , String 
//		Trip( date,  tripNumber,  origin,  destination,  zipCode,  milesQuantity, vMr,  mileagePlus,  premiums,  fuel,  totalRate,  aMt,  packages, packagesAmt, dropAndHook,  tolls,  flatRate,  dailyGrossAmount,  driverOne,  driverTwo)	

		createTripList(new Trip[] { new Trip("3-Nov-18", 117979830L, 432L, 7820L, 43123L, 286F, 1.305F, 0.085F, 0F,
				0.287F, 1.677F, 479.62F, 0L, 0L, 13F, 0F, 0F, 492.62F, "7441635", "") }).forEach(this::saveTripToRepo);

//		Truck(Float , String , String , String , String , String , String , Long , Long , String )
//		Truck( mileage,  make,  model,  year,  vIn,  ,  actualRun, milesAtService,  milesBetweenService,  dotInspectionDate)

		createTruckList(new Truck[] { new Truck(500000F, "Freightliner", "Cascadia", "2019", "3AKJHJL12345", "EFP123",
				"Rialto", 400000F, 50000F, "05/04/2018") }).forEach(this::saveTruckToRepo);

	}

	private ArrayList<Trip> createTripList(Trip[] trips) {
		return new ArrayList<>(Arrays.asList(trips));
	}

	private void saveTripToRepo(Trip trip) {
		tripRepo.save(trip);
	}

	private ArrayList<Truck> createTruckList(Truck[] trucks) {
		return new ArrayList<>(Arrays.asList(trucks));
	}

	private void saveTruckToRepo(Truck truck) {
		truckRepo.save(truck);
	}

}
