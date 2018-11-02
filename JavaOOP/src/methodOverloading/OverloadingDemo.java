//method overloading 
package methodOverloading;

public class OverloadingDemo {
	
	void add(int a,int b) {
		System.out.printf("\nSome of %d + %d= %d",a,b,(a+b));
	}
	void add(double a,double b) {
		System.out.printf("\nSome of %f + %f= %f",a,b,(a+b));
	}
	void add(int a,int b,int c) {
		System.out.printf("\nSome of %d + %d= %d",a,b,(a+b+c));
	}
	void add() {
		System.out.println("\nNothing to add ");
	}

}
