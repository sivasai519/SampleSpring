package com.oopsconcepts;

public class ExampleInheritance {
	
	public void speed(int value) {
		
		if(value >50 && value <=70) {
			System.out.println("It is the average Speed of Splendor bike");
		}else {
			if(value>70 && value <=90) {
				System.out.println("It is the average Speed of Hero bike");
			}else {
				if(value>90 && value <=100) {
					System.out.println("It is the average Speed of Yamaha bike");
				}else {
					if(value>100 ) {
						System.out.println("It is the average Speed of Sports bike");
					}
				}
			}
		}
		
	}

}
