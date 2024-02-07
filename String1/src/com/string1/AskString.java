package com.string1;

import java.util.Scanner;

public class AskString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String g = sc.next();
		System.out.println("entr leeter");
		String s = sc.next();
		char k= s.charAt(0);
		
		A ac = new A();
		ac.countString(g,k);
		
	}
}
