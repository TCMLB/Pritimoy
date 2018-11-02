//TeacherMain contain main method and access a static variable using class
package staticdemo;

public class TeacherMain {

	public static void main(String[] args) {
		//use static variable using static class
		System.out.println("University name is :"+Teacher.university);//class name.static variable name
		//using variable using create object
		Teacher teacherobj = new Teacher();
		System.out.println("Name is : "+teacherobj.Name);//object.variable name
		

	}

}
