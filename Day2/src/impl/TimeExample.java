package impl;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalTime time= LocalTime.now();
		
		System.out.println("Curretn time is "+time+" finishTime "+LocalTime.now().plusHours(3));

		
		
		System.out.println(LocalTime.ofSecondOfDay(86399));
		
		
		System.out.println("Current date time is"+LocalDateTime.now());
		
		
		LocalDate today =LocalDate.now();
		LocalDate sundat = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		
		System.out.println("Now" +today+" adjusted date"+sundat);
		
		Period p = today.until(sundat);
		
		System.out.println(":Period "+p.getDays());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
