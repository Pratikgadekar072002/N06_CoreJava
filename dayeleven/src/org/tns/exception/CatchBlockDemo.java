package org.tns.exception;


public class CatchBlockDemo 
{
	static void print(int arr[])
	{
		try 
		{
		System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(" handaled exception "+e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		
		int arr[]= {12,13,14};
		print(arr);
		

	}

}
