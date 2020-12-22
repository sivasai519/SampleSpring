package com.collections.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class ExampleHashSet {

	
	public static void main(String args[]) {
		
		HashSet<String> hash = new HashSet<String>();
		
		hash.add("hashset");
		hash.add("set method");
		hash.add(null);
		hash.add("hashset");
		
		hash.forEach(a->System.out.println(a));
		
		System.out.println("===============Hash Set Values===========");
		
HashSet<Integer> hash1 = new HashSet<Integer>();
		
		hash1.add(1);
		hash1.add(null);
		hash1.add(5);
		hash1.add(0);
		hash1.add(1);
		hash1.forEach(a->System.out.println(a));
		
		System.out.println("==================List Values====================");
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(null);
		list.add(5);
		list.add(0);
		list.add(1);
		
		list.forEach(a-> System.out.println(a));
		
		System.out.println("===============Linked HashSet Values=====================");
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		
		linkedHashSet.add(5);
		linkedHashSet.add(3);
		linkedHashSet.add(1);
		linkedHashSet.add(9);
		linkedHashSet.add(5);
		linkedHashSet.forEach(j -> System.out.println(j));
		
		
		System.out.println("==============Tree Set=================");
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(9);
		treeSet.add(8);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(1);
		treeSet.add(9);
		
		treeSet.forEach(a -> System.out.println(a));
		System.out.println(treeSet.descendingSet());
		
		treeSet.clear();
		
		System.out.println(treeSet.descendingSet());
	}
}
