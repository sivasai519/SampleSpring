package com.interfaces;

public class SampleExample implements Sample {

	@Override
	public void channel(String name) {
		System.out.println("Channel");		
	}

	@Override
	public void channel2(String name) {
		
		int i = Integer.parseInt(name);
		System.out.println(i);
		System.out.println("Channel 2");
		
	}

	@Override
	public void channel3(String name) {
		System.out.println("Channel 3");
		
	}

	@Override
	public void channel4(String name) {
		System.out.println("Channel 4");
		
	}

	@Override
	public void channel5(String name) {
		System.out.println("Channel 5");
		
	}

	@Override
	public void channel6(String name) {
		System.out.println("Channel 6");
		System.out.println("Channel 6-1");
		
		String n = "string";
		char ch = 's';
		System.out.println("Channel 6-2");
		System.out.println("Channel 6-3");
		System.out.println("Channel 6-4");
	}
	
	
	public static void main(String args[]) {
		
		Sample sc = new SampleExample();
		
		sc.channel("1");
		sc.channel2("1");
		sc.channel3("1");
		sc.channel4("1");
		sc.channel5("1");
		sc.channel6("1");
		sc.channel7("1");
		
		}

}
