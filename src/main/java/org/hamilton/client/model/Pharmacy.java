package org.hamilton.client.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Pharmacy extends Facility {
	
	public PharmacyType pharmacyType;
	
	public Pharmacy() {
		super();
	}
	
	public Pharmacy(String name, Location location,
			PharmacyType pharmacyType, Address address) {
		super(name, location, address);
		this.pharmacyType = pharmacyType;
	}



	public PharmacyType getPharmacyType() {
		return pharmacyType;
	}

	public void setPharmacyType(PharmacyType pharmacyType) {
		this.pharmacyType = pharmacyType;
	}


	@Override
	public String toString() {
		return "PharmacyFacility [pharmacyType=" + pharmacyType + "]";
	}
	
	
}

