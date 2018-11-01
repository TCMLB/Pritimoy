//datedemo class show the current date and date format use for format the date

package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// input date class
		Date date =new Date();
		System.out.println("Current Date : "+date);//show default date
		
		//using date format for customize date format
		DateFormat dateFormat = new SimpleDateFormat ("dd/MM/YYYY");
		String currentDate =dateFormat.format(date);//put date into curentDate String
		System.out.println("Current Date (dd/MM/YYYY) :"+currentDate);

	}//end main

}//end class DateDemo
