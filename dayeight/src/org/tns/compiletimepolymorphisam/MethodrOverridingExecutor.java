package org.tns.compiletimepolymorphisam;

class cm
{
	static void correption(String str1,float amount)
	{
		System.out.println(str1 +" his correption amount is :"+amount);
	}
	
}
class sarpanch extends cm
{
	static void correption(String str1,float amount)
	{
		cm.correption("shubham tile", 5000000.80f);
		System.out.println(str1 +" his correption amount is :"+amount);
	}
	
}

public class MethodrOverridingExecutor {

	public static void main(String[] args) {
		
		sarpanch.correption("tushar ",5415432.40f);
	

	}

}
