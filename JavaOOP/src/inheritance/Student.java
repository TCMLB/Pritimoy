//student class child class
package inheritance;

public class Student extends Person {
	String email;
	
	void displayInformation2() {
		System.out.println("Name :"+name);
		//call
		System.out.println("Email :"+email);
	}

}
