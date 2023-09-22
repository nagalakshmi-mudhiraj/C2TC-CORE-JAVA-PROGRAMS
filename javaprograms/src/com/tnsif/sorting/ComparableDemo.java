package com.tnsif.sorting;

import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable<Emp>
{
	
	int EmpId;
	String Ename;
	double sal;
	static int i;
	
	
	public Emp() {
		EmpId=i++;
		Ename="Unknown";
		sal=0.0;
	}
		
		public Emp(int empId, String ename, double sal) {
			EmpId=i++;
			Ename=ename;
			sal=sal;
			
		}
	//sorting on the basis of salary

	@Override
	public int compareTo(Emp o) {
		
		if(this.sal==((Emp)o).sal)
		// TODO Auto-generated method stub
		return 0;
		
		else if(this.sal>((Emp)o).sal)
			return 1;
		
		else
			return -1;
		
	}


	@Override
	public String toString() {
		return "Emp [EmpId=" + EmpId + ", Ename=" + Ename + ", sal=" + sal + "]";
	}
	

}


    public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Emp> emps=new ArrayList<Emp>();
		emps.add(new Emp(1,"Harry",2504000.0));
		emps.add(new Emp(2,"Marry",18000.0));
		emps.add(new Emp(3,"Karry",12000.0));
		emps.add(new Emp(4,"Tarry",14000.0));
		
		//BEFORE SORTING
		System.out.println(emps);
		
		Collections.sort(emps);
		
		//AFTER SORTING
		System.out.println(emps);
		
		

	}

}
