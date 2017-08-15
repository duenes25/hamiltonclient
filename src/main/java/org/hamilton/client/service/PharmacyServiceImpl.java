package org.hamilton.client.service;

import java.util.ArrayList;

import org.hamilton.client.data.DrugDAO;
import org.hamilton.client.data.PharmacyDAO;
import org.hamilton.client.model.Drug;
import org.hamilton.client.model.Pharmacy;
import org.hamilton.client.model.PharmacyListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PharmacyServiceImpl implements PharmacyService{

	@Autowired
	PharmacyDAO pharmacyDAO;
	
	@Autowired
	DrugDAO drugDAO;
	
	@Override
	public PharmacyListResponse locatePharmacies(String zip, String ndc) {
		
		PharmacyListResponse pharmacyListResponse = new PharmacyListResponse();
		ArrayList<Pharmacy> pharmacies = pharmacyDAO.retrievePharmacyList(zip, ndc);
		//System.out.println(rates);
		pharmacyListResponse.setPharmacyList(pharmacies);
		
		Drug drug = drugDAO.retrieveDrugInfo(ndc);
		pharmacyListResponse.setDrug(drug);
		
		return pharmacyListResponse;
	}

}
