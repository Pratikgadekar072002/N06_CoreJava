package org.tns.classandobject;
//Class deceleration
public class Employee {
	
	//Default data members
	int empID;
	String empName;
	float salary;
	String Department;
	
	//Method to Declaration and Defination
	
	void display()
	{
		System.out.println(" emp id:"+empID+"\nEmp Name:"+empName+"\nSalary:"+salary+"\nDpartment:"+Department);
		
	}
	public static void main(String[] args) {
		Employee s =new Employee();
		s.empID= 2;
		s.empName="pratik";
		s.salary=5000;
		s.Department="computer";
		s.display();
	}

}
