package org.tns.multidimentionalarray;

import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		System.out.println("enter the elements");
		Scanner s =new Scanner(System.in);
		int arr[][]= new int [3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("multidintional array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}System.out.println(); 
		} 

	}

}
