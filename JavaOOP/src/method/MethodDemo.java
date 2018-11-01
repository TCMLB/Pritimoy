//create a method and use it another class using this class object
package method;

public class MethodDemo {
	//declared variable
		String name,address,email,phone_no;
		int id;
		
		//create a set method
		void setInfo(String Name,int ID,String Email,String Phone_No,String Address) {
			name=Name;
			id=ID;
			email=Email;
			phone_no=Phone_No;
			address=Address;
			
		}
		
		//create a method for print instance
		void displayInfo() {//return type ->method name->(parameter) {}
			System.out.println("Student Name : \t\t"+name);
			System.out.println("Student id : \t\t"+id);
			System.out.println("Student Phone No :\t"+phone_no);
			System.out.println("Student Email : \t"+email);
			System.out.println("Student Address : \t"+address);
			
		}

}
