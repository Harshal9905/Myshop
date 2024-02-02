package a;

public class X {
	public String pb = "public works in same project";
	String df = "default works in same package";
	private String pt = "Private works in same class";
	protected String pro = "Protected works in same package but also run in different package usind extends ";
	public static void main(String[] args) {
		X ab = new X();
		System.out.println(ab.pb);
		System.out.println(ab.df);
		System.out.println(ab.pt);
		System.out.println(ab.pro);
	}
}
