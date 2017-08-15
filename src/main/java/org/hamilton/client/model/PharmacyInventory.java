package org.hamilton.client.model;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PharmacyInventory {
	private final Pharmacy pharmacy;
	private final ArrayList<Drug> drugList;
	
	
	public PharmacyInventory(Pharmacy pharmacy, ArrayList<Drug> drugList) {
		super();
		this.pharmacy = pharmacy;
		this.drugList = drugList;
	}
	
	
	public PharmacyInventory() {
		super();
		this.pharmacy = new Pharmacy();
		this.drugList = new ArrayList<Drug>();
	}


	public Pharmacy getPharmacy() {
		return pharmacy;
	}
	
	public ArrayList<Drug> getDrugList() {
		return drugList;
	}
	
	
	
	

}
