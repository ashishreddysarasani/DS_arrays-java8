package Array_searching;

public class MaxSum_Triplet_22 {
public static void main(String[] args) {
	int[] a= {5,4,7,45,32,43,12,4};
	int n=a.length;
	int f=0,s=0,t=0,maxtrpl=0;
	for (int i = 0; i < a.length; i++) {
		if(f<a[i]) {
			t=s;
			s=f;
			f=a[i];
			
		}
		else if(s<a[i]) {
			t=s;
			s=a[i];
			
		}
		else {
			t=a[i];
		}
	}
	maxtrpl=f+s+t;
	System.out.println(maxtrpl);
}
}
