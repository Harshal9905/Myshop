package com.count;

public class Operation {
	public String getCount(String w) {
		
		int count = 0;
		int countc = 0;
		for(int i = 0; i<w.length();i++) {
			if(Character.isAlphabetic(w.charAt(i))) {
				if(w.charAt(i) == 'a' || w.charAt(i)=='e'||w.charAt(i) == 'i' || w.charAt(i)=='o'||w.charAt(i) == 'u' ||w.charAt(i) == 'A' || w.charAt(i)=='E'||w.charAt(i) == 'I' || w.charAt(i)=='O'||w.charAt(i) == 'U') {
				count++;
				}
				
			
				else {
					countc++;
				}
			}
			
		}
		
		String vc = Integer.toString(count);
		String cc = Integer.toString(countc);
		return "vowels: "+vc+"\ncons: "+ cc;
	}
}
