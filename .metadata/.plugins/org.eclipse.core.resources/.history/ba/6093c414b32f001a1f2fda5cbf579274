package patterns_forLoop;

public class HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		OuterFor:
		for(i=0;i<5;i++) {
			for(j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=5-i;j++) {
				if(i==4 && j==1) {
					break OuterFor;
				}
				System.out.print(" *");
			}
			System.out.println();
		}
		for(i=1;i<=5;i++) {
			for(j=1;j<=5-i;j++) {
				if(i==1 && j==1) {
					break;
				}
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
