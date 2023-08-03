package org.tns.compiletimepolymorphisam;

class bolloywood{
	
	static String showcouples(String str1,String str2)
	{
		return str1 + " dance with "  + str2;
	}
	static String showcouples(String str1,String str2,String str3)
	{
		return str1 + " dance with "+ str2+"as well as "+str3;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {

		System.out.println(bolloywood.showcouples("shubham","ashiwini"));
		System.out.println(bolloywood.showcouples("anish ","bele ","shinde"));
	}

}
