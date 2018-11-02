//variable length arguments
package varargs;

public class Add {
	//variable length argument
	void addition(double ... num) {
		double sum=0;
		for(double x: num) {
			sum=sum +x;
		}
		System.out.println("Sumation is :"+sum);
	}

}
