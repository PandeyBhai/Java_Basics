package patterns_forLoop;

public class TriangleStar6 {
	
//				*		
//		  	  *	  *	  
//		    *	*   *
//		  *   *	  *	  *
//	    *	*	*   *   *
	

	public static void main(String[] Args){
		
		int rows = 5;
		for(int i=1;i<=rows;i++){
			for(int j=(rows-i);j>0;j--){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}