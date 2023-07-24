//program demonstrate to bunji jumping using nested if
package org.tns.descionmaking;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		System.out.println("Enter the age and weight");
		Scanner s =new Scanner(System.in);
		int age =s.nextInt();
		int weight=s.nextInt();
		if(age>12)
		{
			if(weight>=40)
			{
				System.out.println("Elijibal for bunjijumping");
				if(weight>110)
				{
					System.out.println("Extra roops are added");
				}
			}
			else
			{
				System.out.println("not Eligibal");
			}
		}
		else {
			System.out.println("Not Eligibal");
		}
		

	}

}
