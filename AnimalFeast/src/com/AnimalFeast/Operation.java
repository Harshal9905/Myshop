package com.AnimalFeast;

import java.util.Iterator;

public class Operation {
	public static boolean feast(String an, String di) {
		int n = an.length();
		int m = di.length();
		if(an.charAt(0)==di.charAt(0)) {
			if(an.charAt(n-1)==di.charAt(m-1)) {
				System.out.println("true");
				
				
				return true;
				
			}
			
		}
		return false;
		
	}

}
