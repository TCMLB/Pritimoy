//show local time format the time 
package datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeDemo {

	public static void main(String[] args) {
		//input time class
		LocalTime time = LocalTime.now();
		System.out.println("Current Time : "+time);
		//format the time 
		DateTimeFormatter formatter =DateTimeFormatter.ofPattern("hh:mm:ss");
		String currentTime = time.format(formatter);
		
		System.out.println("Current Time :"+currentTime);

	}

}
