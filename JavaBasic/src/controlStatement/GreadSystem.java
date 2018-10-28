//GreadSystem.java
//input the number from user and output show the the grade (Bangladeshi standard) 

package controlStatement;

import java.util.Scanner;

public class GreadSystem {

	public static void main(String[] args) {
		// Scanner class input
		Scanner userinput = new Scanner(System.in);
		double number;
		System.out.println("Enter the Number");
		number = userinput.nextDouble();
		if (number >= 80) {
			System.out.println("\nYou got A+");
		}
		else if (number >= 75) {
			System.out.println("\nYou got A");
		}
		else if (number >= 70) {
			System.out.println("\nYou got A-");
		}
		else if (number >= 65) {
			System.out.println("\nYou got B+");
		}
		else if (number >= 60) {
			System.out.println("\nYou got B");
		}
		else if (number >= 55) {
			System.out.println("\nYou got B-");
		}
		else if (number >= 50) {
			System.out.println("\nYou got C+");
		}
		else if (number >= 45) {
			System.out.println("\nYou got C");
		}
		else if (number >= 40) {
			System.out.println("\nYou got D");
		}
		else if (number <= 39) {
			System.out.println("\nYou got F");
		}

	}

}
