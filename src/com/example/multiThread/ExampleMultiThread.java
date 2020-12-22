package com.example.multiThread;

public class ExampleMultiThread {
	
	public static void main(String args[])
	{
		Table obj = new Table();
		Thread1 th1 = new Thread1(obj);
		Thread2 th2 = new Thread2(obj);
		th1.start();
		th2.start();
	}

}
