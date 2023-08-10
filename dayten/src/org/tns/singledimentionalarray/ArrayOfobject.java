package org.tns.singledimentionalarray;

public class ArrayOfobject {
	
	public static void main(String[]arg)
	{
		Employee arr[]=new Employee[3];
		arr[0]=new Employee(101,"pratik",67000.45);
		arr[1]=new Employee(102,"ajay",67000.45);
		arr[2]=new Employee(10,"shubham",67000.45);
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i].getID()+ " "+ arr[i].getName()+ " "+arr[i].getSalary());
		}
		
	}

}
