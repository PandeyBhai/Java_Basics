package patterns_forLoop;

public class RightAngleNumberTriangle {

//	1
//	1	2
//	1	2	3
//	1	2	3	4
//	1	2	3	4	5
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" "+j);
			}
			System.out.println();
		}

	}

}
