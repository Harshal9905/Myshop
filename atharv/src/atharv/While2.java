package atharv;

public class While2 {
	public static void main(String[] args) {
		int a = 1;
		boolean b = true;
		while(a<5){
			if(a==3){
				b = false;
			}
			else{
				System.out.println(a);
			}
			a++;
		}
	}
}
