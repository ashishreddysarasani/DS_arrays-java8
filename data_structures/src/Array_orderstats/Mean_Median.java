package Array_orderstats;

public class Mean_Median {
	public static void main(String[] args) {
		int[] arr = {43,56,44,56,55,87,98,10,9,0};
		
		int n=arr.length;
		int mean=0;
		for (int i = 0; i < arr.length; i++) {
			mean+=arr[i];
		}
		mean/=arr.length;
		double median=0;
		if(n%2==0) {
		 median=(double) (((n-1)/2)+(n/2))/2;
		}
		else {
		median=n/2;
		}
		System.out.println("mean :"+mean);
		System.out.println("median :"+median);

	}
}
