package Array_RangeQueries;

public class elementsBoundRanges {
	public static void main(String[] args) {
		int[] arr= {1,3,3,9,10,4,12,11,11,6,5,7};
		int n=arr.length;
		elerangebounds(arr,n,1,4);
		elerangebounds(arr,n,9,12);
		elerangebounds(arr,n,4,8);

	}

	private static void elerangebounds(int[] arr, int n, int i, int j) {
		// TODO Auto-generated method stub
		System.out.print("num of ele from query L-H: ");
		for (int j2 = 0; j2 < arr.length; j2++) {
			if(arr[j2]>=i&&arr[j2]<=j) {
				System.out.print(" "+arr[j2]);
			}
		}
		System.out.println();
	}
}
