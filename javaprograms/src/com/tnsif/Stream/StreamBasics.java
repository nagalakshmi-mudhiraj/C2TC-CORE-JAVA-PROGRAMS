package com.tnsif.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
	
		
		Stream<Integer>    stream=Stream.of(10,20,30,40,50,60,70);
		
		//counting no of elements
		System.out.println("The number of elements present in the stream"+stream.count());
		
		Integer[] values=new Integer[] {10,20,30,40,11,10,11,12,13};
		stream=Arrays.stream(values);
		
		//map
		System.out.println("Square of"+Arrays.toString(values)+"is as follow:");
		stream=stream.map(m->m*m);
		stream.forEach(System.out::println);
		
		System.out.println("First 2 elements are:");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		
		System.out.println("elements except first 4:");
		Arrays.stream(values).skip(4).forEach(System.out::println);
		
		System.out.println("distinct elements are:");
		Arrays.stream(values).distinct ().forEach(System.out::println);
		
		List<String> words= Arrays.asList("hello","stream","learning");
		Stream<String> stream1=words.stream();
		List<String> s1=stream1.map(str->str.toUpperCase()).collect(Collectors.toList());
		System.out.println(s1);
		

	}

}
