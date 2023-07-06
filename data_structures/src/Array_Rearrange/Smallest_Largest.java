package Array_Rearrange;

import java.util.Arrays;

public class Smallest_Largest {
	public static void main(String[] args) {
		int arr[]= {26,67,54,76,98,23,44,1};
		int n=arr.length;
		
		smallestNlargest(arr,n);
	}

	private static void smallestNlargest(int[] arr,int n) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int temp[] = new int[n];
		int arrayindex=0;
		for(int i=0,j=n-1;i<=j;i++,j--) {
			if(arrayindex<n) {
				temp[arrayindex]=arr[i];
				arrayindex++;
			}
			if(arrayindex<n) {
				temp[arrayindex]=arr[j];
				arrayindex++;
			}
			
		}
		for(int i=0;i<n;i++) System.out.println(temp[i]);
	}
	
}
