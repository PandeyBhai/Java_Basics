package practicePrograms;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		int num1=0,num2=1;
		int num;
		
		System.out.print(num1+ " " +num2);
		
		while(n<10) {
			num=num1+num2;
			num1=num2;
			num2=num;
			System.out.print(" "+num);
			n++;
		}

	}

}
