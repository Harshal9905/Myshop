package com.kbplibrary;

import java.util.Scanner;

import com.kbplibrary.borrower.BorrowerOp;

public class Home {
	 static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("press 1 for add book\npress 2 for add borower");
		int ch= sc.nextInt();
		switch(ch) {
		case 1:
			Operation.getDetails();
			break;
		case 2:
			BorrowerOp.getBorrDetails();
			break;
		}
		
	}

}
