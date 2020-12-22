package com.collections;

import java.util.List;

public class Deepthi {
	
	public static void main(String args[]) {
		
		String name = "helloe vlaues";
		
		if(name.contains("vl")) {
			
		}
		
		ExampleList el = new ExampleList();
		
		List ll = el.check();
		
		el.check().forEach(a->System.out.println("not assiging values "+a));
		
		ll.forEach(a -> System.out.println("valus from Example List --"+ a));
	}

}
