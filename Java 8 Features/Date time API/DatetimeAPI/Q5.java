package DatetimeAPI;

import java.time.LocalTime;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time = LocalTime.now();
		System.out.println("Time : " + time );
		System.out.println("Time after 25 minutes : " + time.plusMinutes(25));
	}

}

