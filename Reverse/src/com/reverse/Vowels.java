package com.reverse;

public class Vowels {
	
	public int getCountOfVwels(String w) {
		int count = 0;
		for(int i = 0; i<w.length();i++) {
			if(w.charAt(i) == 'a' || w.charAt(i)=='e'||w.charAt(i) == 'i' || w.charAt(i)=='o'||w.charAt(i) == 'u' ||w.charAt(i) == 'A' || w.charAt(i)=='E'||w.charAt(i) == 'I' || w.charAt(i)=='O'||w.charAt(i) == 'U') {
				count++;
			}
		}
		
		return count;
	}
}