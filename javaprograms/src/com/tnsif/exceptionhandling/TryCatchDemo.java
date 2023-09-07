package com.tnsif.exceptionhandling;

public class TryCatchDemo {
	static void divide (int x,int y)
	{
		System.out.println("I am in divide method");
		int z;
		try
		{
			System.out.println("I am try block");
			z=x/y;
			System.out.println("Result is="+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("I am catch block...!!!"+e.getMessage());
			
		}
	
		finally
		{
			System.out.println("I am finally block");
		}
		}
}


