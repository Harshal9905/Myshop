package com.Electronic.App.Tv;

import java.util.Scanner;

public class Sony {
	
	public  static void get3Feature(){
		System.out.println("X95L | BRAVIA XR | Mini LED | 4K Ultra HD | High Dynamic Range (HDR) | Smart TV (Google TV)");
	}
	public  static void get2Feature(){
		System.out.println("X90L/X91BL | BRAVIA XR | Full Array LED | 4K Ultra HD | High Dynamic Range (HDR) | Smart TV (Google TV)");
	}
	public  static void get1Feature(){
		System.out.println("A95L | BRAVIA XR | MASTER Series | OLED | 4K Ultra HD | High Dynamic Range (HDR) | Smart TV (Google TV)");
	}
	public static void getModule(){
		System.out.println("Select the option");
		System.out.println("1.A90L");
		System.out.println("2.X90L Series");
		System.out.println("3.X95L Series");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		switch(j){
		case 1:{
			Sony.get1Feature();
			break;
		}case 2:{
			Sony.get2Feature();
			break;
			
		}case 3:{
			Sony.get3Feature();
			break;
		}
		}
		sc.close();
	}
}
