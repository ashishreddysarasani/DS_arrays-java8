package Array_searching;

import java.util.Arrays;

public class unionAndintersection_05 {
public static void main(String[] args) {
	int[] a= {2000,2,3,4,5,7,9,13,25,45,67,78,89,4000},b= {1,2,4,7,5,8,10,11,12,13,25,45,56,87,678,900,3000};
	int[] c= {2,3,4,5,7,8,10,56,9};
	int n=a.length,m=b.length,i=0,j=0,k=c.length;
	Arrays.sort(a);
	Arrays.sort(b);
	Arrays.sort(c);
	trp_arr_intersects(a,b,c,n,m,k);
	while(i<=n&&j<=m) {
		if(i==n&&j==m) break;
		if(j==m&&i!=n||  
				(i<n&&a[i]<b[j])) {
			
			System.out.print(a[i]+" ");
			i++;
		}
		else if(i==n&&j!=m||(j<m&&b[j]<a[i])) {
			
			System.out.print(b[j]+" ");
			j++;
		}
		else if(j!=m&&i!=n||(i<n&&a[i]==b[j])){
		//else {	
		System.out.print(a[i]+" ");
			i++;
			j++;
		}
		//System.out.println("in loop: "+i+ " "+j);
	}
	System.out.println("after while loop breaks over");
}

private static void trp_arr_intersects(int[] a, int[] b, int[] c, int i, int j, int k) {
	// TODO Auto-generated method stub
	int x=0,y=0,z=0;
	while(x<i&&y<j&&z<k) {
		if(a[x]==b[y]&& b[y]==c[z]) { System.out.println(a[x]+" intersected  ");}
		
		if(a[x]<b[y]) {
			x++;
		}
		else if(b[y]<c[z]) {
			y++;
		}
		else {
			z++;
		}
	}
}
}
