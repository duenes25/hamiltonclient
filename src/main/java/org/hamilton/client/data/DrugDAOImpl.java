package org.hamilton.client.data;

import org.hamilton.client.model.Drug;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DrugDAOImpl implements DrugDAO{

	@Override
	public Drug retrieveDrugInfo(String ndc) {
		
		System.out.println("In DrugDAO Layer");
		Drug drug = new Drug();		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Drug> drugResponse =
	        restTemplate.exchange("https://hamilton-service.herokuapp.com/drugInfo?ndc={ndc}",
	                    HttpMethod.GET, null, new ParameterizedTypeReference<Drug>() {
	            },ndc);
		System.out.println("Completed Rest API Call");
		drug = drugResponse.getBody();
		drug.name = cleanUpNullData(drug.name);
		drug.ndc = cleanUpNullData(drug.ndc);
		drug.manufacturer = cleanUpNullData(drug.manufacturer);
		return drug;
	}

	private String cleanUpNullData(String data){
		if (data == null || data.isEmpty()){
			return "";
		}else{
			return data;
		}
		
	}
	

}
