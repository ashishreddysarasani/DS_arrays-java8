package Array_sorting;

public class insertionSort {
public static void main(String[] args) {
	int[] arr= {2,5,6,4,54,35,66,3,53};
	int n=arr.length;
	insertionsort(arr,n);
	
}

private static void insertionsort(int[] arr, int n) {
	// TODO Auto-generated method stub
	int key=0,j=0;
	for (int i = 1; i < arr.length; i++) {
		key=arr[i];
		j=i-1;
		while(j>=0&&arr[j]>key) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=key;
		//System.out.print(arr[i-1]+" ");

	}
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
}
}
