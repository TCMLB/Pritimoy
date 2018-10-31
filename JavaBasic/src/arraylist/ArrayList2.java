//ArrayList add remove element clear test
//chake emplty, check element, set a value,get a value

package arraylist;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		//declared a arraylist
		ArrayList<String> name= new ArrayList<>();
		//import value 
		name.add("Pritimoy");
		name.add("Suprovat");
		name.add("Mithun");
		name.add("Sudipta");
		name.add("Rajib");
		
		//print array size
		System.out.println("Array size = "+name.size());
		//print array element
		System.out.println("Array contain ="+name);
		for(String x:name) {
			System.out.print(x+", ");
		}//end for
		
		//remove a element
		name.remove(2);
		System.out.println("\nArray size after removing one element = "+name.size());
		
		System.out.println("\nArray contain after removing ="+name);
		
		//check array clear
		//name.clear();
		boolean check =name.isEmpty();
		System.out.println("Array list emply : " +check);
		//check same contain
		boolean contain = name.contains("Suprovat");
		System.out.println("Suprovat contain arraylist : " +contain);
		
		//show index of any elements
		int pos=name.indexOf("Sudipta");
		System.out.println("The position of Sudipta : "+pos);
		//set method to replace a 
		name.set(0, "PB");
		System.out.println("\nafter set  ="+name);
		
		//get a index value
		String getvalue =name.get(3);
		System.out.println("value of index 3 : "+getvalue);

		

	}

}
