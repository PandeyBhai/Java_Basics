package variables;

public class VariableTypes {
	
	//Instance Variable
	int num1_Instance=20;
	int num2_Instance=30;
	
	//Static Variable
	static int sum_static;
	static int num1_static=2;
	static int num2_static=3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Local Variable
		int num1_local=71;
		int num2_local=29;
		
		num1_static=3;
		num2_static=8;
		
//		num1_Instance=33; //Instance variable can be used only via object reference
		
//		System.out.println(Add(num1_Instance,num2_Instance)); //Compilation Error: Static variables cannot be used with a non-static variable
		System.out.println(Add(num1_local,num2_local));
		System.out.println(Add(num1_static, num2_static)); 

	}
	
	public static int Add(int a, int b) {
		//static int sum; //Compilation Error: Static Variable cannot be local
		sum_static=a+b;
		return sum_static;
		
	}

}

class VarExperiment {
	
	VariableTypes type = new VariableTypes();
	
	public void printVariable() {
		System.out.println(type.num1_Instance);
		type.num1_Instance=53;
		System.out.println(type.num1_Instance);
		System.out.println(type.num1_static); //Static variable should not be accessed in a non-static manner
		type.num1_static=13;
		System.out.println(type.num1_static);
		type.Add(type.num1_Instance, type.num1_static);
	}
	
}