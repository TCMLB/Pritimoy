//CompairNumber.java
//input number from user output the type of number(positive negative)
package controlStatement;

import java.util.Scanner;

public class CompairNumber {

	public static void main(String[] args) {
		// input Scanner class
		Scanner userinput = new Scanner(System.in);
		int number;
		System.out.println("\nEnter the number ");
		number=userinput.nextInt();
		if(number > 0) {
			System.out.println("The number is positive");
		}
		else if(number < 0) {
			System.out.println("The number is nagetive ");
		}
		else
			System.out.println("The number is Zero");
		
		

	}

}
