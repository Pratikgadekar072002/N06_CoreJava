package org.tns.statickeyword;
class Employee
{
	private int empID;
    private String name;
	static String comapnyname =" tnsif";
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getComapnyname() {
		return comapnyname;
	}
	public static void setComapnyname(String comapnyname) {
		Employee.comapnyname = comapnyname;
	}
	
	public void display()
	{
		System.out.println(" Emp Id :"+this.getEmpID()+" "+" Emp name : "+this.name+" "
				+ ""+ "company name : "+Employee.comapnyname);
	}
}

public class StaticVariable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setEmpID(1);
		e.setName("pratik");
		e.display();
		
		Employee e1 = new Employee();
		e1.setEmpID(2);
		e1.setName("kiran");
		e1.display();
		
		Employee e2 = new Employee();
		e2.setEmpID(3);
		e2.setName("shubham");
		e2.display();

	}

}
