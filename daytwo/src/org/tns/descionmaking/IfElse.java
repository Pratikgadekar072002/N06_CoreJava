//program to demonstrate on to check to person is eligibal to donate a blood or not using if else
package org.tns.descionmaking;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		System.out.println("Enter the age and Weight:");
		Scanner s= new Scanner(System.in);
		int age =s.nextInt();
		int weight =s.nextInt();
		if(age>18 && weight>50)
		{
			System.out.println("Eligibale to donate a blood");
		}
		else
		{
			System.out.println("Eligibale to not donate a blood");
		}

	}

}
