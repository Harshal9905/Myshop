package com.count;

import java.util.Scanner;

public class VowelsCons {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("String");
		String w=sc.next();
		Operation op = new Operation();
		System.out.println(op.getCount(w));
	}
}
