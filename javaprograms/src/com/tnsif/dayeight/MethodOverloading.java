package com.tnsif.dayeight;
//Demo on compile time polymorphism -ability to take multiple forms
public class MethodOverloading {
	
	static int addition(int a, int b)
	{
		return a+b;
	}

	static  float addition(float a , float b)
	{
		return a+b;
	}
	 static float addition(int a, float b)
	{
		return a+b;
	}
	static float addition(float a, int b)
	{
		return a+b;
	}
	 static String addition(String a, String b)
	{
		return a+b;
	
	}
}
