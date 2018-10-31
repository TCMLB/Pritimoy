//array list simple 
//how to declared a arraylist and put value into array list

package arraylist;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListSimple {

	public static void main(String[] args) {
		/**
		 * how to declared arraylist
		 * ArrayList<DataType> arraylistname = new ArrayList<>();
		 * */
		//array list
		ArrayList<Integer> number =new ArrayList<>();//declaration ArrayList
		//input value
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		
		//print array list
		System.out.println(number);//one way
		for(int x:number) {//second way using foreach .wo can't use for loop in array list 
			System.out.print(x +" ");
		}
		System.out.println();
		//3rd way using iterator
		Iterator ite = number.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next()+ ", ");
		}
		//size the array list
		System.out.println("\nSize of array "+ number.size());
		
		//remove value from array list
		number.remove(2);
		
		System.out.println("\nAfter removing element "+number);
		System.out.println("Size of array "+ number.size());
		//remove all element
		number.removeAll(number);
		System.out.println("\nAfter removing all element "+number);
		System.out.println("Size of array "+ number.size());
		

	}

}
