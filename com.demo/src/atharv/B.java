package atharv;

public class B {
	//to call methode from same package 
	public static void main(String[] args){
		A obj = new A();
		obj.m4();
		A.m3();
	}
}
