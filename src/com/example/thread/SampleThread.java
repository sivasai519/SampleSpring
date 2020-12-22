package com.example.thread;

public class SampleThread extends Thread {
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("Sample thread");
	}

}
