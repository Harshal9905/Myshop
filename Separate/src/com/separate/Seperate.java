package com.separate;

import java.util.Scanner;

public class Seperate {
	public String getSeperate(String w) {
		String str = "";
		String str2 = "";
		for(int i =0; i<w.length();i++) {
			if(i%2==0) {
				str =str + Character.toString(w.charAt(i)).toLowerCase();
				
			}else if (i==0) {
				str =str + Character.toString(w.charAt(i)).toLowerCase();
			}else {
				str2 = str2 + Character.toString(w.charAt(i)).toUpperCase();
			}
			
		}
		return "str: "+ str+"\nstr2: "+str2;
		
	}
	public static void main(String[] args) {
		while(true) {
			Scanner sc= new Scanner(System.in);
			System.out.println("String");
			String w=sc.next();
			Seperate sp = new Seperate();
			System.out.println(sp.getSeperate(w));
		}
	}
	//banana----> true
	//amazon---> true
}
