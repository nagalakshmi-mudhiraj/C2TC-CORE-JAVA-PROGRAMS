package com.tnsif.thread;

//Demo on creating threads using Thread class
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildThread c=new ChildThread();
		c.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("I am Main Thread!!!");
		}

	}

}
