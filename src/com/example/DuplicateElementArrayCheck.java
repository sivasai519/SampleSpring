package com.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateElementArrayCheck {

	
public static void main(String args[]) {
	
	int[] arrayValue = {1,1,1,2,3,3,4,5,5};
	
	//String [] stringArray = {"sivai","stirngvalue","check","check"};
	
	Set<Integer> set = new HashSet<>();
	
	Set<Integer> duplicateElements = Arrays.stream(arrayValue)
									.filter(i ->!set.add(i))
									.boxed()
									.collect(Collectors.toSet());
	
	/*
	 * Set<String> set1 = new HashSet<>();
	 * 
	 * Set<Integer> duplicateElements1 = Arrays.stream(stringArray) .filter(i
	 * ->!set1.add(i)) .boxed() .collect(Collectors.toSet());
	 * System.out.println(duplicateElements);
	 */
	System.out.println(duplicateElements);
}
}
