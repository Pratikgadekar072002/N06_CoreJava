package org.tns.multilevel;
//child class
public class TeamMember extends TeamLeader {
	
	private int size;
	private int duration;

	
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public TeamMember(String deptname, String name, int empid, String leadname, String projectname ,int size,int duration) {
		super(deptname, name, empid, leadname, projectname);
		this.size=size;
		this.duration=duration;
	}


	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	

}
