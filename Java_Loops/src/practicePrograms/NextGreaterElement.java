package practicePrograms;

public class NextGreaterElement {

	//Interview Question: Fis Global
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Nge2last = -1,Nge2x;
		int[] arr = {6,1,9,4,2};
		for(int i=1;i<arr.length;i++) {
			Nge2x = arr[i];
			for(int j=i+1;j<arr.length;j++) {
					if(arr[j]>Nge2x) {
						Nge2x = arr[j];
					}
				}
			System.out.println("Next greater element to arr["+(i-1)+"] is "+Nge2x);
		}
		System.out.println("Next greater element to arr["+(arr.length-1)+"] is "+Nge2last);
		
	}
}
