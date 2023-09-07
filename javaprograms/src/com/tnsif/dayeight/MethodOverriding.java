package com.tnsif.dayeight;

public class MethodOverriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Rbi r;
           r=new Sbi();
            System.out.println(r.rateOfInterest());

             r=new Hdfc();
             
             System.out.println(r.rateOfInterest());

             
             
             

            r=new Icici();
            
	         System.out.println(r.rateOfInterest());
	}

}


