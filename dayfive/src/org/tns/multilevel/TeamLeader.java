package org.tns.multilevel;

public class TeamLeader extends Manager{

	private String  leadname;
	private String projectname;
	
	public String getLeadname() {
		return leadname;
	}

	public void setLeadname(String leadname) {
		this.leadname = leadname;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public TeamLeader(String deptname, String name, int empid,String leadname ,String projectname) {
		super(deptname, name, empid);
		
	}

	@Override
	public String toString() {
		return "TeamLeader [leadname=" + leadname + ", projectname=" + projectname + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
