package controlStatement;

import java.util.Scanner;

public class Tarnurry {

	public static void main(String[] args) {
		Scanner inputnumber = new Scanner(System.in);
		int num1, num2;
		System.out.println("\nEnter the number 1 and number 2 ");
		num1 = inputnumber.nextInt();
		num2 = inputnumber.nextInt();
		int large =(num1>num2)?num1:num2;
		System.out.println("Larg number is "+large);

	}

}
