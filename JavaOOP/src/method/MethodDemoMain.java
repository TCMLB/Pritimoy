//main class where we use MethodDemoMain using create object
package method;



public class MethodDemoMain {

	public static void main(String[] args) {
		
		
		
		MethodDemo studentobject = new MethodDemo();
		
		//call setInfo method for set Info
		studentobject.setInfo("Pritimoy Biswas",2015000111,"pritimoy54@gmail.com",
				"012-123 4568","Dhaka, Bangladesh"	);//passing method
		
		//called diaplayInfo() method for print all info
		studentobject.displayInfo();
		
		//create another object
		MethodDemo studentobject1 = new MethodDemo();
		/*studentobject1.name ="Suprovat Roy";
		studentobject1.address ="Magura, Bangladesh";
		studentobject1.id =2015000333;
		studentobject1.email ="skroy@gmail.com";
		studentobject1.phone_no ="012-123 4567";*/
		//call setInfo method for set Info
				studentobject1.setInfo("Suprovat Roy",2015000333,"skroy@gmail.com",
						"012-123 4567","Magura, Bangladesh"	);//passing method
		
		//print new line 
		System.out.println("\n\n");
		//print info 
		
		studentobject1.displayInfo();
		
		
		

	}

}
