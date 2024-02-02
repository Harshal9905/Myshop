package com.Electronic.App.Tv;

import java.util.Scanner;

public class LG {
	
	public  static void get3Feature(){
		System.out.println("Transcending LED technology, every pixel in the LG OLED TV enables you to dive into an illumination of unmatched color. Each OLED self-lighting pixel turns on and off on its");
	}
	public  static void get2Feature(){
		System.out.println("Lg Electronics 65sj8500 65-inch 4k Ultra Hd Smart Led Tv 2017 Model, Brand Name = Lg, Item Weight = 62.8 Pounds, Product Dimensions = 57.2 X 12.3 X 35 Inches, Item Model Number ...");
	}
	public  static void get1Feature(){
		System.out.println("HD Ready (Resolution: 1366 x768) Connectivity - Input: 2*HDMI Installation: For requesting installation/wall mounting/demo of this product once delivered, please directly call ...");
	}
	public static void getModule(){
		System.out.println("Select the option");
		System.out.println("1.32LJ525D");
		System.out.println("2.65SJ8500");
		System.out.println("3.C9");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		switch(j){
		case 1:{
			Panasonic.get1Feature();
			break;
		}case 2:{
			Panasonic.get2Feature();
			break;
			
		}case 3:{
			Panasonic.get3Feature();
			break;
		}
		}
		sc.close();
	}
}
