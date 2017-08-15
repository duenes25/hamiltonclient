package org.hamilton.client.service;

import org.hamilton.client.model.PharmacyListResponse;

public interface PharmacyService {

	public PharmacyListResponse locatePharmacies(String zip, String ndc);

}