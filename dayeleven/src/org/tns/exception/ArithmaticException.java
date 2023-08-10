package org.tns.exception;

import java.util.Scanner;

public class ArithmaticException {

	public static void main(String[] args) {
		
		System.out.println("enter the two numbers :");
		Scanner s =new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		//try block contain exception code
		try {
			System.out.println(x/y);
		}
		//catch block is used to handle that exception
		catch(Exception e)
		{
			System.out.println("Exception handaled :"+e);
		}
		

	}

}
