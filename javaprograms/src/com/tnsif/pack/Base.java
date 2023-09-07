package com.tnsif.pack;

public class Base {

	// TODO Auto-generated method stub
			//variables attributes properties
			int varDefault=10;
			public int varPublic=20;
			private int varPrivate=30;
			protected int varProtected=40;
			
			
			//methods behaviour
			
			void methodDefault()
			{
				System.out.println("Default access Base Class"); System.out.println(varDefault);
			}
			void methodPublic()
			{
				System.out.println("Public access Base Class"); System.out.println(varPublic);
			}
			void methodPrivate()
			{
				System.out.println("Private access Base Class"); System.out.println(varPrivate);
			}
			void methodProtected()
			{
				System.out.println("Protected access Base Class"); System.out.println(varProtected);
				
			
		}

}