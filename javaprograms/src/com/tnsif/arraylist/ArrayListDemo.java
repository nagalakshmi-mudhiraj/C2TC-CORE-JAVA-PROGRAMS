package com.tnsif.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList  al=new ArrayList();// no type safety
		al.add("A");
		al.add(10);
		al.add(null);
		al.add(53);
		
		System.out.println(al);
		
		al.remove(2);
		
		System.out.println(al);
		
		al.add(2,"M");
		System.out.println(al);

	}

}
