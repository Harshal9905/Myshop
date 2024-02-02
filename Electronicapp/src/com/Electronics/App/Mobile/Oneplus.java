package com.Electronics.App.Mobile;

import java.util.Scanner;

import com.Electronic.App.Tv.Sony;

public class Oneplus {
	public  static void get1Feature(){
		System.out.println("8 GB RAM | 256 GB ROM | 108MP Rear Camera");
	}
	public  static void get2Feature(){
		System.out.println("6 GB RAM | 128 GB ROM | 64MP Rear Camera | 16MP Front Camera");
	}
	public  static void get3Feature(){
		System.out.println("16 GB RAM | 256 GB ROM | 50MP Rear Camera | 16MP Front Camera");
	}
	public static void getModule(){
		System.out.println("Select the option");
		System.out.println("1.Nord CE 3 Lite 5G");
		System.out.println("2.Nord CE 2 Lite 5G");
		System.out.println("3.11R 5G");
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
