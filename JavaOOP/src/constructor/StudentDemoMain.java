package constructor;

public class StudentDemoMain {

	public static void main(String[] args) {
		StudentDemo studentobject = new StudentDemo("Pritimoy Biswas",2015000111,"pritimoy54@gmail.com",
				"012-123 4567");
		System.out.println("\n\n");
		StudentDemo studentobject1 = new StudentDemo("Pritimoy Biswas",2015000111,"pritimoy54@gmail.com",
				"012-123 4567","Dhaka Bangladesh");
		//studentobject.displayInfo();

	}

}
