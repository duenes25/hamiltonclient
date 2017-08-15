package org.hamilton.client.data;

import java.util.ArrayList;

import org.hamilton.client.model.Pharmacy;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PharmacyDAOImpl implements PharmacyDAO{

	@Override
	public ArrayList<Pharmacy> retrievePharmacyList(String zip, String ndc) {
		
		System.out.println("In PharmacyDAO Layer");
		ArrayList<Pharmacy> pharmacies = new ArrayList<Pharmacy>();		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ArrayList<Pharmacy>> pharmacyListResponse =
	        restTemplate.exchange("https://hamilton-service.herokuapp.com/pharmacies",
	                    HttpMethod.GET, null, new ParameterizedTypeReference<ArrayList<Pharmacy>>() {
	            }, zip, ndc);
		pharmacies = pharmacyListResponse.getBody();
		
		System.out.println("Completed Rest API Call");
		
		return pharmacies;
	}
	

}
