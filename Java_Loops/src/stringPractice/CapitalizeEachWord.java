package stringPractice;

import java.util.Scanner;

public class CapitalizeEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a String");
		String inputString = new String(input.nextLine());

		String[] wordsInString = inputString.split(" ");
		
		for(String st:wordsInString) {
			st = st.replace(st.substring(0, 1), st.substring(0, 1).toUpperCase());
			System.out.print(st+" ");
		}
	}

}
