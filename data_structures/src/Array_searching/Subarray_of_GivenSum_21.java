package Array_searching;

public class Subarray_of_GivenSum_21 {
public static void main(String[] args) {
	int[] arr= {1,4,20,3,10,5};
	int n=arr.length,key=33;
	
	findSubaraySum(arr,n,key,0,0);
}

private static void findSubaraySum(int[] arr, int n, int key,int index,int sum) {
	// TODO Auto-generated method stub
	
		for (int i = index; i < n; i++) {

			sum+=arr[i];
			if(sum==key) System.out.println(index+" "+i+" "+sum);

			if(sum>key) {
			sum=0;
			findSubaraySum(arr,n,key,index+1,sum);
			}
			}
		}
}

