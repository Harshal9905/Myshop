package com.AnimalFeast;

import java.util.Scanner;

public class Entry {
	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("ENter Your Name:");
		String an = sc.nextLine();
		
		System.out.println("Enter Dish Name:");
		String di = sc.nextLine();
		Operation.feast(an.trim( ), di.trim( ));
		an.trim();
		System.out.println(an.length());
	}
	}
}
