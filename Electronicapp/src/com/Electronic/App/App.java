package com.Electronic.App;

import java.util.Scanner;



public class App {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	System.out.println(name+ " Electronics");
	System.out.println("Select the option");
	System.out.println("1.Tv");
	System.out.println("2.mobile");
	System.out.println("3.laptop");
	int i = sc.nextInt();
	
	switch(i){
	case 1:{
		Tvbrand.getTV();
		break;
	}case 2:{
		Mobilebrand.getMobile();
		break;
	}case 3:{
		
		break;
	}
	}
	sc.close();
}
}
