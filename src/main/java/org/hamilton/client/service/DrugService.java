package org.hamilton.client.service;

import org.hamilton.client.model.Drug;

public interface DrugService {
	
	public Drug getDrugInfo(String drugName, String ndc);

}
