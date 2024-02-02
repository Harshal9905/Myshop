package com.getset;



public class Employee {


	private int empID;
	private String name;
	private String designation;
	public void setEmpId(int empID){
		this.empID=empID;
	}
	public int getEmpId(){
		return empID;
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getDesignation());
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

