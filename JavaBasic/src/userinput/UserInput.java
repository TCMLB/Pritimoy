//UserInput.java
//UserInput class contain simple taking user input and print
package userinput;

import java.util.Scanner;

public class UserInput {
	//main class start execution
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);//for input with Scanner class
	
		int number;//variable
		System.out.println("Enter the number =");//print function
		
		number = input.nextInt();//for taking input 
		System.out.println("The number you Entre is = " +number);//print the given input 
		
		double number2;//double variable for store double type value
		System.out.print("Enter number2 =");//print
		number2= input.nextDouble();//input double type from user
		System.out.println("The number2 you enter is = "+number2);//print the user input
		
	}

}
