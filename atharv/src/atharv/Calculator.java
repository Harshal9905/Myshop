package atharv;

public class Calculator {
	int a= 10,b = 5;
	public void getAddition(){
		
		int c = a+b;
		System.out.println(c);
	}
	public void getSubtraction(){
		int c = a-b;
		System.out.println(c);
		Calculator obj = new Calculator();// local
		obj.getAddition();
	}
	public static void main(String[] args){
		
		Calculator obj = new Calculator();
		obj.getAddition();
		obj.getSubtraction();
	} 
}
