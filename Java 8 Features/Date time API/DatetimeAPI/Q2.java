package DatetimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate secondSunday = LocalDate.now().plusMonths(1).with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
		System.out.println(secondSunday);
	}

}
