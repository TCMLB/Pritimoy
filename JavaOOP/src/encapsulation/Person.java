//use encapsulation on this class 
//set and get method to access private variable

package encapsulation;

public class Person {
	private String name;
	private int age;
	private String email;
	
	//set method to access the private variable
	public void setInfo(String Name, int Age, String email) {
		name=Name;
		age=Age;
		this.email=email;//local and instance variable same so use this.email
	}
	
	//get method 
	public String getInfo() {
		return name;
	}
	public int getInfo1() {
		return age;
	}
	public String getInfo2() {
		return email;
	}
	
	//display info 
	/*void display() {
		System.out.println("Name :\t"+name);
		System.out.println("Age :\t"+name);
		System.out.println("Email :\t"+name);
	}*/
	
	

}//person class end
