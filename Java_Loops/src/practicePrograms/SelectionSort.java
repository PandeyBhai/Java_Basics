package practicePrograms;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {36,20,1,23,5};
		int temp;
		for(int i=0;i<(arr.length-1);i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
