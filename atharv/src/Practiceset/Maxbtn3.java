package Practiceset;

public class Maxbtn3 {
	public static void main(String[] args) {
		int a=30, b=50, c=250;
		if(a<b){
			if(b<c){
				System.out.println(c + " is max");
			}
			else{
				System.out.println(b + " is max");
			}
		}else{
			System.out.println(a + " is max");
		}
	}
}
