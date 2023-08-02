package org.tns.superdemo;
class Google
{
	String ceo;
	public Google(String ceo) 
	{
		System.out.println(" default constor"+ceo);
	}	
}
class Gmail extends Google
{
	String userid;
	public Gmail(String ceo, String userid)
	{
		super(ceo);
		this.userid=userid;
		System.out.println(userid);
	}
	
}

public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		Gmail g =new Gmail(" pratik "," pratikgadekar758@gmail.com");

		

	}

}
