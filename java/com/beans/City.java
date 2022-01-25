package com.beans;

public class City {
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(String city) {
		super();
		this.city = city;
	}

	@Override
	public String toString() {
		return "City [city=" + city + "]";
	}
	
	
}
