package com.tnsif.arraylist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer>  l1=new LinkedList<Integer>();//generic
		
		l1.add(450);
		l1.add(200);
		l1.add(600);
		l1.add(800);
		l1.add(1000);
		l1.add(1200);
		l1.add(1400);
		
		System.out.println(l1);
		
		l1.addFirst(01);
		l1.addLast(1500);
		
		//Sorting
		Collections.sort(l1);
		System.out.println(l1);
		
		//Reverse
		
		Collections.reverse(l1);
		
		System.out.println(l1);

	}

}
