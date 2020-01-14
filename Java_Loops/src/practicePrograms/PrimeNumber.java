package practicePrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		int m=(number/2);
		int i=2; 
		int flag=0;
		if(number==0 || number==1) {
			System.out.println("Not a prime number");
		}
		else {
			while(i<=m) {
				if(number%i==0) {
					System.out.println("Not a prime number");
					flag=1;
					break;
				}
				i++;
			}
		}
		if(flag==0) {
			System.out.println("Prime number");
		}
		
	}

}
