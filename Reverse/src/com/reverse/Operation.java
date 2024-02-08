package com.reverse;

public class Operation {
	  public static String getreverse(String w) {
		  String s ="";
		for(int i = w.length()-1;i>=0;i--) {
			s += w.charAt(i);
			
		}
		  return s;}
	  
}

