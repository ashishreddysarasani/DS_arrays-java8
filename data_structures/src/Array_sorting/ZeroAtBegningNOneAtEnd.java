package Array_sorting;

public class ZeroAtBegningNOneAtEnd {
public static void main(String[] args) {
	int[] arr= {0,0,0,0,0,0,0,0,0,1,-1};
	int n=arr.length,j=0,temp=0,l=arr.length-1,i=arr.length;
	for (i = 0;i<=l; i++) {
		if(arr[i]==-1) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
			//i--;
			
		}
		else if(arr[i]==1) {
			temp=arr[i];
			arr[i]=arr[l];
			arr[l]=temp;
			l--;
			i--;
			
		}
		//System.out.print(arr[j]+" ");
	}
	//temp=arr[i-1];
	//arr[i-1]=arr[l+1];
	//arr[l+1]=temp;
	
	for (int k = 0; k < arr.length; k++) {
		System.out.print(arr[k]+" ");
	}
}
}
