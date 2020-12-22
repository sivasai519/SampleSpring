package com.example;

public class SingletonExample {
	
	//Step 1
	private static SingletonExample singletonExample = new SingletonExample();
	
	//Step 2
	private SingletonExample() {
		
	}

	//Step 3
	public static SingletonExample getInstance() {
		return singletonExample;
	}
	
	public void check() {
		System.out.println("Hello this is singleton class");
	}
	
}
