package atharv;

public class Constructer {
	public Constructer(){
		System.out.println("constructor");
	}
	static {
		System.out.println("inside static");
	}
	{
		System.out.println("inside non static");
	}
	public static void main(String[] args) {
		Constructer obj = new Constructer();
		Constructer obj2 = new Constructer();
		Constructer obj3 = new Constructer();
	}
}
