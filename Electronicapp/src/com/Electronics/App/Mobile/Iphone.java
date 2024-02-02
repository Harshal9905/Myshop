package com.Electronics.App.Mobile;

import java.util.Scanner;

import com.Electronic.App.Tv.Sony;

public class Iphone {
	public  static void get1Feature(){
		System.out.println("48MP + 12MP | 12MP Front Camera");
	}
	public  static void get2Feature(){
		System.out.println("12MP + 12MP | 12MP Front Camera");
	}
	public  static void get3Feature(){
		System.out.println("12MP + 12MP | 12MP Front Camera");
	}
	public static void getModule(){
		System.out.println("Select the option");
		System.out.println("1.Iphone15");
		System.out.println("2.Iphone14");
		System.out.println("3.Iphone13");
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
