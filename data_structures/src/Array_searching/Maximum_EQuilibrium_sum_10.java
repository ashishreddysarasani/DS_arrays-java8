package Array_searching;

public class Maximum_EQuilibrium_sum_10 {
	public static void main(String[] args) {
		int[] arr= {-2,5,3,1,2,6,-4,2};
		int n=arr.length;
		int prefix=0,suffix=0;
				int res=Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			//int prefix=arr[i];
			for (int j = 0; j <i; j++) {
				prefix+=arr[j];
			}
			//int suffix=arr[i];
			for (int j = n-1; j >=i ; j--) {
				suffix+=arr[j];
			}
			if(prefix==suffix) {
				System.out.println(i);
				res=Math.max(suffix, res);
				System.out.println(prefix);
			}
			prefix=0;
			suffix=0;
		}
		System.out.println(res);
	}
}
