package com.tnsif.arraylist;

import java.util.ArrayList;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> studentList=new ArrayList<Student>();
		//first element
		        Student s1=new Student(11,"Nidi",90);
				studentList.add(s1);
		//second element
				Student s2=new Student(11,"Roja",90);
				studentList.add(s2);
		//first element		
				Student s3=new Student(11,"Rani",90);
				studentList.add(s3);
		//first element		
				Student s4=new Student(11,"Siya",90);
				studentList.add(s4);
				
				System.out.println(studentList);
		
		

	}

}
