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

		Truck truckOne = new Truck("500000", "Freightliner", "Cascadia", "2019", "3AKJHJL12345", "EFP123", "Rialto",
				400000F, 50000F, "05/04/2018");
		Truck truckTwo = new Truck("666666", "Freightliner", "Cascadia", "2012", "6ASS5JL12345", "EFP456", "Rialto",
				300000F, 55000F, "07/08/2018");

//		Truck(Float , String , String , String , String , String , String , Long , Long , String )
//		Truck( mileage,  make,  model,  year,  vIn,  ,  actualRun, milesAtService,  milesBetweenService,  dotInspectionDate)

		createTruckList(new Truck[] { truckOne, truckTwo,
				new Truck("420420", "International", "LT", "2016", "ASDFGHJKL345", "EFP789", "Rialto", 400000F, 45000F,
						"06/12/2018"),
				new Truck("123456", "Freightliner", "Cascadia", "2012", "6ASS5JL99945", "EFP987", "Rialto", 300000F,
						55000F, "09/20/2018") }).forEach(this::saveTruckToRepo);

//		Trip(String, Long , Long , Long , Long , Float ,Float , Float , Float , Float , Float , Float , Long , Long, Float , Float , Float , Float , String , String 
//		Trip( date,  tripNumber,  origin,  destination,  zipCode,  milesQuantity, vMr,  mileagePlus,  premiums,  fuel,  totalRate,  aMt,  packages, packagesAmt, dropAndHook,  tolls,  flatRate,  dailyGrossAmount,  driverOne,  driverTwo)	

		createTripList(new Trip[] {
//				new Trip("3-Nov-18", 117979830L, 432L, 7820L, 43123L, 286F, 1.305F, 0.085F, 0F, 0.287F, 1.677F, 479.62F,
//						0L, 0L, 13F, 0F, 0F, 492.62F, "7441635", ""),
//				new Trip("3-Nov-18", 118004602L, 7820L, 432L, 61858L, 285F, 1.305F, 0.085F, 0F, 0.287F, 1.677F, 477.96F,
//						0L, 0L, 13F, 0F, 0F, 490.96F, "7441635", ""),
//				new Trip("6-Nov-18", 118063482L, 432L, 7820L, 43123L, 286F, 1.305F, 0.085F, 0F, 0.287F, 1.677F, 479.62F,
//						0L, 0L, 13F, 0F, 0F, 492.62F, "7441635", ""),
//				new Trip("6-Nov-18", 118086992L, 7820L, 432L, 61858L, 285F, 1.305F, 0.085F, 0F, 0.287F, 1.677F, 477.96F,
//						0L, 0L, 13F, 0F, 0F, 490.96F, "7441635", ""),
//				new Trip("7-Nov-18", 118116474L, 432L, 7820L, 43123L, 286F, 1.305F, 0.085F, 0F, 0.287F, 1.677F, 479.62F,
//						0L, 0L, 13F, 0F, 0F, 492.62F, "7441635", ""),
//				new Trip("7-Nov-18", 118145578L, 7820L, 432L, 61858L, 285F, 1.305F, 0.085F, 0F, 0.287F, 1.677F, 477.96F,
//						0L, 0L, 13F, 0F, 0F, 490.96F, "7441635", ""),
//				new Trip("8-Nov-18", 118172603L, 432L, 7820L, 43123L, 286F, 1.305F, 0.085F, 0F, 0.287F, 1.677F, 479.62F,
//						0L, 0L, 13F, 0F, 0F, 492.62F, "7441635", ""),
//				new Trip("8-Nov-18", 118199929L, 7820L, 432L, 61858L, 285F, 1.305F, 0.085F, 0F, 0.287F, 1.677F, 477.96F,
//						0L, 0L, 13F, 0F, 0F, 490.96F, "7441635", ""),
//				new Trip("9-Nov-18", 118227286L, 432L, 7820L, 43123L, 286F, 1.305F, 0.085F, 0F, 0.287F, 1.677F, 479.62F,
//						0L, 0L, 13F, 0F, 0F, 492.62F, "7441635", ""),
//				new Trip("9-Nov-18", 118254374L, 7820L, 432L, 61858L, 285F, 1.305F, 0.085F, 0F, 0.287F, 1.677F, 477.96F,
//						0L, 0L, 13F, 0F, 0F, 490.96F, "7441635", ""),
//				new Trip("3-Nov-18", 117982671L, 432L, 7820L, 43123L, 286F, 1.305F, 0.095F, 0F, 0.2707F, 1.6707F,
//						477.82F, 0L, 0L, 13F, 0F, 0F, 490.82F, "7741037", ""),
//				new Trip("3-Nov-18", 118007145L, 7820L, 432L, 61858L, 285F, 1.305F, 0.095F, 0F, 0.2707F, 1.6707F,
//						476.16F, 0L, 0L, 13F, 0F, 0F, 489.16F, "7741037", ""),
//				new Trip("8-Nov-18", 118195950L, 432L, 7820L, 43123L, 286F, 1.305F, 0.095F, 0F, 0.2707F, 1.6707F,
//						477.82F, 0L, 0L, 13F, 0F, 0F, 490.82F, "7741037", ""),
//				new Trip("8-Nov-18", 118205119L, 7820L, 432L, 61858L, 285F, 1.305F, 0.095F, 0F, 0.2707F, 1.6707F,
//						476.16F, 0L, 0L, 13F, 0F, 0F, 489.16F, "7741037", ""),
//				new Trip("9-Nov-18", 118250336L, 432L, 7820L, 43123L, 286F, 1.305F, 0.095F, 0F, 0.2707F, 1.6707F,
//						477.82F, 0L, 0L, 13F, 0F, 0F, 490.82F, "7763609", ""),
//				new Trip("9-Nov-18", 118257177L, 7820L, 432L, 61858L, 285F, 1.305F, 0.095F, 0F, 0.2707F, 1.6707F,
//						476.16F, 0L, 0L, 13F, 0F, 0F, 489.16F, "7763609", ""),
//				new Trip("7-Nov-18", 118107363L, 432L, 8580L, 43123L, 1048F, 1.416F, 0.125F, 0F, 0.3033F, 1.8443F,
//						1932.83F, 0L, 0L, 13F, 0F, 0F, 1945.83F, "7362917", "8035737"),
//				new Trip("7-Nov-18", 118154186L, 8580L, 432L, 58071L, 1047F, 1.416F, 0.125F, 0F, 0.3033F, 1.8443F,
//						1930.99F, 0L, 0L, 13F, 0F, 25.55F, 1969.54F, "7362917", "8035737"),
//				new Trip("8-Nov-18", 118218125L, 432L, 8580L, 43123L, 1048F, 1.416F, 0.125F, 0F, 0.3033F, 1.8443F,
//						1932.83F, 0L, 0L, 13F, 0F, 0F, 1945.83F, "7362917", "8035737"),
//				new Trip("9-Nov-18", 118264186L, 8580L, 432L, 58071L, 1047F, 1.416F, 0.125F, 0F, 0.3033F, 1.8443F,
//						1930.99F, 0L, 0L, 13F, 0F, 25.55F, 1969.54F, "7362917", "8035737"),
//				new Trip("4-Nov-18", 118023265L, 344L, 406L, 34475L, 814F, 1.416F, 0.115F, 0F, 0.2707F, 1.8017F,
//						1466.58F, 0L, 0L, 13F, 0F, 0F, 1479.58F, "7103293", "7379575"),
//				new Trip("3-Nov-18", 118006750L, 344L, 406L, 34475L, 814F, 1.416F, 0.125F, 0F, 0.2707F, 1.8117F,
//						1474.72F, 0L, 0L, 13F, 0F, 0F, 1487.72F, "7131443", "7714921"),
//				new Trip("6-Nov-18", 118089229L, 406L, 461L, 41051L, 141F, 1.434F, 0.125F, 0F, 0.2707F, 1.8297F,
//						257.99F, 0L, 0L, 13F, 0F, 0F, 270.99F, "7131443", "7714921"),
//				new Trip("6-Nov-18", 118092540L, 461L, 923L, 46077L, 2041F, 1.416F, 0.125F, 0F, 0.2707F, 1.8117F,
//						3697.69F, 0L, 0L, 13F, 0F, 0F, 3710.69F, "7131443", "7714921"),
//				new Trip("8-Nov-18", 118200147L, 923L, 344L, 92316L, 2386F, 1.416F, 0.125F, 0F, 0.2707F, 1.8117F,
//						4322.72F, 0L, 0L, 13F, 0F, 0F, 4335.72F, "7131443", "7714921"),
//				new Trip("3-Nov-18", 117979947L, 406L, 7153L, 41051L, 553F, 1.416F, 0.115F, 0F, 0.287F, 1.818F,
//						1005.36F, 0L, 0L, 13F, 0F, 0F, 1018.36F, "8156986", "8156988"),
//				new Trip("4-Nov-18", 118011439L, 7153L, 406L, 18631L, 552F, 1.416F, 0.115F, 0F, 0.287F, 1.818F,
//						1003.53F, 0L, 0L, 13F, 0F, 0F, 1016.53F, "8156986", "8156988"),
//				new Trip("6-Nov-18", 118061309L, 406L, 7153L, 41051L, 553F, 1.416F, 0.115F, 0F, 0.287F, 1.818F,
//						1005.36F, 0L, 0L, 13F, 0F, 0F, 1018.36F, "8156986", "8156988"),
//				new Trip("6-Nov-18", 118107097L, 7153L, 406L, 18631L, 552F, 1.416F, 0.115F, 0F, 0.287F, 1.818F,
//						1003.53F, 0L, 0L, 13F, 0F, 0F, 1016.53F, "8156986", "8156988"),
//				new Trip("7-Nov-18", 118140080L, 406L, 8386L, 41051L, 474F, 1.416F, 0.115F, 0F, 0.287F, 1.818F, 861.73F,
//						0L, 0L, 13F, 0F, 0F, 874.73F, "8156986", "8156988"),
//				new Trip("7-Nov-18", 118151810L, 8386L, 406L, 72301L, 473F, 1.416F, 0.115F, 0F, 0.287F, 1.818F, 859.92F,
//						0L, 0L, 13F, 0F, 0F, 872.92F, "8156986", "8156988"),
//				new Trip("8-Nov-18", 118173174L, 406L, 7153L, 41051L, 553F, 1.416F, 0.115F, 0F, 0.287F, 1.818F,
//						1005.36F, 0L, 0L, 13F, 0F, 0F, 1018.36F, "8156986", "8156988"),
//				new Trip("8-Nov-18", 118205790L, 7153L, 406L, 18631L, 552F, 1.416F, 0.115F, 0F, 0.287F, 1.818F,
//						1003.53F, 0L, 0L, 13F, 0F, 0F, 1016.53F, "8156986", "8156988"),
//				new Trip("9-Nov-18", 118227777L, 406L, 7153L, 41051L, 553F, 1.416F, 0.115F, 0F, 0.287F, 1.818F,
//						1005.36F, 0L, 0L, 13F, 0F, 0F, 1018.36F, "8156986", "8156988"),
//				new Trip("9-Nov-18", 118260927L, 7153L, 406L, 18631L, 552F, 1.416F, 0.115F, 0F, 0.287F, 1.818F,
//						1003.53F, 0L, 0L, 13F, 0F, 0F, 1016.53F, "8156986", "8156988"),
//				new Trip("3-Nov-18", 117972590L, 5431L, 432L, 43123L, 8F, 3.092F, 0.125F, 0F, 0.287F, 3.504F, 28.04F,
//						0L, 0L, 9F, 0F, 0F, 37.04F, "7297759", "7467174"),
//				new Trip("3-Nov-18", 117974917L, 432L, 5431L, 43123L, 9F, 3.035F, 0.125F, 0F, 0.287F, 3.447F, 31.03F,
//						0L, 0L, 9F, 0F, 0F, 40.03F, "7297759", "7467174"),
//				new Trip("3-Nov-18", 117976177L, 5431L, 8643L, 43123L, 459F, 1.416F, 0.125F, 0F, 0.287F, 1.828F,
//						839.05F, 0L, 0L, 9F, 0F, 0F, 848.05F, "7297759", "7467174"),
//				new Trip("3-Nov-18", 118007672L, 8643L, 432L, 63348L, 464F, 1.416F, 0.125F, 0F, 0.287F, 1.828F, 848.19F,
//						0L, 0L, 13F, 0F, 0F, 861.19F, "7297759", "7467174"),
//				new Trip("5-Nov-18", 118030795L, 432L, 5436L, 43123L, 15F, 2.74F, 0.125F, 0F, 0.287F, 3.152F, 47.29F,
//						0L, 0L, 13F, 0F, 0F, 60.29F, "7297759", "7467174"),
//				new Trip("5-Nov-18", 118036801L, 5436L, 89L, 43125L, 522F, 1.416F, 0.125F, 0F, 0.287F, 1.828F, 954.21F,
//						0L, 0L, 13F, 0F, 0F, 967.21F, "7297759", "7467174"),
//				new Trip("5-Nov-18", 118041408L, 89L, 5087L, 8832L, 5F, 3.275F, 0.125F, 0F, 0.287F, 3.687F, 18.45F, 0L,
//						0L, 9F, 0F, 0F, 27.45F, "7297759", "7467174"),
//				new Trip("6-Nov-18", 118058080L, 5087L, 5431L, 8837L, 527F, 1.416F, 0.125F, 0F, 0.287F, 1.828F, 963.36F,
//						0L, 0L, 9F, 0F, 0F, 972.36F, "7297759", "7467174"),
//				new Trip("6-Nov-18", 118059204L, 5431L, 5087L, 43123L, 527F, 1.416F, 0.125F, 0F, 0.287F, 1.828F,
//						963.36F, 0L, 0L, 13F, 0F, 0F, 976.36F, "7297759", "7467174"),
//				new Trip("6-Nov-18", 118091654L, 5087L, 5431L, 8837L, 527F, 1.416F, 0.125F, 0F, 0.287F, 1.828F, 963.36F,
//						0L, 0L, 9F, 0F, 0F, 972.36F, "7297759", "7467174"),
//				new Trip("7-Nov-18", 118108457L, 5431L, 432L, 43123L, 8F, 3.092F, 0.125F, 0F, 0.287F, 3.504F, 28.04F,
//						0L, 0L, 13F, 0F, 0F, 41.04F, "7297759", "7467174"),
//				new Trip("7-Nov-18", 118110725L, 432L, 5087L, 43123L, 529F, 1.416F, 0.125F, 0F, 0.287F, 1.828F, 967.01F,
//						0L, 0L, 13F, 0F, 0F, 980.01F, "7297759", "7467174"),
//				new Trip("7-Nov-18", 118146874L, 5087L, 5431L, 8837L, 527F, 1.416F, 0.125F, 0F, 0.287F, 1.828F, 963.36F,
//						0L, 0L, 9F, 0F, 0F, 972.36F, "7297759", "7467174"),
//				new Trip("8-Nov-18", 118167181L, 5431L, 432L, 43123L, 8F, 3.092F, 0.125F, 0F, 0.287F, 3.504F, 28.04F,
//						0L, 0L, 13F, 0F, 0F, 41.04F, "7297759", "7467174"),
//				new Trip("8-Nov-18", 118168331L, 432L, 89L, 43123L, 528F, 1.416F, 0.125F, 0F, 0.287F, 1.828F, 965.19F,
//						0L, 0L, 13F, 0F, 0F, 978.19F, "7297759", "7467174"),
//				new Trip("8-Nov-18", 118202707L, 89L, 5087L, 8832L, 5F, 3.275F, 0.125F, 0F, 0.287F, 3.687F, 18.45F, 0L,
//						0L, 9F, 0F, 0F, 27.45F, "7297759", "7467174"),
//				new Trip("8-Nov-18", 118203575L, 5087L, 5431L, 8837L, 527F, 1.416F, 0.125F, 0F, 0.287F, 1.828F, 963.36F,
//						0L, 0L, 9F, 0F, 0F, 972.36F, "7297759", "7467174"),
//				new Trip("9-Nov-18", 118219468L, 5431L, 432L, 43123L, 8F, 3.092F, 0.125F, 0F, 0.287F, 3.504F, 28.04F,
//						0L, 0L, 13F, 0F, 0F, 41.04F, "7297759", "7467174"),
				new Trip("9-Nov-18", 118221163L, 432L, 89L, 43123L, 528F, 1.305F, 0.095F, 0F, 0.287F, 1.687F, 890.74F,
						0L, 0L, 13F, 0F, 0F, 903.74F, "7297759", "", truckTwo),
				new Trip("9-Nov-18", 118256513L, 89L, 5087L, 8832L, 5F, 2.816F, 0.095F, 0F, 0.287F, 3.198F, 16F, 0L, 0L,
						9F, 0F, 0F, 25F, "7297759", "", truckOne),
				new Trip("9-Nov-18", 118257154L, 5087L, 5431L, 8837L, 527F, 1.305F, 0.095F, 0F, 0.287F, 1.687F, 889.06F,
						0L, 0L, 9F, 0F, 0F, 898.06F, "7297759", "", truckOne) }).forEach(this::saveTripToRepo);

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
