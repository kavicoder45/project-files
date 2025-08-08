package datepractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Practice {
	public static void main(String[] args) {
		
		LocalDate d = LocalDate.of(2024,1,3); //human readable: 
		System.out.println(d.isLeapYear());
		
//		now return the LocalDate object: 
		System.out.println(LocalDate.now()); // machine readable: 
//		we can use the of method to specify particular time: 
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ld = LocalDateTime.now(ZoneId.of("Pacific/Majuro"));
//		to find the time of particular zone  id : 
//		
//		for(String val: ZoneId.getAvailableZoneIds())
//		{
//			System.out.println(val);
//		}
		
//		System.out.println(ld);
		
//		se can check whether the give date is leap year or not ::: 
//		LocalDate 
//		don't be lazy,don't fear, don't overwhelmed, don't distract yourself, y=
		
//		by using parse method we can parse the date from the string: 
//		String date = "2024-11-02";
//		LocalDate ld1 = LocalDate.parse(date);
//		System.out.println(ld1);
	}
	   DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  

}
