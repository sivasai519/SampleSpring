package com.oopsconcepts;

public class ExampleAbstract extends Example{

	@Override
	public String addition(String name) {
		System.out.println(name);
		return name;
		
	}
	
	public int multi(int i,int j) {
		System.out.println(i+" ---- "+j);
		return i*j;
		
	}
	public int sub(int i, int j) {
		System.out.println(i+"---"+j);
		return i-j;
		
	}

	public static void main(String args[]) {
		
		ExampleAbstract ex= new ExampleAbstract();
		ex.addition("Welcome to abstration");
		System.out.println(ex.multi(2,4));
		System.out.println(ex.sub(4, 2));
	}
	
}
