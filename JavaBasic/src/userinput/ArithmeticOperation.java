//ArithmeticOperation.java
//Simple input from user 
//arithmetic operation

package userinput;

import java.util.Scanner;

public class ArithmeticOperation {
	//main class start execution

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);//Scanner class for userinput
		float num1, num2;//variable
		System.out.print("Enter the number1 :");
		num1 = userinput.nextFloat();//input  number1
		System.out.print("\nEnter the number2 :");
		num2 = userinput.nextFloat();//input number2
		
		//Arithmetic Operation
		System.out.printf("\n Sam of %f and %f is   = %f", num1, num2, num1+num2 );//sum of two number
		System.out.printf("\n Sub of %f and %f is   = %f", num1, num2, num1-num2 );//sum of two number
		System.out.printf("\n Mul of %f and %f is   = %f", num1, num2, num1*num2 );//sum of two number
		System.out.printf("\n Div of %f and %f is   = %f", num1, num2, num1/num2 );//sum of two number
		System.out.printf("\n Mod of %f and %f is   = %f", num1, num2, num1%num2 );//sum of two number
		

	}

}
