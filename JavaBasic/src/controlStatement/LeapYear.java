package controlStatement;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner inputyear = new Scanner(System.in);
		int year;
		System.out.println("\nEnter the year ");
		year = inputyear.nextInt();
		System.out.println("year ="+year);
		//one way
		if(year % 400==0) {
			System.out.println("leap year");
		}
		else if (year % 4 ==0 && year %100!=0) {
			System.out.println(" leap year");
			
		}
		else
			System.out.println("not leap year");
			
		//another way
		if((year %4 ==0 && year%100!=0)|| year %400 ==0) {
			System.out.println("leap year");
		}
		else
			System.out.println("not leap year");
			
		//nested condition
		if(year %4==0) {
			if(year %100==0) {
				if(year % 400 ==0) {
					System.out.println("leap year");
				}
				else
					System.out.println("not leap year");
				
			}
			else
				System.out.println("leap year");
			
		}
		else
			System.out.println("Not leap year");
			

	}

}
