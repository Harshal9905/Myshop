package com.vehicle;

import java.util.Scanner;

public class Face {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while(b){
		System.out.println("Pess 1: car\nPress 2: Motorcycle\nPress 3:Exit");
		int ch = sc.nextInt();
		switch(ch){
		case 1:
			Car c = new Car();
			c.model();
			c.year();
			break;
		case 2:
			Motorcycle m = new Motorcycle();
			m.model();
			m.year();
			break;
		case 3:
			b=false;
			break;
		default:
			System.out.println("Invalid choice");
			b = false;
			break;
		}
		}
		
	}
}
