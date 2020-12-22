package com.example;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DuplicateCheck {
	
	public static void main(String args[]) {
		
		DuplicateCheck dc = new DuplicateCheck();
		
		//dc.duplicateCheckWithStreams();
		dc.duplicateCheckwithMap();
	}
	
	public void duplicateCheckwithMap() {
		//String value = "This is sivasai kumar";
				Scanner sc = new Scanner(System.in); 
				System.out.println("Enter the String value");
				String value = sc.nextLine();
				
				Map<Character, Integer> output = new LinkedHashMap<Character,Integer>();
				
				for(int i=0;i<value.length();i++) {
					char ch = value.charAt(i);
									
					if(output.containsKey(ch)){
					
						output.put(ch, output.get(ch)+1);
						
						//output.compute(ch, (k,v)->(v ==null)?1:v+1);
					}else {
						output.put(ch,1);
				}
				}
			
				System.out.println(output);
	}
	
	public void duplicateCheckWithStreams() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		
		String input = sc.nextLine();
		
		IntStream intStream = input.chars();

        // Step 2
        Stream<Character> charsStream = intStream.mapToObj(ch -> (char) ch);

        // Step 3
        Map<Character, Long> output = charsStream.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        System.out.println(output);
	}

}
