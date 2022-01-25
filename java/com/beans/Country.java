package com.beans;

public class Country {
	private String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Country [country=" + country + "]";
	}

	public Country(String country) {
		super();
		this.country = country;
	}

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
