package stringPractice;

import java.util.Scanner;

public class PercentageShareInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String to find the percentage share of each datatype");
		String s1 = input.nextLine();
		int UpperCaseChars = 0;
		int LowerCaseChars = 0;
		int digits = 0;
		int SpecialChars = 0;
		
		for(int i=0;i<s1.length();i++) {
			if(Character.isUpperCase(s1.charAt(i))) {
				UpperCaseChars++;
			}
			else if(Character.isLowerCase(s1.charAt(i))){
				LowerCaseChars++;
			}
			else if(Character.isDigit(s1.charAt(i))) {
				digits++;
			}
			else {
				SpecialChars++;
			}
		}
		
		double PercentageUpperCase = (UpperCaseChars*100)/s1.length();
		double PercentageLowerCase = (LowerCaseChars*100)/s1.length();
		double PercentageDigits = (digits*100)/s1.length();
		double PercentageSpecialChars = (SpecialChars*100)/s1.length();
		
		System.out.println("Percentage Share of UpperCase Characters: "+PercentageUpperCase);
		System.out.println("Percentage Share of LowerCase Characters: "+PercentageLowerCase);
		System.out.println("Percentage Share of Integer Characters: "+PercentageDigits);
		System.out.println("Percentage Share of Special Characters: "+PercentageSpecialChars);

	}

}
