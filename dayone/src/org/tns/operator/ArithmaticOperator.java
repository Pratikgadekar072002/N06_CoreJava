package org.tns.operator;

import java.util.Scanner;

public class ArithmaticOperator {

	public static void main(String[] args) {
		System.out.println("enter the two numbers");
		Scanner s1 = new Scanner(System.in);
		int num1 = s1.nextInt();
		int num2 = s1.nextInt();
		System.out.println("addition is :"+num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);

		

	}

}
