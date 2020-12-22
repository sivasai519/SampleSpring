package com.example.thread;

public class Example extends Thread {

	public void run() {
		//System.out.println("running");
		
		 for(int i=1;i<5;i++){  
		 try{
			   Thread.sleep(5000);
			   
			}catch(InterruptedException e)
		 		{
				System.out.println(e);
		 		}  
			    System.out.println(i);  
			  }  
	}
	
	public static void main(String args[]) {
		Example e = new Example();
		Example e1 = new Example();
		e.start();
		e1.start();
	}
}
