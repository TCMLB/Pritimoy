//AssignmentOoperation.java
//AssignmentOperation class show assignment Operation

package userinput;

import java.util.Scanner;

public class AssignmentOperation {//Assignmentclass

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y;
		System.out.println("Enter the of x and y");
		x= input.nextInt();//input value of x
		y= input.nextInt();//input value of y
		System.out.printf("\n x= %d \n y= %d \n",x,y);//show the value of x and y
		
		//Assignment
		x+=y;
		System.out.printf("After x +=y the assignment opperation the value of x = %d and y = %d\n" ,x,y);
		x-=y;//x=x-y
		System.out.printf("After x -=y the assignment opperation the value of x = %d and y = %d\n" ,x,y);
		x*=y;//x=x*y
		System.out.printf("After x *=y the assignment opperation the value of x = %d and y = %d\n" ,x,y);
		x/=y;//x=x/y
		System.out.printf("After x /=y the assignment opperation the value of x = %d and y = %d\n" ,x,y);
		x%=y;//x=x%y
		System.out.printf("After x =y y the assignment opperation the value of x = %d and y = %d \n" ,x,y);
	}

}
