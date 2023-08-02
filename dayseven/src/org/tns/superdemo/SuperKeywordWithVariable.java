package org.tns.superdemo;
class Building
{
	int floors=23;
	String name ="Morya Galaxy";
}
class Flat extends Building
{
	String name="Pratik Gadekar";
	
	void print()
	{
		//if parent class and child class variable name are same ,and if you wanrt to access parent
		//class variable inside child class user super .var_variablename
		System.out.println(super.name);
		System.out.println(name);
	}
}

public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Flat f=new Flat();
		f.print();
		
		
	}

}
