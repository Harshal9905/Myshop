package com.demo;

import atharv.A;// import packagename.classname or *(include all class)
public class Democlass {
	public static void main(String[] args){
		System.out.println("inside main");
		A obj = new A();
		obj.m4();
		A.m3();
	}

}
