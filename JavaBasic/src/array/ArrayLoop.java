//array declared 
//input from user using loop
package array;

import java.util.Scanner;

public class ArrayLoop {

	public static void main(String[] args) {
		Scanner arrayinput = new Scanner(System.in);
		int lenth;
		int sum=0;
		System.out.println("Enter the array length ");
		lenth=arrayinput.nextInt();
		int []number =new int[lenth];
		System.out.println("Please Enter the 5 value ");
		for(int i=0;i<number.length;i++) {
			number[i]=arrayinput.nextInt();
		
		}	
		//print all value
		System.out.print("Array that you enter ");
		for(int i=0;i<number.length;i++) {
			System.out.print(" "+number[i]);
			sum=sum +number[i];
		}
		System.out.println("\n some of array "+sum);
		

	}//end main

}//end class ArrayLoop
