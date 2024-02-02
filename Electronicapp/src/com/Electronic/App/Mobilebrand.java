package com.Electronic.App;

import java.util.Scanner;

import com.Electronics.App.Mobile.Samsung;
import com.Electronics.App.Mobile.Iphone;
import com.Electronics.App.Mobile.Oneplus;

public class Mobilebrand {
	public static void getMobile(){
		System.out.println("Select the option");
		System.out.println("1.Samsung");
		System.out.println("2.Iphone");
		System.out.println("3.Oneplus");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		switch(j){
		case 1:{
			Samsung.getModule();
			break;
		}case 2:{
			Iphone.getModule();
			break;
		}case 3:{
			Oneplus.getModule();
			break;
		}
		}
	}
}
