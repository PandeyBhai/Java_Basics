package operators;

public class LogicalAnd_n_BitwiseAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=12;
		int num2=13;
		
		System.out.println((num1>num2&&(++num1)>=num2)); //False + True = False 
		System.out.println("num1 = "+num1+" "+"num2 = "+num2); //num1 = 12 num2 = 13
		
		
		++num1; --num2;
		
		System.out.println(!(num1>num2&(++num1)>num2)); //!(True + True = True) = False
		System.out.println("num1 = "+num1+" "+"num2 = "+num2); //num1 = 14 num2 = 12
	}

}
