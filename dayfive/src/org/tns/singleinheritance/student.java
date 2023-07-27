package org.tns.singleinheritance;

public class student extends Citizen {
	private int rollno;
	private String collegename ;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	
	public student(String city, int pincode, String area, long adhar,int rollno,String collegename) {
		super(city, pincode, area, adhar);
		this.rollno = rollno;
		this.collegename = collegename;	
		}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", collegename=" + collegename + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
