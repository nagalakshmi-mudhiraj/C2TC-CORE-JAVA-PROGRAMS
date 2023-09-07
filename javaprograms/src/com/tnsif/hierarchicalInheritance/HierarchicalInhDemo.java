package com.tnsif.hierarchicalInheritance;

public class HierarchicalInhDemo {
	
	public static void main(String[] args) {
		
		Person p;
		p=new Person ("Madhu",  "Mumbai");
		if (p instanceof Person)
			System.out.println("Person details="+p);
		
		p=new Employee("Nikhil","Mumbai",101,70000,"Sales");
		if (p instanceof Employee)
			System.out.println("Employee details="+p);
		
		p=new Student(" Panjak", "Pune","BE",90);
		
		if(p instanceof Student)
			System.out.println("Student details="+p);
	}

}
