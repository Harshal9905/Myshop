package com.reverse;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("String");
		String w=sc.next();
		System.out.println(Operation.getreverse(w));
		Vowels vw = new Vowels();
		System.out.println(vw.getCountOfVwels(w));
		
	}

}
