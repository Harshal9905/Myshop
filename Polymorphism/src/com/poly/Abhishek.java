package com.poly;

public class Abhishek {
	public Abhishek(){
		System.out.println("no parameer");
	}
	public Abhishek(int a){
		System.out.println("int parameer");
	}
	
	public void getOranges(){
		System.out.println("oranges by Abhishek");
	}
	public static void m1(){
		System.out.println("no parameter");
	}
	
	public void m1(String a){
		System.out.println("string parameter");
	}
	public static void main(String[] args) {
		Abhishek ab = new Abhishek(89);
		
		Abhishek.m1();//goes m1 methode has no parameter
		
		ab.m1("KBP");//goes m1 methode has string parameter
	}
}
