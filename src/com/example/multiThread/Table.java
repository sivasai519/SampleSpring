package com.example.multiThread;

public class Table {
	
	public /*synchronized*/ void printTable(int n) {
		for(int i=1;i<=12;i++)
		{
			System.out.println(+n+"*"+i+"="+(n*i));
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		//System.out.println("one thread is completed");
	}

}
