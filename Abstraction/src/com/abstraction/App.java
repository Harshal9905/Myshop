package com.abstraction;

public class App {
	public static void main(String[] args) {
		CSEDepartment cg = new CSEDepartment();
		cg.getClasses();
		System.out.println(cg.getDiv());
		System.out.println(cg.getTeacher());
		Entc cg2 = new Entc();
		cg2.getClasses();
		System.out.println(cg2.getDiv());
		System.out.println(cg2.getTeacher());
	}
}
