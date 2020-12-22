package com.collections.linkedmap;

import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {

	
	public static void main(String args[]) {
		
		TreeMap<Integer, String> treeMap =  new TreeMap<>();
		
		treeMap.put(1, "sivasai");
		treeMap.put(5,"check");
		treeMap.put(2, "ascending order");
		
		
		/*
		 * for (Map.Entry<Integer, String> tree : treeMap.entrySet()) {
		 * 
		 * System.out.println(tree.getKey()+" Tree map ascending "+ tree.getValue()); }
		 */
		TreeMap<String,String> treeMapString = new TreeMap<String, String>();
		
		treeMapString.put("zzzz","aaaa");
		
		treeMapString.put("mmmm","pppp");
		
		treeMapString.put("aa","bbb");
		
		
		
		for (Map.Entry<String, String> tree : treeMapString.entrySet()) {
			
			System.out.println(tree.getKey()+" Tree map ascending "+ tree.getValue());
		}
		
		System.out.println(treeMapString.descendingMap());
		
		
		
		
		
		//System.out.println(treeMap.descendingMap());
		
		
	}
}
