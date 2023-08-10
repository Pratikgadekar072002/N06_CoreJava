package org.tns.singledimentionalarray;

import java.util.Arrays;
import java.util.Scanner;

//program to demonnstrate on array using run time input values

public class ArrayMax {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println(" Enter the total number of array elements");
		int n = s.nextInt();
		
		//array decleration
		int arr[]=new int [n];
		for (int i=0;i<n;i++) 
		{
			arr[i]=s.nextInt();
		}
		System.out.println("array elements are :");
		for (int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		int max=arr[0];
		for (int i=0;i<n;i++)
		{
			if (arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Largest Element is : "+max);
		Arrays.sort(arr);
		System.out.println("sorted elemets are :");
		for(int i :arr)
		{
			System.out.print(i +"  ");
		}
		
		

	}

}
