package org.tns.exception;
//program to demonstrate on when finally block is executed

public class FInallyBlockNotExecuted {

	static void display(int arr[])
	{
		try {
		System.out.println(arr[3]);
		//if try and catch block contain a system.exit(0);
		//after the exception code line ,then finally block does not execute
		System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println(" exception handaled : "+e);
			System.exit(0);
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
