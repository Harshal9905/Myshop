package atharv;

public class Opperator {
	public static void main(String[] harshal){
	
		//assignment operator
	int a = 10;
	int b = 20;
	
	//arithmetic operator
	int c = a+b;
	int d = a-b;
	int e = a*b;
	int r = a%b;
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(r);
	
	//increment or decrement operator
	int var = 10;
	int post_inc = var++;//1]assign 2]increment
	int post_dec = var--;//1]assign 2]decrement
	System.out.println(var);
	System.out.println(post_inc);
	System.out.println(post_dec);
	int var2 = 20;
	int pre_inc = ++var2;//1]increment 2]assign 
	int pre_dec = --var2;//1]decrement 2]assign 
	System.out.println(pre_inc);
	System.out.println(pre_dec);
	
	//string operator (concatenate)
	System.out.println(10+20+"abc"+"xyz"+10+20);//before string consider arithmatic, after string consider string
	
	//relational operator
	int rel=10;
	int rel2=20;
	System.out.println(rel>rel2);
	System.out.println(rel<rel2);
	boolean res = rel>rel2;
	
	//bitwise operator
	System.out.println(true & false);
	System.out.println(true | false);
	
	//short circuit operator
	System.out.println(false && true);//both are same here cheak first value if false then stop else cheak next value
	System.out.println(true || false);//both are same here cheak first value if true then stop else cheak next value
	
	//ternary operator ?
	//String r = ()
	
	}
}
