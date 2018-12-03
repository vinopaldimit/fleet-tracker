package org.wecancodeit.fleettracker.models;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private long id;

	private float miles;

	@ManyToMany
	private Collection<Company> companies = new HashSet<>();

	@ManyToMany
	private Collection<Trip> trips = new HashSet<>();

	private String fName;

	private String mName;

	private String lName;

	private String ssn;

	private String fedexId;

	private String dateOfBirth;

	private String phoneNumber;

	private String hireDate;

	private String sixtyDays;

	private String licenseNumber;

	private String licenseState;

	private String licenseExp;

	private String dotPhysicalExp;

	private String address;

//	private Collection<String> accidents = new HashSet<>();

	private String email;

	private Float soloPayrate;

	private Float teamPayrate;

	private Float trainerPayrate;

	private Float studentPayrate;

	public Employee() {

	}

	public Employee(String fName, String mName, String lName, float miles, String ssn, String fedexId,
			String dateOfBirth, String phoneNumber, String hireDate, String sixtyDays, String licenseNumber,
			String licenseState, String licenseExp, String dotPhysicalExp, String address, String email,
			Float soloPayrate, Float teamPayrate, Float trainerPayrate, Float studentPayrate) {

		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.miles = miles;
		this.ssn = ssn;
		this.fedexId = fedexId;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.sixtyDays = sixtyDays;
		this.licenseNumber = licenseNumber;
		this.licenseState = licenseState;
		this.licenseExp = licenseExp;
		this.dotPhysicalExp = dotPhysicalExp;
		this.address = address;
		this.email = email;
		this.soloPayrate = soloPayrate;
		this.teamPayrate = teamPayrate;
		this.trainerPayrate = trainerPayrate;
		this.studentPayrate = studentPayrate;
	}

	public long getId() {
		return id;
	}

	public String getfName() {
		return fName;
	}

	public String getmName() {
		return mName;
	}

	public String getlName() {
		return lName;
	}

	public float getMiles() {
		return miles;
	}

	public Collection<Company> getCompanies() {
		return companies;
	}

	public Collection<Trip> getTrips() {
		return trips;
	}

	public String getSsn() {
		return ssn;
	}

	public String getFedexId() {
		return fedexId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public String getSixtyDays() {
		return sixtyDays;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public String getLicenseState() {
		return licenseState;
	}

	public String getLicenseExp() {
		return licenseExp;
	}

	public String getDotPhysicalExp() {
		return dotPhysicalExp;
	}

	public String getAddress() {
		return address;
	}

//	public Collection<String> getAccidents() {
//		return accidents;
//	}

	public String getEmail() {
		return email;
	}

	public Float getSoloPayrate() {
		return soloPayrate;
	}

	public Float getTeamPayrate() {
		return teamPayrate;
	}

	public Float getTrainerPayrate() {
		return trainerPayrate;
	}

	public Float getStudentPayrate() {
		return studentPayrate;
	}

}
