package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ExampleList {

	//ArrayList Example
	public List check() {
		List list = new ArrayList();
		list.add(1);
		list.add("sivsadsiasa");
		list.add('A');
		list.add('A');
		return list;
	
	}
	
	//Linked List Example
	public void linkedlist() {
		
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("sivas");
		ll.add("prakash");
		ll.add("kishore");
		ll.add("Deepthi");
		
		ll.forEach(l -> System.out.println(l));
	}
	
	//Vector Example
	public Vector vectorList() {
		Vector<Integer> v =  new Vector<Integer>();
		v.add(2);
		v.add(4);
		return v;
	}
	
	//Stack Example
	public Stack stackList() {
		Stack<Integer> st = new Stack<>();
		st.add(1);
		st.add(2);
		st.add(3);
		return st;
	}
	
	public static void main(String args[]) {
		
		ExampleList El = new ExampleList();
		
		System.out.println("=========ArrayList values ========");
		
		El.check().forEach(a->System.out.println(a));
		/*
		 * if(El.check().contains('A')) { //System.out.println("Yes it is there"); }
		 * 
		 * El.check().forEach((a ->System.out.println("differnet values ---"+a)));
		 */
		System.out.println("===========Linked List================");
		El.linkedlist();
		
		System.out.println("=========Vector==============");
		Vector vv =El.vectorList();
		vv.add(3);
		vv.forEach(v -> System.out.println(v));
		
		System.out.println("=========stack values================");
		El.stackList().forEach(s ->System.out.println(s));
	}
}
