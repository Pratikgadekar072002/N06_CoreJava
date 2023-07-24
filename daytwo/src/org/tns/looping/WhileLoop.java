package org.tns.looping;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		while(n>=1)
		{
			System.out.println(n);
			n--;
		}
	}

}
