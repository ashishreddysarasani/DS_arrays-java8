// Java program to Merge an array of
// size n into another array of size m + n
package Array_sorting;
public class merge2sortedArrays {
	/* Function to move m
	elements at the end of array
	* mPlusN[] */
	void moveToEnd(int mPlusN[], int size)
	{
		int i, j = size - 1;
		for (i = size - 1; i >= 0; i--) {
			if (mPlusN[i] != -1) {
				mPlusN[j] = mPlusN[i];
				j--;
			}
		}
		
	}

	/* Merges array N[] of
	size n into array mPlusN[]
	of size m+n*/
	void merge(int mPlusN[], int N[], int m, int n)
	{
		int i = n;

		/* Current index of i/p part of mPlusN[]*/
		int j = 0;

		/* Current index of N[]*/
		int k = 0;

		/* Current index of output mPlusN[]*/
		while (k < (m + n))
		{
			/* Take an element from mPlusN[] if
			a) value of the picked element is smaller and we
			have not reached end of it b) We have reached
			end of N[] */
			if ( 
					//(j>=(m+n)==true)
					( (j == n) || i < (m + n) && mPlusN[i] <= N[j] ) ) {
				mPlusN[k] = mPlusN[i];
				k++;
				i++;
			}
			else // Otherwise take element from N[]
			{
				mPlusN[k] = N[j];
				k++;
				j++;
			}
		}
	}

	/* Utility that prints out an array on a line */
	void printArray(int arr[], int size)
	{
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println("");
	}

	// Driver Code
	public static void main(String[] args)
	{
		merge2sortedArrays mergearray = new merge2sortedArrays();

		/* Initialize arrays */
		int mPlusN[] = { 56, 58, -1, -1, -1, 63, -1, 65, 70 };
		int N[] = { 5, 7, 9, 25 };
		int n = N.length;
		int m = mPlusN.length - n;

		/*Move the m elements at the end of mPlusN*/
		mergearray.moveToEnd(mPlusN, m + n);
		mergearray.printArray(mPlusN, m + n);

		/*Merge N[] into mPlusN[] */
		mergearray.merge(mPlusN, N, m, n);

		/* Print the resultant mPlusN */
		mergearray.printArray(mPlusN, m + n);
	}
}

// This code has been contributed by Mayank Jaiswal

/*package Array_sorting;

import java.util.Arrays;

public class merge2sortedArrays {
public static void main(String[] args) {
	int[] mplusn= {4,-1,6,7,9,23,28,-1,-1,-1,-1,65,78};
	int[] n= {3,5,77,66,89};
	int nl=n.length;
	int ml=mplusn.length-nl;
	mergearrays(mplusn,n,nl,ml);
}

private static void mergearrays(int[] mplusn, int[] n, int nl, int ml) {
	// TODO Auto-generated method stub
	//Arrays.sort(mplusn);
	Arrays.sort(n);
	int k=0;
	int j=mplusn.length-1;
	for (int i = mplusn.length-1; i >= 0; i--) {
		if(mplusn[i]!=-1) {
			swap(mplusn,j,i);
			//mplusn[j]=mplusn[i];
			j--;
		}
		
	}
	for (int l = 0; l < mplusn.length; l++) {
		System.out.print(mplusn[l]+" ");
	}
	
	j+=1;
	//if(j==nl) System.out.println("j=nl"+j);
	//System.out.println(nl+" "+ml);
	int i=0;
	while(k <(nl+ml)) {
		if(i<nl && j<(nl+ml) && n[i]<mplusn[j]) {
			mplusn[k]=n[i];
			i++;
			k++;
			
		}
		else  {
		//	mplusn[k]=mplusn[j];
			k++;
			j++;
		}
	}
	for (int l = 0; l < mplusn.length; l++) {
		System.out.print(mplusn[l]+" ");
	}
}

private static void swap(int[] a,int j,int i) {
	// TODO Auto-generated method stub
	int temp=0;
	temp=a[j];
	a[j]=a[i];
	a[i]=temp;
}
}
*/
