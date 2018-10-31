//sample for each loop

package array;

import java.util.Scanner;

public class ForEachloop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array lenth ");
		int lenth;
		lenth=input.nextInt();
		System.out.println("Enter the name ");
		String[] name =new String[lenth];
		for(int i=0;i<name.length;i++) {
			name[i]=input.nextLine();
		}
		for(String x : name) {//for each loop
			System.out.println(x);
		}

	}

}
