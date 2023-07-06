package Array_searching;

import java.util.Arrays;
import java.util.Iterator;

public class Triplet_sum_of_GivenValue_24_26 {
public static void main(String[] args) {
	int[] arr= {1,3,6,8,9,5,6,7,4};
	Arrays.sort(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	int n=arr.length,fsum=0,ssum=0,key=17,l=0,r=n-1;
	System.out.println("printing triplet values of array of key:"+key);

	for (int i = 0; i < arr.length-2; i++) {
		l=i+1;
		r=n-1;
		fsum=key-arr[i];
		while(l<r) {
			ssum=arr[l]+arr[r];
			if(ssum==fsum) System.out.println("trpletsum:"+(int)(ssum+arr[i])+"  key:"+key+"  i:"+i+"  l:"+l+"  r:"+r);
			if(ssum<fsum) {
				l++;
				
			}
			else {
				r--;
			}
		}
	}
}
}
