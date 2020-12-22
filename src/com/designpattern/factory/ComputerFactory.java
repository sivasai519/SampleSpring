package com.designpattern.factory;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		
		//System.out.println(type);
		//System.out.println(ram);
		//System.out.println(hdd);
		//System.out.println(cpu);
		
		if("Pc".equalsIgnoreCase(type)) return new Pc(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
		
		return null;
	}
}
