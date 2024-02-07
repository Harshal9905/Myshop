package com.IntToString;


import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		int a=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String st = sc.next();
		
			try {
		a = Integer.parseInt(st);
			}catch(Exception e) {
				System.out.println("Enter no. ");
			}
finally {
				
			}
		System.out.println(a);
	}
		
	}

