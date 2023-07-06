package Array_RangeQueries;

public class ElementsLessThanEqualtoRange {
	public static void main(String[] args) {
		int[] arr= {2,3,4,5};
		int n=arr.length;
		int ele=5;
		System.out.println("elements less r eql to arr: "+findless_or_equalto_elements(arr,n,0,3,ele));
		ele=2;
		System.out.println("elements less r eql to arr: "+findless_or_equalto_elements(arr,n,0,2,ele));

	}

	private static int findless_or_equalto_elements(int[] arr, int n, int l,int h,int ele) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = l;  i<= h; i++) {
			if(arr[i]<=ele) {
				count++;
			}
		}
		return count;
	}
}
