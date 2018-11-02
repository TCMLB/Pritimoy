//OverloadingDemoMain use overloading method that are hold on OverloadDemo class
package methodOverloading;

public class OverloadingDemoMain {

	public static void main(String[] args) {
		OverloadingDemo overloadingobj = new OverloadingDemo();
		overloadingobj.add();
		overloadingobj.add(5, 9);
		overloadingobj.add(5, 8, 7);
		overloadingobj.add(5.8, 7.3);

	}

}
