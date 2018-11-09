//It is main class 
package inheritance;

public class Test {

	public static void main(String[] args) {
		// create object Student and access Student class property and Person class property
		
		Student studentobj = new Student();
		//use Person class variable
		studentobj.name="Suprovat Roy";
		studentobj.age=25;
		studentobj.email="skroy@gmail.com";
		
		//called displayInformation2() and displayInformaion1()
		studentobj.displayInformation2();
		studentobj.displayInformation2();

	}

}
