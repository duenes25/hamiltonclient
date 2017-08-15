package org.hamilton.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Address {
	public String street;
	public String city;
	public String state;
	public String zip;
	

	public Address() {
		super();
		this.street = "";
		this.city = "";
		this.state = "";
		this.zip = "";
	}
	
	
	public Address(String street, String city, String state, String zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}


	



	public String getStreet() {
		return street;
	}





	public void setStreet(String street) {
		this.street = street;
	}





	public String getCity() {
		return city;
	}





	public void setCity(String city) {
		this.city = city;
	}





	public String getState() {
		return state;
	}





	public void setState(String state) {
		this.state = state;
	}





	public String getZip() {
		return zip;
	}





	public void setZip(String zip) {
		this.zip = zip;
	}





	@Override
	public String toString() {
		return street + ", " + city + ", " + state + ". " + zip;
	}
	
	
}
