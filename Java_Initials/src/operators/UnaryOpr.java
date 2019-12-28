package operators;

public class UnaryOpr {
	
	static int num1_Stat=55;
	static int num2_Stat=16;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1_local = 12;
		int num2_local = 31;
		
		//Increment and Decrement
		
		System.out.println(num1_local++ + ++num2_local); //44
		System.out.println("num1_local = "+num1_local); //13
		System.out.println("num2_local = "+num2_local); //32
		
		System.out.println(num1_Stat++ + ++num2_Stat); //72
		System.out.println("num1_Stat = "+num1_Stat); //56
		System.out.println("num2_Stat = "+num2_Stat); //17
		
		System.out.println(num1_local-- + --num2_local); //44
		System.out.println("num1_local = "+num1_local); //12
		System.out.println("num2_local = "+num2_local); //31
		
		System.out.println(num1_Stat-- + --num2_Stat); //72
		System.out.println("num1_Stat = "+num1_Stat); //55
		System.out.println("num2_Stat = "+num2_Stat); //16
		
		//Negation
		System.out.println("Negation of num1_local = " +(~num1_local)); //-13
		System.out.println("Negation of num2_local = " +(~num2_local)); //-32
		System.out.println("Negation of num1_Stat = " +(~num1_Stat)); //-56
		System.out.println("Negation of num2_Stat = " +(~num2_Stat)); //-17
		
	}

}
