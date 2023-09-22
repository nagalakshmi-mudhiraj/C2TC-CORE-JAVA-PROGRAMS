package com.tnsif.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamDemo {

	public static void main(String[] args) {
		// conventional way
		
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(11);
		l.add(13);
		l.add(16);
		l.add(112);
		l.add(102);
		l.add(118);
		l.add(147);
		l.add(240);
		l.add(101);
		l.add(102);
		
		System.out.println(l);
	//	List<Integer> evenList=new ArrayList<>();
		
	//for(Integer i:l)
	//	{
		//	if(i%2==0)
		//	{
		//		evenList.add(i);
		
		//	}
		//}
        //   System.out.println(evenList);
		
		Stream<Integer> stream=l.stream();
		List<Integer> even=stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(even);
	}

}
