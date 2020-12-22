package com.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ExampleComparable {
	
	public static void main(String args[]){  
		
		  ArrayList<Student> al=new ArrayList<Student>(); 
		  al.add(new Student(101,"Vijay",23)); 
		  al.add(new Student(106,"Ajay",27)); 
		  al.add(new Student(105,"Jai",21));
		  al.add(new Student(103,"siva",22));
		  
		  
		  Collections.sort(al);
		  System.out.println("ID "+ " Name"+" age"); 
		  for(Student st:al){
			  System.out.println(st.rollno+" "+st.name+" "+st.age); 
			  }
		 
		
		/*
		 * List<Integer> ll = new ArrayList<Integer>();
		 * 
		 * ll.add(1); ll.add(6); ll.add(3); ll.add(2);
		 * 
		 * ll.forEach(a ->System.out.println(a));
		 * 
		 * System.out.println("After sort method"); Collections.sort(ll);
		 * 
		 * ll.forEach(a ->System.out.println(a));
		 */
		}  

}
