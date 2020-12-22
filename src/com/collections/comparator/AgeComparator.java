package com.collections.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		
		if(arg0.age==arg1.age) {
			return 0;
		}else {
			if(arg0.age>arg1.age) {
				return 1;
			}else {
				return -1;
			}
		}
		
	}

}
