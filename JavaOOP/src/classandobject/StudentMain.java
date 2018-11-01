//main class for student class
//create Student class object and use all 
package classandobject;

public class StudentMain {

	public static void main(String[] args) {
		// declared and create object on class Student
		Student studentobject = new Student();//class name (which class has created object) 
		                                      //object name = new classname()
		
		//using student class element
		studentobject.name ="Pritimoy Biswas";
		studentobject.address ="Dhaka, Bangladesh";
		studentobject.id =2015000111;
		studentobject.email ="pritimoy54@gmail.com";
		studentobject.phone_no ="012-123 4568";
		System.out.println("Student Name : \t\t"+studentobject.name);
		System.out.println("Student id : \t\t"+studentobject.id);
		System.out.println("Student Phone No :\t"+studentobject.phone_no);
		System.out.println("Student Email : \t"+studentobject.email);
		System.out.println("Student Address : \t"+studentobject.address);
		
		//use same class different student
		Student studentobject1 = new Student();//create another object
		
		studentobject1.name ="Suprovat Roy";
		studentobject1.address ="Magura, Bangladesh";
		studentobject1.id =2015000333;
		studentobject1.email ="skroy@gmail.com";
		studentobject1.phone_no ="012-123 4567";
		System.out.println("\n\nStudent Name : \t\t"+studentobject1.name);
		System.out.println("Student id : \t\t"+studentobject1.id);
		System.out.println("Student Phone No :\t"+studentobject1.phone_no);
		System.out.println("Student Email : \t"+studentobject1.email);
		System.out.println("Student Address : \t"+studentobject1.address);

	}

}
