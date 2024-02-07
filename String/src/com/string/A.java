package com.string;

public class A {
	public static void main(String[] args) {
		String a = "Mumbai";
		String b = new String("b");
		System.out.println(a==b);
		System.out.println(a.equals());
		System.out.println(a.concat(b));
		System.out.println(a.endsWith("c"));
		System.out.println(a.charAt(3));//value
		System.out.println(a.codePointAt(3));//acii value
		System.out.println(a.codePointCount(0, 3));//Count from 0 to 3 index
		System.out.println(a.compareTo(b));//charsat compare 
		System.out.println(a.compareToIgnoreCase(b));
		String z = char.toString(a.charAt(3));
		System.out.println(b.equals(a.charAt(3)));
		
	}
}
