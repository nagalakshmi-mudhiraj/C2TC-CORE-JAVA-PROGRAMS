package com.tnsif.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

//Demo on multiple catch block
public class Division {
	
	public static void divide()
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		try
		{
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			
			System.out.println("Result is="+c);
		}
		catch(InputMismatchException e)//specific or child class
		{
			System.out.println("Invalid Input. Please enter integers only");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception caught ..."+e.getMessage());
		}
		catch (Exception e)//generic or parent
		{
			System.out.println(" exception caught ..."+e.getMessage());
		}
		finally
		{
			System.out.println("I will execute. Do whatever you want...");
		}
	}

}
