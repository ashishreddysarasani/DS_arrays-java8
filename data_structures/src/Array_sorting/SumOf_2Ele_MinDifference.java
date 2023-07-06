package Array_sorting;

import java.util.Arrays;

public class SumOf_2Ele_MinDifference {
public static void main(String[] args) {
	//int[] arr2= {1,60,-10,70,-80,85};
	int[] arr= {101,60,-10,70,-80,99};
	
	int n =arr.length;
	int min_sum=Integer.MAX_VALUE,l=0,r=n-1,sum=0,l1=0,r2=0;
	Arrays.sort(arr);
	while(l<r) {
		sum =arr[l]+arr[r];
		if(sum<min_sum) {
			min_sum=sum;
			l1=l;
			r2=r;
		}
		if(sum<0) {
			l++;
		}
		else {
			r--;
			
		}
		
	}
	System.out.println(min_sum+" "+arr[l1]+" "+arr[r2]+" "+l1+" "+r2);
	
}
}
