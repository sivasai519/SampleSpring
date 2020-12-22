package com.example.threadRunnable;

public class ExampleRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("running from implementation");
		System.out.println(check());
		
	}
	
	public String check() {
		return "This is another method for runnable interface";
	}
	
	public static void main(String args[]) {
		
		ExampleRunnable er = new ExampleRunnable();
		Thread t = new Thread(er);
		
		t.start();
		System.out.println(er.check());
	}

}
