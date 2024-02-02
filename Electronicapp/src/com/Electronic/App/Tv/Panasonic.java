package com.Electronic.App.Tv;

import java.util.Scanner;

public class Panasonic {
	
	public  static void get3Feature(){
		System.out.println("108 cm (43 inches) Full HD Smart LED TV TH-43MS550DX (Black, Vivid Digital Pro, Dolby Digital, Audio Booster+)");
	}
	public  static void get2Feature(){
		System.out.println("108 cm (43 inches) 4K Ultra HD Smart LED Google TV TH-43MX740DX (Black, 4K Color Engine, HDR 10, Dolby Digital, Chromecast Built-In)");
	}
	public  static void get1Feature(){
		System.out.println("108 cm (43 inches) 4K Ultra HD Smart LED Google TV TH-43MX660DX (Black, 4K Studio Color Engine, HDR 10+, Dolby Digital, Chromecast Built-In)");
	}
	public static void getModule(){
		System.out.println("Select the option");
		System.out.println("1.TH-43MX660DX");
		System.out.println("2.TH-43MX740DX");
		System.out.println("3.TH-43MS550DX");
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
