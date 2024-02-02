package atharv;

public class StaticNonStatic {
	static int a = 10;
	public void m1(){
		System.out.println(a);
	}
	public static void main(String[] args){
		
		StaticNonStatic obj = new StaticNonStatic();
		obj.m1();
	}
}
