package Array_Rearrange;

public class Rearrange2 {
	public static void main(String[] args) {
		int arr[] = {1,3,6,8,5,4,7,3,0};
		int n=arr.length;
		rearrange(arr,n);
		for(int i =0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

	private static void rearrange(int[] arr, int n) {
		// TODO Auto-generated method stub
		//int temp;
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
			if(i==arr[j]) {
				arr[i]=j;
				
				//temp=arr[j];
				//arr[j]=arr[i];
			//	arr[i]=temp;	
			}
			}
		}	
	}
}
