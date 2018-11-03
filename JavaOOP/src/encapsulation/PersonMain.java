//main class of person
//create object class person 
//access the private variable
package encapsulation;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the name :");
		String n= input.nextLine();
		System.out.println("Emter the email:");
		String e= input.nextLine();
		
		System.out.println("Enter the age :");
		int a = input.nextInt();
		
	
		
		// create the object of class Person
		Person personobj=new Person();
		
		personobj.setInfo(n, a, e);
		
		System.out.println("Name :\t"+personobj.getInfo());
		System.out.println("age :\t"+personobj.getInfo1());
		System.out.println("email :\t"+personobj.getInfo2());
		

	}

}
