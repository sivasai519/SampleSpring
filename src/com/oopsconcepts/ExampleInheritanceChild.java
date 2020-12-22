package com.oopsconcepts;

import java.util.Scanner;

public class ExampleInheritanceChild extends ExampleInheritance {

	public static void main(String args[]) {
		ExampleInheritanceChild exampleInheritanceChild =  new ExampleInheritanceChild();
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the speed of bike");
		exampleInheritanceChild.speed(sc.nextInt());
	}
	
}
