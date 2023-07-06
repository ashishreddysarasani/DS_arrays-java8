package Array_Rearrange;

import java.util.Arrays;

public class Even_Odd {
	public static void main(String[] args) {
		
		int arr[]= {24,54,22,34,2,67,45,3,1,7};
		int n=arr.length;
		posneg(arr,n);
		System.out.println("-------------------------------------");
		posnegswap(arr,n);
	
	}

	private static void posnegswap(int[] arr, int n) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int temp=0;
		for(int i=1;i<n-1;i=i+3) {
			if(arr[i]<arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

	private static void posneg(int arr[],int n) {
		// TODO Auto-generated method stub
		int even=n/2;
		int odd=n-even;
		
		int[] temp = new int[n];
		
		Arrays.sort(arr);
		int j=0;
		for(int i=0;i<n;i=i+2) {
			temp[i]=arr[j];
			j++;
		}
		//j=odd;
		for(int i=1;i<n;i=i+2) {
			temp[i]=arr[j];
			j++;
		}
		for(int i=0;i<n;i++) {
			System.out.println(temp[i]);
		}
	}
}
