package com.kbplibrary;

import java.util.ArrayList;
import java.util.Scanner;

import com.kbplibrary.Connection.MyDatabase;

public class Operation {
	static ArrayList<Bookvar> list = new ArrayList<Bookvar>(); 
	public static void getDetails() {
		MultipleBook mb = new MultipleBook();
		Scanner sc = new Scanner(System.in);
		int ch = 1;
		while(ch==1) {
		Bookvar bv = new Bookvar();
		System.out.println("Enter Book Id: ");
		int bkid = sc.nextInt();
		bv.setBookid(bkid);
		System.out.println("Enter Book Name: ");
		String bkname = sc.next();
		bv.setBookname(bkname);
		System.out.println("Enter Author Name: ");
		String bkAuthor = sc.next();
		bv.setBookauthor(bkAuthor);
		mb.addBook(bv);
		
		System.out.println("press 1: for add more books\npress 2: for save ");
		ch = sc.nextInt();
		if(ch==2) {
			mb.saveData();
			
		}
		}
		
	}
}
