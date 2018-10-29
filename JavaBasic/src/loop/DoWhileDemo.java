/**
 * simple do while loop
 * */
package loop;

public class DoWhileDemo {

	public static void main(String[] args) {
		/**
		 * initialization
		 * do{statement
		 * increment/decrement
		 * }
		 * while(condition);
		 * */
		
		int i=1;
		do {
			System.out.printf("Loop %d\n",i);
			i++;
		}
		while(i<=10);

	}//end main class

}//end class DoWhileDemo
