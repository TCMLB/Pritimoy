//Teacher main method 
//use method using create object 
//use static method using static class

package staticMethod;

public class TeacherMain {

	public static void main(String[] args) {
		// create object and use displayInfo() non static method
		Teacher teacherobj = new Teacher();
		teacherobj.displayInfo();
		
		//use static method using static class
		Teacher.displayInfo2();//static class name.static method
	}

}
