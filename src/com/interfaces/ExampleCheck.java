package com.interfaces;

import java.util.Scanner;

public class ExampleCheck implements Example {

	@Override
	public String find(String name) {
		
		if(name.equals("interface")) {
		
			return "find";
		}else {
			return "not find";
		}
		
	}

	public static void main(String args[]) {
		
		ExampleCheck ec = new ExampleCheck();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Value");
		
		if(ec.check(sc.nextLine())) {
		
			System.out.println("Please enter the value for find method");
			
			System.out.println(ec.find(sc.nextLine()));
		}
		
	}
}
