package if_Else_switch;

import java.util.Scanner;

public class LeapYr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year");
		year = input.nextInt();
		
		if(year%4==0 && year%100!=0) {
			System.out.println(+year+ " is a leap year");
		}
		else if(year%400==0) {
			System.out.println(+year+ " is a centurion year and also a leap year");
		}
		else if(year%100==0) {
			System.out.println(+year+ " is a centurion year and not a leap year");
		}
		else {
			System.out.println(+year+ " is niether a centurion year nor a leap year");
		}

	}

}
