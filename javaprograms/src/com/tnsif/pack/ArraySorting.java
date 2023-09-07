package com.tnsif.pack;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {15,89,45,15,75,25,35,11,10,9};
		System.out.println("Entered Array is=");
		
		for(int num:arr)
		{
			System.out.println(num+" ");
		}
           Arrays.sort(arr);
           {
        	   System.out.println("Here is your sorted Array=");
        	   
        	   for(int num:arr)
        	   {
        		   System.out.println(num+" ");
        	   }
        	   System.out.println("Lenght of the aaray arr is="+arr.length);
           }
	}

}
