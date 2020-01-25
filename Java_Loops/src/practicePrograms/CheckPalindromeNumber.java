package practicePrograms;

import java.util.Scanner;

public class CheckPalindromeNumber {
	
	static boolean checkPalindromeway1(int number) {
		int temp = number;
		int reverseNum=0;
		while(temp>0) {
			reverseNum=reverseNum*10+(temp%10);
			temp=temp/10;
		}
		if(reverseNum==number) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		if(checkPalindromeway1(input.nextInt())) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
		
	}
	

}
