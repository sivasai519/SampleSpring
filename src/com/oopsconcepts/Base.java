package com.oopsconcepts;

public class Base {
	
	final String name ="poly";
	
	final static String name1 = "poly";
	
	public void check() {
		System.out.println("check method");
	}
	
	public void run() {
		System.out.println("This is base class method");
	}
	public int addition(int i, int j) {
		
		System.out.println("this is super class addition method");
		return i+j;
	}
	
	public final void defination() {
		
	}

}
