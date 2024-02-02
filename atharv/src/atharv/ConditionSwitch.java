package atharv;

public class ConditionSwitch {
	public static void main(String[] args) {
		//Switch case can have multiple case
		//Switch case cannot be duplicate
		switch (1) {
		case 1:
			System.out.println("1");
			break;//break is used to get out of the switch statement 
			//if break is not there then it will continue to next case not affect case is true or false
		case 2:
			System.out.println("2");
			break;

		default:
			break;
		}
	}
}
