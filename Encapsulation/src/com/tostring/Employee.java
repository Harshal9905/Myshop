package com.tostring;

public class Employee {
	int empID;
	String name;
	String designation;
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", designation="
				+ designation + "]";
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp);
	}
}
