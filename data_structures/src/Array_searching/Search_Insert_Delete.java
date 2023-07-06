package Array_searching;

public class Search_Insert_Delete {
public static void main(String[] args) {
	int []arr= {1,3,8,5,2,34,4};
	int n=arr.length,key=3;
//	unsortedarr(arr,n,key);
	key=34;
	unsorteddelete(arr,n,key);
	
}

private static void unsorteddelete(int[] arr, int n, int key) {
	// TODO Auto-generated method stub
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==key) {
		//arr[i]=arr[i+1];
		delete(arr,n,i);
		//System.out.print(arr[i]+" ");
		}
	}
}

private static void delete(int[] arr, int n,int i) {
	// TODO Auto-generated method stub
	if(i<n-1) {
		arr[i]=arr[i+1];
		System.out.print(arr[i]+" "+arr[i+1]+" "
		                                +i+" "+(int)(i+1)+" "+n+" arr[6]:"+arr[6]);
		delete(arr,n,i+1);
		
	}
}

private static void unsortedarr(int[] arr, int n,int key) {
	// TODO Auto-generated method stub
	int temp=0,temp2=0;
	for (int i = 0; i < arr.length; i++) {
	if(i==key) {
		temp=arr[i];
		arr[i]=key;
	}	
	else if(i>key) {
		temp2=arr[i];
		arr[i]=temp;
		temp=temp2;
		
	}
	//System.out.print(arr[i]+ " ");
	}
	//System.out.print(arr[i]);
}
}
