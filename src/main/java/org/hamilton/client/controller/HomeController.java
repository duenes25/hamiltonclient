package org.hamilton.client.controller;

import org.hamilton.client.model.Drug;
import org.hamilton.client.model.PharmacyListResponse;
import org.hamilton.client.service.DrugService;
import org.hamilton.client.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@Autowired
	DrugService drugService;
	
	@Autowired
	PharmacyService pharmacyService;
	
	@RequestMapping("/")
    public String baseController(Model model) {
        return "index";
    }
	
	@RequestMapping("/index")
    public String indexController(Model model) {
        return "index";
    }
	
	@RequestMapping(value = "/pharmacies", method = RequestMethod.POST)
    public String postPharmacyController(@RequestParam(value = "zip", required = false) String zip, 
    								@RequestParam(value = "pharmacyNdc", required = false) String pharmacyNdc,
    								Model model) {
		//ArrayList<Pharmacy> pharmacyList = pharmacyService.locatePharmacies(zip, pharmacyNdc);
		
		PharmacyListResponse pharmacyListResponse = pharmacyService.locatePharmacies(zip, pharmacyNdc);
		
		model.addAttribute("pharmacyList", pharmacyListResponse.pharmacyList);
		model.addAttribute("drugNameLabel", "Drug: " + pharmacyListResponse.drug.name);
		model.addAttribute("ndcLabel", "NDC: " + pharmacyListResponse.drug.ndc);
        return "pharmacies";
    }
	
	
	@RequestMapping("/drug")
    public String postDrugController(@RequestParam(value = "drugName", required = false) String drugName, 
									@RequestParam(value = "drugNdc", required = false) String drugNdc,
									Model model) {
		if(drugName.isEmpty() && drugNdc.isEmpty()){
			return "index";
		}
		
		Drug drug = drugService.getDrugInfo(drugName, drugNdc);
		
		model.addAttribute("drugNameLabel", drug.name);
		model.addAttribute("ndcLabel", "National Drug Code: " + drug.ndc);
		model.addAttribute("manufacturerLabel", "Manufacturer: " + drug.manufacturer);
		
        return "drug";
    }
	
}
