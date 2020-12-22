package com.oopsconcepts;


public class Derived extends Base{

	
	public void run() {
		System.out.println("This is Child class ");
	}
	
	public int addition(int i,String j) {
		
		System.out.println("this child class addition method");
		return j.length()+i;
	}
	
	public static void binding() {
		System.out.println("this static binding method with static ");
	}
	
	
	public static void main(String args[]) {
		Base b = new Derived();//overridding //CompileTimePolymorphism //Dynamic Binding	
		b.run();
		
		b.check();
		System.out.println("output of additon method --->"+b.addition(5, 2));
		
		//Overloading //RuntimePolyMorphism //static Binding
		Derived d = new Derived();
		System.out.println("output of addition method with different arguments"+ d.addition(5, "sivasai"));
		binding();
		/*
		 * Base base = new Base(); base.run();
		 * 
		 * Derived d = new Derived(); System.out.println("======"); d.check();d.run();
		 */
	}
}
