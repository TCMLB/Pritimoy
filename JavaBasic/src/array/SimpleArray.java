//Simple array declared array and put value 

package array;

public class SimpleArray {

	public static void main(String[] args) {
		/**
		 * How to declared array ?
		 * datatype[] arrayName;
		 * create array
		 * arrayName=new int[5];//size 
		 * 
		 * one line declared and create
		 * int[] arrayName = new int[5];
		 * */
		
		int[] number = new int[5];//declaration and creation
		number[0]=1;//input value
		number[1]=3;
		number[2]=2;
		number[3]=5;
		number[4]=8;
		System.out.println("Thire array =  "+number[2]);
		//try another way
		double [] number2= {1.2, 5.2, 5.0, 3.1,7.1};//declaration and initialization
		System.out.println("Third array = "+number2[2]);

	}

}
