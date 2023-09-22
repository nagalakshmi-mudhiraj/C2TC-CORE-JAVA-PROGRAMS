package com.tnsif.strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //    String  s=new String("Nagalakshmi");
   //      s.concat("Duguri");
         
     //    System.out.println(s);
		
		String str="NAGALAKSHMI";
		
		System.out.println(str);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str.length());
		System.out.println(str.substring(2));
		
		System.out.println(str.substring(2,10));
		
		System.out.println(str.equals("nagalakshmi"));//content comparison
		
		System.out.println(str.equalsIgnoreCase("nagalakshmi"));
		
		System.out.println(str.replace('A', 'S'));
	}




             //Exercise
         String s1=new String("Hello");
         String s2=new String("Hello");
         String s3="Hello";
         String s4="Hello";
         //total objects created
         
}