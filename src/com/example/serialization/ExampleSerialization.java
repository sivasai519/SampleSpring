package com.example.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ExampleSerialization {

	
	
	
	
	/*
	 * public static void main(String args[]){ try{ Student s1 =new
	 * Student(211,"ravi"); Student s2 = new Student(222,"serialization");
	 * 
	 * FileOutputStream fout=new
	 * FileOutputStream("C:/Users/91970/Documents/sivasai.txt");
	 * 
	 * ObjectOutputStream out=new ObjectOutputStream(fout);
	 * 
	 * out.writeObject(s1); out.writeObject(s2);
	 * 
	 * out.flush();
	 * 
	 * out.close(); System.out.println("success");
	 * 
	 * }catch(Exception e) { System.out.println(e); } }
	 */
	 
	 
	 
	 
	
	
	
	
	
	
	  public static void main(String args[]){ try{
	  
	  ObjectInputStream in=new ObjectInputStream(new
	  FileInputStream("C:/Users/91970/Documents/sivasai.txt"));
	  
	  Student s=(Student)in.readObject();
	  
	  // List<Student> ll = (List<Student>) in.readObject();
	  
	  // ll.forEach(a->System.out.println(a.id+" "+a.name));
	  //System.out.println(s.toString()); 
	  System.out.println(s.id+" "+s.name);
	  
	  in.close(); }catch(Exception e){ System.out.println(e); } }
	 
	 
	 
	   
}
