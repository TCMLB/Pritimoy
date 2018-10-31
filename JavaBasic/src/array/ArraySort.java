//sort array according to ascending descending 
package array;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// declared and creation  a array
		int [] number= {5,2,-6,7,80,12,-15,0,20,100,-5};
		//sort
		Arrays.sort(number);
		//ascending order
		System.out.println("Ascending order :");
		for(int x: number) {//for each loop
			System.out.print(x+", ");
			
		}//for each loop 
		
		//descending order
		System.out.println("\nDescending order :");
		for(int i=10;i>=0;i--) {
			System.out.print(number[i]+", ");
		}
		
		


	}

}
