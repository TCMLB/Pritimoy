//declaration array and initialization array
//sum of array
//put array value from user
package array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner arrayinput = new Scanner(System.in);
		int []number =new int[5];
		System.out.println("Please Enter the 5 value ");
		number[0]=arrayinput.nextInt();
		number[1]=arrayinput.nextInt();
		number[2]=arrayinput.nextInt();
		number[3]=arrayinput.nextInt();
		number[4]=arrayinput.nextInt();
		
		//print array value
		System.out.println(number[3]);

	}//main end

}//class Array2 end
