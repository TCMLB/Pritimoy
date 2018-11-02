//output factorial value using recursion
package recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		FactorialDemo factobj =new FactorialDemo();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number :");
		int num=input.nextInt();
		
		int result =factobj.fact(num);
		System.out.printf("%d! = %d",num,result);

	}

}
