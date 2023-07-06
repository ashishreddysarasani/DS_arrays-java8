package Array_orderstats;

public class Largest_smallest {
	public static void main(String[] args) {
		int[] arr = {43,56,44,56,55,87,98,10,9,0};
		
		int n=arr.length;
		//find3largest(arr,n);

		int f=Integer.MIN_VALUE,s=Integer.MIN_VALUE,t=Integer.MIN_VALUE;
		
		//int comp = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>f) {
				t=s;
				s=f;
				f=arr[i];
				
			}
			else if(arr[i]>s) {
				t=s;
				s=arr[i];
				
			}
			else if(arr[i]>t) {
				t=arr[i];
			}
		}
		System.out.print("first :"+f);
		System.out.print("second :"+s);
		System.out.print("third :"+t);

	}
}
