package constructor;

public class StudentDemo {
	String name,email,phone_no,address;
	int id;
	
	StudentDemo (String Name,int Id,String Email,String Phone_No){
		name=Name;
		id=Id;
		email=Email;
		phone_no=Phone_No;
		System.out.println("constractor 1 call");
		System.out.println("Student Name : \t\t"+name);
		System.out.println("Student id : \t\t"+id);
		System.out.println("Student Phone No :\t"+phone_no);
		System.out.println("Student Email : \t"+email);
		
	}
	StudentDemo (String Name,int Id,String Email,String Phone_No,String Address){
		name=Name;
		id=Id;
		email=Email;
		phone_no=Phone_No;
		address=Address;
		
		//display
		//void displayInfo() {//return type ->method name->(parameter) {}
		System.out.println("called constractor 2");
			System.out.println("Student Name : \t\t"+name);
			System.out.println("Student id : \t\t"+id);
			System.out.println("Student Phone No :\t"+phone_no);
			System.out.println("Student Email : \t"+email);
			System.out.println("Student Address : \t"+address);
		
	}
	//display message
	
	/*void displayInfo() {//return type ->method name->(parameter) {}
		System.out.println("Student Name : \t\t"+name);
		System.out.println("Student id : \t\t"+id);
		System.out.println("Student Phone No :\t"+phone_no);
		System.out.println("Student Email : \t"+email);
		System.out.println("Student Address : \t"+address);
		
		
		
	}*/

}
