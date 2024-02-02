package com.MyShop;

import java.util.Scanner;

import AcBrand.*;



public class Ac{

	public void acInfo(){
		System.out.println("Select the option");
		System.out.println("1.LG");
		System.out.println("2.Whirpool");
		//System.out.println("3.Oneplus");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		switch(j){
		case 1:{
			LG sm = new LG();
			sm.getProductid();
			sm.getName();
			sm.getPrice();
			sm.getCatagory();
			break;
		}case 2:{
			Whirpool im = new Whirpool();
			im.getProductid();
			im.getName();
			im.getPrice();
			im.getCatagory();
			break;
		}
		}
	} 

}
