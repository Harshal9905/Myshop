package atharv;

import java.util.Scanner;

public class Function {
	public void add(int a, int b){
		int c = a+b;
		System.out.println("Addition is "+c);
	}
	public static void main(String[] args) {
		Function fu = new Function();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st No.");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd No.");
		int num2 = sc.nextInt();
		fu.add(num1, num2);
	}
}
