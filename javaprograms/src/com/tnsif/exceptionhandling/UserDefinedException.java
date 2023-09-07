package com.tnsif.exceptionhandling;

import java.util.Scanner;
public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int age;
		System.out.println("Enter the age:");
		
		Scanner sc=new Scanner(System.in);
		
        age=sc.nextInt();
        
        //CantVote
        if(age<18)
        {// pass the object of exception class to the JVM // throws
        	throw new CantVote("You cannot vote as you are not eligible...");
        }
        else
        {
        	System.out.println("You can happily vote...");
        }
	}

}
class CantVote extends RuntimeException
{
	CantVote(String msg)
	{
		super (msg);
}
}