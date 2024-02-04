package com.bankapp;

import java.util.Scanner;

import com.bankacount.Operation;
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while(b){
		System.out.println("Pess 1: Add Acount\nPress 2: See Account");
		int ch = sc.nextInt();
		switch(ch){
		case 1:
			Operation.setDetails();
			break;
		case 2:
			Operation.getDetails();
			break;
		default:
			System.out.println("Invalid choice");
			b = false;
			break;
		}
		}
	}
}
