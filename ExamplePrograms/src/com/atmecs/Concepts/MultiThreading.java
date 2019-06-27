package com.atmecs.Concepts;


class A extends Thread
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
class B extends Thread
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

public class MultiThreading {
	
	public static void main(String[] args) {
		A obj=new A();
		obj.start();
		B obj1=new B();
		obj1.start();
	}
	

}
