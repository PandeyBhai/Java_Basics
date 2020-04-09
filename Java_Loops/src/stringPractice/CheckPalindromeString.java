package stringPractice;

import java.util.Scanner;

public class CheckPalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		StringBuffer OrginalString = new StringBuffer(input.nextLine());
		
		StringBuffer reverseString = OrginalString.reverse();
		
		if(reverseString.equals(OrginalString)) {
			System.out.println("It's a palindrome String");
		}
		else {
			System.out.println("It's not a palindrome String");
		}
	}
}
