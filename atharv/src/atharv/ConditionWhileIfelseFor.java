package atharv;

public class ConditionWhileIfelseFor {
	public static void main(String[] args) {
		boolean b = true;
		int a = 1;
		while(b){
			if (a==15){
				for(int i = 0;i<10;i++){
					if(i==5){
						b = false;
					}
					else{
						System.out.println(i);
					}
				}
			}
			else{
				System.out.println(a);
				a++;
			}
		}
	}
}
