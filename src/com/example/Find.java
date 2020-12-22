package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Find {

	public static void main(String args[]) {
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("sivasao");
		list.add("lakshmi");
		list.add("values");
		
		
		List<Integer> listInt = new ArrayList<>();
		
		listInt.add(1);
		listInt.add(3);
		listInt.add(4);
		listInt.add(5);
		listInt.add(12);
		
		/*
		 * for (Integer integer : listInt) { System.out.println(integer); }
		 */
	//conventional looping concept in java (till java 7)
		/*
		 * for(int i=0; i<list.size();i++) {
		 * System.out.println("common for loop --"+list.get(i));
		 * 
		 * }
		 */
		
		System.out.println("===========================");
		//Iterator concept 
		/*
		 * Iterator<String> iterator = list.iterator();
		 * 
		 * while (iterator.hasNext()) {
		 * System.out.println("Using Iterator ---"+iterator.next()); }
		 */

		
		/*
		 * for (String string : list) {
		 * System.out.println("for each example  ---> "+string); }
		 */
		
		List ll = new ArrayList();
		
		ll.add(1);
		ll.add("sivasai");
		ll.add("checking in list");
		ll.add(2.32);
		
		ll.forEach(a ->System.out.println("differnet values ---"+a));
		
		System.out.println("==========================");
		//Lambda expression
		//list.forEach(name->System.out.println("Using Lambda expression --"+name));
	}
	
	public String declare() {
		return new String();
	}
}
