package com.tnsif.thread;

public class ThreadLifeCycleDemo  extends Thread{
	
	public void run()
	{
		System.out.println("Inside run() Thread is alive or not?"+this.isAlive());
		
		int num=0;
		while(num<4) {
			num++;
			System.out.println("num="+num);
			try {
				sleep(3000);
				System.out.println(this.isAlive());
			} catch(InterruptedException e) {
				System.err.println("Thread Interrupted...");
			}
			
			}
		}
	public static void main(String[] args) {
		Thread myThread=new ThreadLifeCycleDemo();
		System.out.println("Before Runnable static Thread is alive or not?"+myThread.isAlive());
		myThread.start();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.err.println("Thread Interrupted...");
			
		}
		System.err.println("Terminate state of Thread life cycle...Alive or not?"+myThread.isAlive());
	}
}


