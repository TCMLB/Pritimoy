//2d array and print row and column sixe
//input matrix element from user

package array;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		
		
		
		//input row and column length
		int rowsize,colsize;
		System.out.println("Enter the row and column size of matrix");
		rowsize=input.nextInt();
		colsize=input.nextInt();
		
		// declared 2d array
				int [][]number =new int [rowsize][colsize];
		//input
		System.out.println("enter the value of 2d matrix: ");
		for(int row=0;row<rowsize;row++) {//for1 start
			for(int column=0; column<colsize;column++) {//for2 start
				System.out.printf("[%d],[%d] = ",row ,column);
				number [row][column]= input.nextInt();
			}//end for2
		}//end for1
		
		
		//input array
		System.out.println("The matix that you Enter");
				for(int row=0;row<rowsize;row++) {//for1 start
					for(int column=0; column<colsize;column++) {//for2 start
						System.out.print("\t "+number [row][column]);
					}//end for2
					System.out.println();
				}

	}

}
