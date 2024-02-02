package atharv;

public class Static {
	
	//Static block
	static {
		System.out.println("inside static");
	}
	
	//Main block
	public static void main(String[] args){
		System.out.println("inside main");
	//Here first static block will exucate then main always
	}
}
