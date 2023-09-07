package com.tnsif.pack;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,5,78,96,74,25,12,2,36,96,11,22,44,66,77};
		
		double sum = 0;
		
		for (int i=0; i< numbers.length;i++) {
			
			sum +=numbers[i];
			
		}
		double average = sum / numbers.length;
		
		System.out.println(average);
		}




	}


