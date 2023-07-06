package Array_RangeQueries;

public class addingElementOnRanges {
	public static void main(String[] args) {
		int[] arr =new int[8];
		int n=arr.length;
		addvalue(arr,n,0,2,100);
		addvalue(arr,n,1,5,100);
		addvalue(arr,n,2,3,100);

		//startadding(arr,n);

	}

	private static void addvalue(int[] arr, int n, int i, int j, int k) {
		// TODO Auto-generated method stub
		arr[i]+=k;
		if(n-1>j) {
			arr[j+1]-=k;
		}
		//startadding(arr,n);
		//System.out.println();
	}

	private static void startadding(int[] arr, int n) {
		// TODO Auto-generated method stub
		System.out.print(" -"+(arr[0]));
		for (int i = 1; i < arr.length; i++) {
			arr[i]+=arr[i-1];
			System.out.print(" -"+arr[i]);
		}
	}
}
