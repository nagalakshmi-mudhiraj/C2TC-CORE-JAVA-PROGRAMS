package com.tnsif.sorting;

import java.util.Arrays;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee[]=new Employee[3];
		
		
		employee[0]=new Employee();
		employee[0].setName("Kabir Singh");
		employee[0].setAge(43);
		
		employee[1]=new Employee();
		employee[1].setName("Ruhi");
		employee[1].setAge(25);
		
		employee[2]=new Employee();
		employee[2].setName("Krishna");
		employee[2].setAge(33);
		
		
		System.out.println("Order of employee before sortings=");
		
		for(int i=0;i<employee.length;i++)
			
		{
			
			System.out.println(employee[i].getName()+""+employee[i].getAge());
		}
		System.out.println("Order of employee after sorting on the basis of age=");
		Arrays.sort(employee, new AgeComparator());
		for(int i=0;i<employee.length;i++)
		{
			System.out.println(employee[i].getName()+""+employee[i].getAge());
		}
		System.out.println("Order of employee after sorting on the basis of name=");
		Arrays.sort(employee, new NameComparator());
		
		
			}
}

