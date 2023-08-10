package org.tns.exception;

public class ArrayIndexOutOfBoundExcwption {
	
	static void display(int arr[])
	{
		try {
		System.out.println(arr[3]);
		}
		catch(Exception e)
		{
			System.out.println(" exception handaled : "+e);
		}
		finally 
		{
			System.out.println("finally block is always executed");
		}
		System.out.println("any statment out of the block is always executed");
	}

	public static void main(String[] args) 
	{
		int arr[]= {10,5,8};
		display(arr);
		

	}

}
