package com.example.multiThread;

public class Thread2 extends Thread {

	Table t;
	
	public Thread2(Table t) {
		super();
		this.t = t;
	}
	
	public void run() {
		t.printTable(3);
	}
}
