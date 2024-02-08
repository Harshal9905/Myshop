package com.banana;

import java.util.Scanner;


public class Banana {
	public static boolean getBanana(String w) {
		char c[]= w.toCharArray();
		int count =0;
		 
			if(isVowel(c[0])) {
				for(int i=0;i<w.length();i++) {
					if(i%2==0) {
						if(isVowel(c[i])) {
							count++;
							//return true;
						}else {
							//return false;
						}
					}
				}
			}else if(isVowel(c[1])) {
				for(int i=0;i<w.length();i++) {
					if(i%2!=0) {
						if(isVowel(c[i])) {
							count++;
							//return true;
						}else {
							//return false;
						}
					}
				}
			}else {
				//return false;
			}if(count == w.length()/2) {
				return true;
			}else {
				return false;	
			}
			
			
		
		
		

		
	}
	public static boolean isVowel(char c) {
		
		return c=='a'|| c=='i'||c=='e'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
		
	} 
	public static void main(String[] args) {
		while(true) {
			Scanner sc= new Scanner(System.in);
			System.out.println("String");
			String w=sc.next();
			Banana ba =new Banana();
			
			System.out.println(ba.getBanana(w));
			
		}
	}
}
