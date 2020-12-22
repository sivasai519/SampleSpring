package com.example;

public class FibonacciExample {

	static int n1=0,n2=1,n3=0;
	public static void main(String args[]) {
		FibonacciExample fE = new FibonacciExample();
		//fE.nonRecursive();
		int count = 10;
		System.out.print(n1+" "+n2);
	recursivePrintFibonacci(count-2);
	}
	
	
	/*
	 * public void nonRecursive() { int n1=0, n2=1,count=10,n3;
	 * System.out.println("This is Non Recursive Function"); for (int
	 * i=0;i<=count;i++) { n3=n1+n2; System.out.print(" "+n3); n1=n2; n2=n3; } }
	 */
	
	  static void recursivePrintFibonacci(int count)
	  { 
		  if(count>0){
			  n3 = n1 + n2; 
			  n1= n2; 
			  n2 = n3; 
			  System.out.print(" "+n3); 
			  recursivePrintFibonacci(count-1); }
	  }
	    
}
