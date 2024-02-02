package b;
import a.X;
public class W extends X{
	public static void main(String[] args) {
		W ab = new W();
		System.out.println(ab.pb);
		//System.out.println(ab.df);//error default
		//System.out.println(ab.pt);//error private
		System.out.println(ab.pro);
	}
}
