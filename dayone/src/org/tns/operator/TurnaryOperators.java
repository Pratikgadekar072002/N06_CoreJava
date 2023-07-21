package org.tns.operator;

import java.util.Scanner;

public class TurnaryOperators {

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner s= new Scanner(System.in);
		int num =s.nextInt();
		String result=(num%2==0)?"even":"odd";
		System.out.println("result is:"+result);
		s.close();

	}

}
