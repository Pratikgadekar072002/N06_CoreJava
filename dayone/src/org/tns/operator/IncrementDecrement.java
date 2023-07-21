package org.tns.operator;

public class IncrementDecrement {

	public static void main(String[] args) {
		int x=23,y=6;
		int res1=x++ + ++y;
		System.out.println(res1);
		System.out.println(x);
		System.out.println(y);
		System.out.println("Result 2");
		int a=23,b=6;
		int res2=a-- + --b;
		System.out.println(res2);
		System.out.println(a);
		System.out.println(b);
		

	}

}
