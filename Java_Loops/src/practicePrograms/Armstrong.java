package practicePrograms;

import java.util.Scanner;

public class Armstrong {
	
	static boolean checkArmstrong(int number) {
		int ArmStrongNumber = 0;
		int temp = number;
		while(temp>0) {
			int remainder = temp%10;
			temp=temp/10;
			ArmStrongNumber = ArmStrongNumber + (remainder*remainder*remainder);
		}
			
		if(ArmStrongNumber==number) {
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
		
		if(checkArmstrong(input.nextInt())) {
			System.out.println("It's an Armstrong number");
		}
		else {
			System.out.println("It's not an Armstrong number");
		}

	}

}
