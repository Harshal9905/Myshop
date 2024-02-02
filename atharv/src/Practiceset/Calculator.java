package Practiceset;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		 int sum = 0;
	        boolean userText = true;

	        while(userText){
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter anything; if you want to terminate the program, type EXIT");
	            String text = sc.nextLine();

	            if (text.equalsIgnoreCase("exit")) {
	                userText = false;
	                break;
	            }

	            System.out.println("Enter number: ");
	            int num = sc.nextInt();
	            int num2 = sc.nextInt();

	            System.out.println("Enter operation No. (1:+, 2:-, 3:*, 4:/): ");
	            int op = sc.nextInt();

	           switch (op) {
	                case 1:
	                    sum = num + num2;
	                    System.out.println("Result: " + sum);
	                    break;
	                case 2:
	                    sum = num - num2;
	                    System.out.println("Result: " + sum);
	                    break;
	                case 3:
	                    sum = num * num2;
	                    System.out.println("Result: " + sum);
	                    break;
	                case 4:
	                    sum = num/num2;
	                    System.out.println("Result: " + sum);
	                    break;
	                default:
	                    System.out.println("Invalid operation");
	                    break;
	            }

	        }

	        
		 
	 
	 }
	 
}
