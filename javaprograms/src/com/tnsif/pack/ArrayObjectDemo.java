package com.tnsif.pack;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Student [] arr=new Student[5];
	        
	        
	        arr[0]=new Student (1, "Nagalakshmi");
	        arr[1]=new Student (2, "Ria");
	        arr[2]=new Student (3,"Diya");
	        arr[3]=new Student (4,"Siya");
	        arr[4]=new Student (5,"Piya");
	        
	        for(int i=0;i<arr.length;i++)
	        	System.out.println("Element at "+i+" ="+arr[i].getRollno()+" "+arr[i].getName());
	        
	        
	}

}
