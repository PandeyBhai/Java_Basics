package practicePrograms;

import java.util.Calendar;
import java.util.Scanner;

public class DayonDate {
	
	public static String FindDay(int month, int day, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		int dayofWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(dayofWeek);
		
//		System.out.println("Day".getClass());
//		System.out.println("dayofWeek".compareTo(""));
		
		String weekDay = null;
		switch(dayofWeek) {
		
		case 1:
			weekDay = "Sunday";
			break;
		case 2:
			weekDay = "Monday";
			break;
		case 3:
			weekDay = "Tuesday";
			break;
		case 4:
			weekDay = "Wednesday";
			break;
		case 5:
			weekDay = "Thursday";
			break;
		case 6:
			weekDay = "Friday";
			break;
		case 7:
			weekDay = "Saturday";
			break;
		}
		
		return weekDay;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter month followed by date followed by year");
		System.out.println(FindDay(input.nextInt(), input.nextInt(), input.nextInt()));

	}

}
