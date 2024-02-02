package com.Electronic.App;

import java.util.Scanner;

import com.Electronic.App.Tv.LG;
import com.Electronic.App.Tv.Panasonic;
import com.Electronic.App.Tv.Sony;

public class Tvbrand {
	public static void getTV(){
		System.out.println("Select the option");
		System.out.println("1.Sony");
		System.out.println("2.LG");
		System.out.println("3.Panasonic");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		switch(j){
		case 1:{
			Sony.getModule();
			break;
		}case 2:{
			LG.getModule();
			break;
		}case 3:{
			Panasonic.getModule();
			break;
		}
		}
	}
}
