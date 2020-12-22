package com.interfaces;

public interface Sample {

	public void channel(String name);
	
	public void channel2(String name);
	
	public void channel3(String name);
	
	public void channel4(String name);
	
	public void channel5(String name);
	
	public void channel6(String name);
	
	default void channel7(String name) {
		
		System.out.println("This is default method");
	}
}
