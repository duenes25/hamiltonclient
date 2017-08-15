package org.hamilton.client.data;

import java.util.ArrayList;
import org.hamilton.client.model.Pharmacy;


public interface PharmacyDAO {
	
	public ArrayList<Pharmacy> retrievePharmacyList(String zip, String ndc);
	

}
