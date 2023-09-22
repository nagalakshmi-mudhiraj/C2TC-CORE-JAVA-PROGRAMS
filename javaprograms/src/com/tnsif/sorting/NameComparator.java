package com.tnsif.sorting;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		String emp1Name=((Employee)emp1).getName();
		String emp2Name=((Employee)emp2).getName();
		
		
		return emp1Name.compareTo(emp2Name);
	}

	

	}


