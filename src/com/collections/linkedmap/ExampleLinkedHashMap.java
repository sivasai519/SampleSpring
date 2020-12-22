package com.collections.linkedmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExampleLinkedHashMap {
	
	
	  public LinkedHashMap< Integer, String> check(){ 
		  
		  LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
	  
		  linkedHashMap.put(1, "linked hashmap"); 
		  linkedHashMap.put(2, "map");
		  linkedHashMap.put(3, "map2");
	  
	  return linkedHashMap; }
	 
	
	public static void main(String args[]) {
		
		ExampleLinkedHashMap ex = new ExampleLinkedHashMap();
		
		LinkedHashMap<Integer, String> linked =ex.check();
		
		if(linked.containsKey(3)) {
			
			System.out.println("key 3 is there in linked hashmap");
			linked.remove(3);
			//linked.clear();
			System.out.println(linked.hashCode());
		}
		
		
		/*
		 * LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		 * 
		 * linkedHashMap.put(1, "linked hashmap"); linkedHashMap.put(2, "map");
		 * linkedHashMap.put(3, "map2");
		 */
		
		
		for (Map.Entry m : linked.entrySet()) {
			System.out.println(m.getKey()+" -- Value --"+m.getValue());
		}
	}

}
