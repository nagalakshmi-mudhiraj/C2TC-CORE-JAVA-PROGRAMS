package com.tnsif.pack;

import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		System.out.println("Enter the size of the Array");
		Scanner s=new Scanner (System.in);
		size=s.nextInt();
		
		
		int[] arr=new int[10];
		System.out.println("Enter the elements of the Array=");
		
		for(int i=0; i<size;i++)
		{
			
			arr[i]=s.nextInt();//Take input from the user
			
		}
		System.out.println("Here is the Array :");
		for (int i=0;i<size;i++)
		{
			
		System.out.println(arr[i]);
		}

	}



	}


