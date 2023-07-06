package Array_Rearrange;

public class Array_reverse {
	
	public static void main(String[] args) {
		int arr[]= {26,67,54,76,98,23,44,1};
		int n=arr.length,l=0,h=n-1;
				
		int temp=0;
		while(l<=h) {
			temp=arr[l];
			arr[l]=arr[h];
			arr[h]=temp;
			
			l++;
			h--;
		}
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}	
}
