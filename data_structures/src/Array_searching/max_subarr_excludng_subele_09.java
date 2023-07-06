// Java Program to find max subarray
// sum excluding some elements
package Array_searching;

import java.io.*;
/*
public class max_subarr_excludng_subele_09 {

	public static void main(String[] args) {
		int A[] = { 3, 4, 5, -4, 6 };
		int B[] = { 1, 8, 5 };

		int n = A.length;
		int m = B.length;

		// Function call
		findMaxSubarraySum(A, B, n, m);
	}
	

		
	
	// Function to check the element
	// present in array B
	static boolean isPresent(int B[], int m, int x)
	{
		for (int i = 0; i < m; i++)
			if (B[i] == x)
				return true;

		return false;
	}

	// Utility function for findMaxSubarraySum()
	// with the following parameters
	// A => Array A,
	// B => Array B,
	// n => Number of elements in Array A,
	// m => Number of elements in Array B
	static int findMaxSubarraySumUtil(int A[], int B[],
									int n, int m)
	{

		// set max_so_far to INT_MIN
		int max_so_far = Integer.MIN_VALUE, curr_max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++)
		{

			// if the element is present in B,
			// set current max to 0 and move to
			// the next element
			if (isPresent(B, m, A[i]))
			{
				curr_max = 0;
				continue;
			}

			// Proceed as in Kadane's Algorithm
			curr_max = curr_max + A[i];
			//curr_max = Math.max(A[i], curr_max + A[i]);
			max_so_far = Math.max(max_so_far, curr_max);
		}
		return max_so_far;
	}

	// Wrapper for findMaxSubarraySumUtil()
	static void findMaxSubarraySum(int A[], int B[], int n,
								int m)
	{
		int maxSubarraySum
			= findMaxSubarraySumUtil(A, B, n, m);

		// This case will occur when all
		// elements of A are present
		// in B, thus no subarray can be formed
		if (maxSubarraySum == -2147483648)
		{
			System.out.println("Maximum Subarray Sum"
							+ " "
							+ "can't be found");
		}
		else {
			System.out.println("The Maximum Subarray Sum = "
							+ maxSubarraySum);
		}
	}

	// Driver code
	
} 
*/
// This code is contributed by Ajit.


//package Array_searching;

public class max_subarr_excludng_subele_09 {
public static void main(String[] args) {
	int[] a= {3,4,5,-4,6},b= {1,8,5};
	int n=a.length,m=b.length;
	//int sum=0,max_subarr=Integer.MIN_VALUE;
	int maxsubarray=findmaxsunsubarrayutil(a,b,n,m);
	
	if(maxsubarray==Integer.MIN_VALUE) System.out.println("max arr cammot found : ");
	else System.out.println("max subarray : "+maxsubarray );
}

private static int findmaxsunsubarrayutil(int[] a, int[] b, int n, int m) {
	// TODO Auto-generated method stub
	//if( sum = max_subarr = Integer.MIN_VALUE ) then use Math.max() in adding
	int sum=Integer.MIN_VALUE,max_subarr=Integer.MIN_VALUE;
	for (int j = 0; j < a.length ; j++) {
		if(findBEle(b,m,a[j])){
			sum=0;
			continue;
		}
		//sum=sum+a[j];// sum = 0 is mandatory
		sum=Math.max(a[j], sum+a[j]);
		max_subarr=Math.max(sum, max_subarr);
	}
	System.out.println("max_subarr: "+max_subarr+" sum: "+sum);
	
	
	return max_subarr;
} 

private static boolean findBEle(int[] a, int m,int key) {
	// TODO Auto-generated method stub
	for (int i = 0; i < m; i++) {
		if(a[i]==key) return true;
	}
	return false;
}
}
