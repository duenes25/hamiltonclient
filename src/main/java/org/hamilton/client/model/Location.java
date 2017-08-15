package org.hamilton.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Location {
	public int latitude;
	public int longitude;

	public Location() {
		super();
	}

	public Location(int latitude, int longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}
	

	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	

	@Override
	public String toString() {
		return "Location [latitude=" + latitude + ", longitude=" + longitude
				+ "]";
	}
	
	
}
