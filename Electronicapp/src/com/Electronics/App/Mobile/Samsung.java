package com.Electronics.App.Mobile;

import java.util.Scanner;

import com.Electronic.App.Tv.Sony;

public class Samsung {
	public  static void get3Feature(){
		System.out.println("4 GB RAM | 64 GB ROM | Expandable Upto 1 TB");
	}
	public  static void get2Feature(){
		System.out.println("8 GB RAM | 256 GB ROM");
	}
	public  static void get1Feature(){
		System.out.println("4 GB RAM | 64 GB ROM | Expandable Upto 1 TB");
	}
	public static void getModule(){
		System.out.println("Select the option");
		System.out.println("1.F04");
		System.out.println("2.S21 FE 5G");
		System.out.println("3.F13");
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
