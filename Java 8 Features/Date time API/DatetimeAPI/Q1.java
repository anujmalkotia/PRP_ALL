package DatetimeAPI;

import java.time.LocalDate;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println("Todays Date : " + date);
		System.out.println("Date after 10 days : " + date.plusDays(10));
	}

}