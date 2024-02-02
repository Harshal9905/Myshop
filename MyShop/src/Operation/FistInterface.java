package Operation;

import java.util.Scanner;

import com.MyShop.*;



public class FistInterface {
	public static void main(String[] args) {
			boolean b = true;
			String h = "start";
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			while(b){
			
			System.out.println(name+ " Electronics");
			System.out.println("Select the option");
			System.out.println("1.Tv");
			System.out.println("2.Mobile");
			System.out.println("3.Ac");
			int i = sc.nextInt();
			
			switch(i){
			case 1:{
				Mobiles mb = new Mobiles();
				mb.mobileInfo();
				break;
			}case 2:{
				Tv tb = new Tv();
				tb.tvInfo();
				break;
			}case 3:{
				Ac ab = new Ac();
				ab.acInfo();
				break;
			//String h = sc.next();
			
			}case 4:
				b = false;
				break;
			}
			//sc.close();
			}
		}
	}

