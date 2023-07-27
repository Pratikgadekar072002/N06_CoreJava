package org.tns.singleinheritance;

public class Citizen {
	private String city;
	private int pincode;
	private String area;
	private long adhar;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getAdhar() {
		return adhar;
	}
	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", area=" + area + ", adhar=" + adhar + "]";
	}
	public Citizen() {
	
		System.out.println("citigen parent class");
	}
	public Citizen(String city, int pincode, String area, long adhar) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.area = area;
		this.adhar = adhar;
	}
	
	
	

}
