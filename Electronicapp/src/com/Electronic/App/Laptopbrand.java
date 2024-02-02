package com.Electronic.App;

import java.util.Scanner;


import com.Electronics.App.Laptop.*;


public class Laptopbrand {
	public static void getLaptop(){
		System.out.println("Select the option");
		System.out.println("1.Accer");
		System.out.println("2.Preadetor");
		System.out.println("3.Lenovo");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		switch(j){
		case 1:{
			Acer.getModule();
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
