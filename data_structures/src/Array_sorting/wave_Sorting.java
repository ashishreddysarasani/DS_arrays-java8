package Array_sorting;

import java.util.Arrays;

public class wave_Sorting {
public static void main(String[] args) {
	int[] arr= {23,44,5,6,54,32,34,54,65};
	int n=arr.length;
	wavesort(arr,n);
	
	
}

private static void wavesort(int[] arr, int n) {
	// TODO Auto-generated method stub
	Arrays.sort(arr);
	for (int s = 0; s < arr.length; s++) {
		System.out.print(arr[s]+" ");
	}
	System.out.println();
	int temp=0;
	for (int i = 1; i < arr.length-1; i+=2) {
		//System.out.print(arr[i]+"        ");
		//System.out.println();
		if(arr[i]<arr[i+1]) {
			temp=arr[i+1];
			arr[i+1]=arr[i];
			arr[i]=temp;
			//System.out.print(arr[i]+" ");
		}
		System.out.print(arr[i-1]+" "+arr[i]+" ");
		
	}
	System.out.println(arr[arr.length-1]);
	
}
}
