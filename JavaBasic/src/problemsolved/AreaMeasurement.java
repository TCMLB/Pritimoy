//calculate the area 

package problemsolved;

import java.util.Scanner;

public class AreaMeasurement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Area calculation of Square
		System.out.println("\t Area calculation of Square \t");
		double a,as;
		System.out.println("Enter the leangth of the side a =\n");
		a=input.nextDouble();//input one side of square
		as=a*a;//area of square=a2
		System.out.printf("Area of the squre = %f Units\n",as);
		
		//area of triangle
		System.out.println("\t Area calculation of Triangle \t");
		double base,height,at;
		System.out.println("\nEnter the base of tringle base = ");
		base=input.nextDouble();//input one side of square
		System.out.println("\nEnter the height of triangle height = ");
		height=input.nextDouble();
		at=.5*base*height;//area of square=a2
		System.out.printf("Area of trinagle  = %f Units\n",at);
		
		//area of circle
		System.out.println("\t area of circle \t");
		double radius,ac;
		System.out.println("\n Enter the radius of circle radius = ");
		radius = input.nextDouble();
		ac=3.1416*radius*radius;
		System.out.printf("\nArea of circle = %fUnit\n",ac);
		

	}

}
