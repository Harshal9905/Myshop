package com.palindrome;

import java.util.Scanner;

public class Palindrome {
	public boolean checkPalindrome(String w) {
		int n = w.length();
		
		for(int i =0; i<w.length()/2;i++) {
			
				if (w.charAt(i)==w.charAt(n-1-i)) {
					//System.out.println(i);
				    
					return true;
				}else {
					
					break;
				}
			}
		
		return false;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("String");
		String w=sc.next();
		Palindrome pl = new Palindrome();
		System.out.println(pl.checkPalindrome(w.toLowerCase()));
	}
}
