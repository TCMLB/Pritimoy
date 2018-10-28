//simple use of switch case

package controlStatement;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner inputdigit = new Scanner(System.in);
		int digit;
		System.out.println("\nEnter the digit (0 to 5)");
		digit = inputdigit.nextInt();
		System.out.println("digit = "+digit);
		//switch case apply
		switch(digit) {
		
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Not in this rang");
		
		}//switch case end

	}//main end

}//class Switch end
