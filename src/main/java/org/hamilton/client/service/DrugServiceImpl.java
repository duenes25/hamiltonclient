package org.hamilton.client.service;

import org.hamilton.client.data.DrugDAO;
import org.hamilton.client.model.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DrugServiceImpl implements DrugService{

	@Autowired
	DrugDAO drugDAO;
	
	@Override
	public Drug getDrugInfo(String drugName, String ndc) {
		Drug drug = new Drug();
		drug = drugDAO.retrieveDrugInfo(ndc);
		
		return drug;
	}

	

}
