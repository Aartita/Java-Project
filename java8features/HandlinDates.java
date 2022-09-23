package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class HandlinDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date : "+currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Cuurent Time : "+currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("current date and time : "+currentDateTime);
		
		LocalDate anotherDate = LocalDate.parse("2014-11-25");//setting in string formatt
		System.out.println("Another date using parse: "+anotherDate);
		
		
		LocalDate anotherDate2 = LocalDate.of(2010, 5, 15);//setting date by passing integer
		System.out.println("Another date using of() : "+anotherDate2);
		
		
		//retrieving yesterday's and tomorrow's date
		LocalDate yesterday = currentDate.minusDays(1);
		System.out.println("Yesterday's date : "+yesterday);
		LocalDate tomorrow  = currentDate.plusDays(1);
		System.out.println("Tomorrow date  : "+tomorrow);
		
		
		
		//Checking leap year
		System.out.println( "is Leap year? "+currentDate.isLeapYear());
		
		//changing date-time formatt
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyy  HH:mm:ss");//setting pattern
		String formattedDate = currentDateTime.format(formatter);
		System.out.println("Formatted Date:  "+formattedDate);
		
		
		
		Month month = currentDateTime.getMonth();
		int day = currentDateTime.getDayOfMonth();
		int year = currentDateTime.getYear();
		
		
		int hour = currentDateTime.getHour();
		int min = currentDateTime.getMinute();
		int ss = currentDateTime.getSecond();
		
		System.out.println("Date is : "+day+" "+month+" "+year+" "+hour+" "+min+" "+ss+"");
		
		//handling zones
		ZonedDateTime current = ZonedDateTime.now();
		System.out.println("\nCurrent date and time : "+current);
		
		System.out.println("Current zone :"+current.getZone());
		
		
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		
		
		ZonedDateTime tokyoZone = current.withZoneSameInstant(tokyo);
		System.out.println("Tokyo zone: "+tokyoZone);
		
		
		
		
		
		

	}

}
