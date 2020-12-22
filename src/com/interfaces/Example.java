package com.interfaces;

public interface Example {
	
	public String find(String name);
	
	default Boolean check(String name) {
		if(name.equals("sivasai")) {
			System.out.println("you enter name is same");
			return true;
		}else {
			return false;	
		}
	}

}
