package com.staticNonstatic;

public class Name {
	int a =10;
	static int w= 20;
	public static void m1(){
		//System.out.println(a); a variable is non static 
		System.out.println(w);
		System.out.println("Static");
	}
	public void m2(){
		System.out.println(a);
		System.out.println(w);
		System.out.println("Non Static");
	}
	public static void main(String[] args) {
		Name.m1();
		Name ns = new Name();
		ns.m2();
		Name.m1();
	}
}
