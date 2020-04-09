package stringPractice;

import java.util.Scanner;

public class ToggleEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String inputString = new String(input.nextLine());
		
		inputString = inputString.toUpperCase();

		String[] wordsInString = inputString.split(" ");
		
		for(String st:wordsInString) {
			st = st.replace(st.substring(0, 1), st.substring(0, 1).toLowerCase());
			System.out.print(st+" ");
		}

	}

}
