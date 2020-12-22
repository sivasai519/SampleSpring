package com.example.thread;

public class ExampleJoinThread extends Thread{

	public void run() {
		for(int i=1;i<=5;i++)
		{  
		 try
		 {  
			Thread.sleep(500);  
		 }catch(Exception e){
			 System.out.println(e);
		 }  
			 System.out.println(i);  
	 }  
	
	}
	
	public int addition(int i,int j) {
		return i+j;
	}
	
	public static void main(String args[]) {
		ExampleJoinThread ej1 = new ExampleJoinThread();
		ExampleJoinThread ej2 = new ExampleJoinThread();
		ExampleJoinThread ej3 = new ExampleJoinThread();
		ej1.start();
		ej2.start();
		System.out.println(ej1.addition(4, 3));
		 try{  
			  ej1.join();
			  ej2.join();
			 }catch(Exception e){System.out.println(e);}  
			// ej2.start();  
			 ej3.start(); 
	}
}
