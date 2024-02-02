package com.MyShop;

import java.util.Scanner;

import TvBrand.*;




public class Tv{
	public void tvInfo(){
		System.out.println("Select the option");
		System.out.println("1.Panasonic");
		System.out.println("2.Sony");
		//System.out.println("3.Oneplus");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		switch(j){
		case 1:{
			Panasonic sm = new Panasonic();
			sm.getProductid();
			sm.getName();
			sm.getPrice();
			sm.getCatagory();
			break;
		}case 2:{
			Sony im = new Sony();
			im.getProductid();
			im.getName();
			im.getPrice();
			im.getCatagory();
			break;
		}
		}
	}
	

}
