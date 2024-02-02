package com.MyShop;

import java.util.Scanner;

import MobileBrand.*;





public class Mobiles  {
	public void mobileInfo(){
		System.out.println("Select the option");
		System.out.println("1.Samsung");
		System.out.println("2.Iphone");
		//System.out.println("3.Oneplus");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		switch(j){
		case 1:{
			Samsung sm = new Samsung();
			sm.getProductid();
			sm.getName();
			sm.getPrice();
			sm.getCatagory();
			break;
		}case 2:{
			Iphone im = new Iphone();
			im.getProductid();
			im.getName();
			im.getPrice();
			im.getCatagory();
			break;
		}
		}
	}
	
	

}
