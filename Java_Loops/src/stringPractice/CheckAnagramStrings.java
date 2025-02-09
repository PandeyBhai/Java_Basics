package stringPractice;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramStrings {

	static boolean checkAnagram(String s1, String s2) {
		
		s1 = s1.replaceAll(" ", "");
		s2 = s2.replaceAll(" ", "");
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		else {
			char[] s1Chars = s1.toCharArray();
			char[] s2Chars = s2.toCharArray();
			
			Arrays.sort(s1Chars);
			Arrays.sort(s2Chars);
			
			if(Arrays.equals(s1Chars, s2Chars)) {
				return true;
			}
			else {
				return false;
			}

		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 2 Strings to check if they are Anagram");
		
		if(checkAnagram(input.nextLine(), input.nextLine())) {
			System.out.println("These are Anagram Strings");
		}
		else {
			System.out.println("These are not Anagram Strings");
		}

	}

}
