package org.hamilton.client.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PharmacyListResponse {
	public ArrayList<Pharmacy> pharmacyList;
	public Drug drug;
	
	
	
	public PharmacyListResponse() {
		super();
	}



	public PharmacyListResponse(ArrayList<Pharmacy> pharmacyList, Drug drug) {
		super();
		this.pharmacyList = pharmacyList;
		this.drug = drug;
	}



	public ArrayList<Pharmacy> getPharmacyList() {
		return pharmacyList;
	}



	public void setPharmacyList(ArrayList<Pharmacy> pharmacyList) {
		this.pharmacyList = pharmacyList;
	}



	public Drug getDrug() {
		return drug;
	}



	public void setDrug(Drug drug) {
		this.drug = drug;
	}
	
	
	
	
}
