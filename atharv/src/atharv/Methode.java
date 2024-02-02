package atharv;

public class Methode {
	//non static
	//name of function should be action name and 2nd word should be start capital
	
	public void m1(){//non static
		System.out.println("af");//sysout should be there
	}
	
	public int m2(){
		Methode obj = new Methode();
		obj.m1();//local var
		return 1;
	}
	
	public float m3(){
		return 1.3f;
	}
	
	public boolean m4(){
		return true;
		
	}
	
	//static
	
	public static void m5(){
		System.out.println("inside m5");
	}
	
	public static void main(){
		
		// To call the function from Non static neccessry to create object
		
		Methode obj = new Methode();
		obj.m1();// to call void 
		
		System.out.println(obj.m2());//to call except void.
		
		//to call the function from static no need to create object
		
		Methode.m5();
		
		//WE CAN USE NON STATIC TO CALL STATIC 
		//BUT WE CAN NOT USE STATIC WAY TO CALL NON STATIC
		
		obj.m5();//calling static func by non static way
	}
}

