package com.hibernateframework2;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String pinCode;
	private String city;
	private String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String pinCode, String city, String state) {
		super();
		this.pinCode = pinCode;
		this.city = city;
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
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

	
}
