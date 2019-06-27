package com.atmecs.Concepts;


	class X implements Runnable
	{
		public void show()
		{
			for(int i=0;i<5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(5000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
			}
			}
		}
		public void run()
		{
			show();
		}
	}
	class Y implements Runnable
	{
		public void show() 
		{
			for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {
			Thread.sleep(5000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		public void run()
		{
			show();
		}
	}

	public class MultiThreadingUsingRunnable {
		
		public static void main(String[] args) {
			X obj=new X();
			Y obj1=new Y();
			
			Thread t1=new Thread(obj);
			Thread t2=new Thread(obj1);
			
		t1.start();
		try {
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		t2.start();

		}

}
