package com.tnsif.thread;

	public class ChildThread  extends Thread {

		
		public void run()
		{
			for (int i=0;i<10;i++)
			{
				System.out.println("I am Child Thread!!!");
			}
			
		}
	}

