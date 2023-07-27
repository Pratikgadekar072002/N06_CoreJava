package org.tns.multilevel;

public class Manager {
	private String deptname;
	private String name;
	private int empid;
	
	//geters and setters
	public String getDeptnmae() {
		return deptname;
	}
	public void setDeptnmae(String deptnmae) {
		this.deptname = deptnmae;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Manager [deptname=" + deptname + ", name=" + name + ", empid=" + empid + "]";
	}
	public Manager(String deptname, String name, int empid) {
		super();
		this.deptname = deptname;
		this.name = name;
		this.empid = empid;
	}
	

}
