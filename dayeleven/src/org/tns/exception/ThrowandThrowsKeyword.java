package org.tns.exception;

public class ThrowandThrowsKeyword {
	
	static void isEligible(int age,int weight)
	{
		if(age>18 && weight>50)
		{
			System.out.println("person is eligibal to donate the blood");
		}
		else
		{
			throw new ArithmeticException("criteri is not satisified");
		}
	}

	public static void main(String[] args) {
		try 
		{
			isEligible(13,54);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		

	}

}
