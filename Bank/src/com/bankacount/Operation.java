package com.bankacount;

import java.util.Scanner;

public class Operation {
	static Scanner sc  = new Scanner(System.in);
	static Money mn = new Money();
	public static void setDetails(){
		System.out.println("Enter number");
		int b = sc.nextInt();
		mn.setAccount(b);
		System.out.println("Enter Money you Want to deposit");
		double c = sc.nextDouble();
		double de = mn.getBalance() + c;
		mn.setBalance(de);
	}public static void getDetails(){
		System.out.println("Account No. is "+ mn.getAccount());
		System.out.println("Balance is "+ mn.getBalance());
	}
	
}
