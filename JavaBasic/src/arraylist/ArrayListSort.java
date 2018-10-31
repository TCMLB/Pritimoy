//sort arraylist  according to ascending or descending
//input array element from user

package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSort {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		// declared a arraylist
		ArrayList<Integer> number=new ArrayList<>();
		
		//add value into array
		/**number.add(10);
		number.add(1);
		number.add(20);
		number.add(-12);
		number.add(22);
		number.add(7);
		number.add(0);
		number.add(3);*/
		
		//add array value from user
		int length;
		System.out.println("Enter the array length or size");
		length=input.nextInt();
		System.out.println("Enter the value of array:");
		
		for(int i=0;i<length;i++) {
			System.out.printf("Indix %d = ",i);
			int a=input.nextInt();
			number.add(a);
		}
		
		
		//print array list
		System.out.println("ArrayList is : "+number);
		//sorting ascending order
		Collections.sort(number);
		System.out.println("after sorting ascending ArrayList is : "+number);
		//descending order
		Collections.sort(number, Collections.reverseOrder());
		System.out.println("after sorting descending ArrayList is : "+number);
		

	}//end main

}//end class ArrayListSort
