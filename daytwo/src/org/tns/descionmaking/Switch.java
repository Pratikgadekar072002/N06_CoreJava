//program to demonstrate switch case2
package org.tns.descionmaking;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("1.Ram bhakt");
		System.out.println("2.Shiv bhakt");
		System.out.println("3.Bholenath");
		int song =s.nextInt();
		switch(song)
		{   
		case 1:
			System.out.println("jay shri ram");
			break;
			
		case 2:
			System.out.println(" Wah re shiva");
			break;
			
		case 3:
			System.out.println("bhole baba");
			break;
			
			default :
				System.out.println("Something gets wrong");
		
		}
		

	}

}