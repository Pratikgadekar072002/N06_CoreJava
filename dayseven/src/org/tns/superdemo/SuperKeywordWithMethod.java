package org.tns.superdemo;

class MET
{
	String OwnerName=" chagan Bhujbal";
	void displayName()
	{
		System.out.println("Owner is: "+ OwnerName);
	}
	
}
class BKC extends MET
{
	String OwnerName=" Shefali Bhujbal";
	void displayName()
	{
		/* if parent class and child class and parent clas
		 *  method name are same if you want acces that method then super.nethodname();*/
		super.displayName();
		System.out.println("Owner is: "+ OwnerName);
	}
}

public class SuperKeywordWithMethod {

	public static void main(String[] args) 
	{
		BKC b = new BKC();
		b.displayName();

	}

}
