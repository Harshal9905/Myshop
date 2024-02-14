package com.Upper;

import java.util.Scanner;

public class Upper {
	public String altUpper(String w) {
		String str = "";
		for(int i =0; i<w.length();i++) {
			if(i%2==0) {
				str =str + Character.toString(w.charAt(i)).toUpperCase();
				
			}else if (i==0) {
				str =str + Character.toString(w.charAt(i)).toUpperCase();
			}else {
				str = str + Character.toString(w.charAt(i)).toLowerCase();
			}
			
		}
		return str;
		
	} 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("String");
		String w=sc.next();
		Upper up = new Upper();
		System.out.println(up.altUpper(w));
	}
}
