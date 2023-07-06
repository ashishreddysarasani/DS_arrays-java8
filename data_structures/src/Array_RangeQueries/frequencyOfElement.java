package Array_RangeQueries;

public class frequencyOfElement {
	public static void main(String[] args) {
		
		int[] arr= {2,8,6,9,8,6,8,2,11};
		int n=arr.length,l=2,r=8,e=8;
		System.out.println("freq of arr : "+findfreq(arr, n, l, r, e));
		l=2;r=5;e=6;
		System.out.println("freq of arr : "+findfreq(arr, n, l, r, e));

	}

	private static int findfreq(int[] arr, int n,int l,int r,int e) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = l-1; i < r; i++) {
			if(arr[i]==e) count++;
		}
		return count;
	}
}
